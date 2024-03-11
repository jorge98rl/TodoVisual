/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.controladores;

import java.util.ArrayList;
import java.util.Scanner;
import menutodovisual.controladores.enums.MenuModificarPelicula;
import menutodovisual.controladores.interfaces.InterfazControladoresMediosVisuales;
import menutodovisual.modelos.Pelicula;
import menutodovisual.vistas.VistaPelicula;

/**
 *
 * @author jorge
 */
public class ControladorPelicula implements InterfazControladoresMediosVisuales<Pelicula> {

    private ArrayList<Pelicula> peliculas;
    MenuModificarPelicula opcion = MenuModificarPelicula.VOLVER;

    public ControladorPelicula() {
        this.peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public void registarNueva() {

        VistaPelicula vistaPelicula = new VistaPelicula();

        int codigoIdentificacion = vistaPelicula.solicitarCodigoIdentificacion();
        String titulo = vistaPelicula.solicitarTitulo();
        String director = vistaPelicula.solicitarDirector();
        int fechaLanzamiento = vistaPelicula.solicitarFechaLanzamiento();
        String genero = vistaPelicula.solicitarGenero();
        int calificacion = vistaPelicula.solicitarCalificacion();
        int presupuesto = vistaPelicula.solicitarPresupuesto();
        int duracion = vistaPelicula.solicitarDuracion();
        String productora = vistaPelicula.solicitarProductora();

        Pelicula pelicula = new Pelicula(codigoIdentificacion);

        pelicula.setTitulo(titulo);
        pelicula.setDirector(director);
        pelicula.setFechaLanzamiento(fechaLanzamiento);
        pelicula.setGenero(genero);
        pelicula.setCalificacion(calificacion);
        pelicula.setPresupuesto(presupuesto);
        pelicula.setDuracion(duracion);
        pelicula.setProductora(productora);

        this.peliculas.add(pelicula);

        vistaPelicula.leerDatosNueva(pelicula);
    }

    @Override
    public void listar() {
        VistaPelicula vistaPelicula = new VistaPelicula();
        vistaPelicula.listar(peliculas);
    }

    @Override
    public void seleccionar(ArrayList<Pelicula> peliculas) {
        VistaPelicula vistaPelicula = new VistaPelicula();
        if (peliculas.isEmpty()) {
            vistaPelicula.imprimirSeleccionVacia();
            return;
        }

        vistaPelicula.imprimirSeleccionarPorIndice();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println("Nº " + (i + 1));

            System.out.println(peliculas.get(i).getTitulo());
        }

        vistaPelicula.imprimirSeleccionNumero();
        int seleccionPelicula = scanner.nextInt();
        scanner.nextLine();

        if (seleccionPelicula < 1 || seleccionPelicula > peliculas.size()) {
            vistaPelicula.imprimirSeleccionNoValida();
            return;
        }

        Pelicula peliculaSeleccionada = peliculas.get(seleccionPelicula - 1);

        System.out.println(
                "Has seleccionado la película: " + peliculaSeleccionada.getTitulo());

        menuModificar(peliculaSeleccionada);

    }

    @Override
    public void modificar() {
        seleccionar(peliculas);
    }

    public void reproducirPelicula(ArrayList<Pelicula> peliculas) {
        VistaPelicula vistaPelicula = new VistaPelicula();
        if (peliculas.isEmpty()) {
            vistaPelicula.imprimirSeleccionVacia();
            return;
        }

        Scanner scanner = new Scanner(System.in);

        vistaPelicula.imprimirSeleccionarPorIndice();
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println("Nº " + (i + 1));

            System.out.println(peliculas.get(i).getTitulo());
        }

        vistaPelicula.imprimirSeleccionNumero();
        int seleccionPelicula = scanner.nextInt();
        scanner.nextLine();

        if (seleccionPelicula < 1 || seleccionPelicula > peliculas.size()) {
            vistaPelicula.imprimirSeleccionNoValida();
            return;
        }

        Pelicula peliculaSeleccionada = peliculas.get(seleccionPelicula - 1);

        System.out.println("Has seleccionado la película: " + peliculaSeleccionada.getTitulo());

        System.out.println(peliculaSeleccionada.reproducir());

    }

    @Override
    public void reproducir() {
        reproducirPelicula(peliculas);
    }

    @Override
    public void menuModificar(Pelicula peliculaAModificar) {

        do {
            ejecutarMenuModificarPelicula(peliculaAModificar);
        } while (this.opcion != MenuModificarPelicula.VOLVER);
    }

    private void ejecutarMenuModificarPelicula(Pelicula peliculaAModificar) {
        VistaPelicula vistaPelicula = new VistaPelicula();

        do {
            MenuModificarPelicula.imprimirValoresParaMenu();
            this.opcion = MenuModificarPelicula.valueOf(
                    vistaPelicula.seleccionarOpcionMenuModificar());
        } while (this.opcion == null);

        switch (opcion) {
            case MODIFICAR_TITULO:
                peliculaAModificar.setTitulo(
                        vistaPelicula.solicitarNuevoTitulo());
                break;
            case MODIFICAR_DIRECTOR:
                peliculaAModificar.setDirector(
                        vistaPelicula.solicitarNuevoDirector());
                break;
            case MODIFICAR_FECHA_LANZAMIENTO:
                peliculaAModificar.setFechaLanzamiento(
                        vistaPelicula.solicitarNuevaFechaLanzamiento());
                break;
            case MODIFICAR_GENERO:
                peliculaAModificar.setGenero(
                        vistaPelicula.solicitarNuevoGenero());
                break;
            case MODIFICAR_CALIFICACION:
                peliculaAModificar.setCalificacion(
                        vistaPelicula.solicitarNuevaCalificacion());
                break;
            case MODIFICAR_PRESUPUESTO:
                peliculaAModificar.setPresupuesto(
                        vistaPelicula.solicitarNuevoPresupuesto());
                break;
            case MODIFICAR_DURACION:
                peliculaAModificar.setDuracion(
                        vistaPelicula.solicitarDuracion());
                break;
            case MODIFICAR_PRODUCTORA:
                peliculaAModificar.setProductora(
                        vistaPelicula.solicitarNuevaProductora());
                break;
            case VOLVER:
                vistaPelicula.imprimirVolverMenuPrincipalDelPrograma();

                break;
            default:
                vistaPelicula.imprimirOpcionMenuModificarNoExiste();
        }
    }

}

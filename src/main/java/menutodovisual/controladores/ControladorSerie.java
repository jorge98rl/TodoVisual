/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.controladores;

import java.util.ArrayList;
import java.util.Scanner;
import menutodovisual.controladores.enums.MenuModificarSerie;
import menutodovisual.controladores.interfaces.InterfazControladoresMediosVisuales;
import menutodovisual.modelos.Serie;
import menutodovisual.vistas.VistaSerie;

/**
 *
 * @author Usuario
 */
public class ControladorSerie implements InterfazControladoresMediosVisuales<Serie> {

    private ArrayList<Serie> series;
    MenuModificarSerie opcion = MenuModificarSerie.VOLVER;

    public ControladorSerie() {
        this.series = new ArrayList<>();
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }

    @Override
    public void registarNueva() {
        VistaSerie vistaSerie = new VistaSerie();

        int codigoIdentificacion = vistaSerie.solicitarCodigoIdentificacion();
        String titulo = vistaSerie.solicitarTitulo();
        String director = vistaSerie.solicitarDirector();
        String genero = vistaSerie.solicitarGenero();
        int fechaLanzamiento = vistaSerie.solicitarFechaLanzamiento();
        int numeroTemporadas = vistaSerie.solicitarNumeroTemporadas();
        int episodiosTemporada = vistaSerie.solicitarEpisodiosPorTemporada();
        int duracionEpisodios = vistaSerie.solicitarDuracionEpisodios();
        String idiomaOriginal = vistaSerie.solicitarIdiomaOriginal();

        Serie serie = new Serie(codigoIdentificacion);

        serie.setTitulo(titulo);
        serie.setDirector(director);
        serie.setGenero(genero);
        serie.setFechaLanzamiento(fechaLanzamiento);
        serie.setNumeroTemporadas(numeroTemporadas);
        serie.setNumeroEpisodiosTemporada(episodiosTemporada);
        serie.setDuracionEpisodio(duracionEpisodios);
        serie.setIdiomaOriginal(idiomaOriginal);

        this.series.add(serie);

        vistaSerie.leerDatosNueva(serie);
    }

    @Override
    public void seleccionar(ArrayList<Serie> series) {
        VistaSerie vistaSerie = new VistaSerie();
        if (series.isEmpty()) {
            vistaSerie.imprimirSeleccionVacia();
            return;
        }

        vistaSerie.imprimirSeleccionarPorIndice();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < series.size(); i++) {
            System.out.println("Nº " + (i + 1));

            System.out.println(series.get(i).getTitulo());
        }

        vistaSerie.imprimirSeleccionNumero();
        int selecccionSerie = scanner.nextInt();
        scanner.nextLine();

        if (selecccionSerie < 1 || selecccionSerie > series.size()) {
            vistaSerie.imprimirSeleccionNoValida();
            return;
        }

        Serie serieSeleccionada = series.get(selecccionSerie - 1);

        System.out.println(
                "Has seleccionado la serie: " + serieSeleccionada.getTitulo());

        menuModificar(serieSeleccionada);

    }

    @Override
    public void modificar() {
        seleccionar(series);
    }
    
    public void reproducirSerie(ArrayList<Serie> series) {
        VistaSerie vistaSerie = new VistaSerie();
        if (series.isEmpty()) {
            vistaSerie.imprimirSeleccionVacia();
            return;
        }

        Scanner scanner = new Scanner(System.in);

        vistaSerie.imprimirSeleccionarPorIndice();
        for (int i = 0; i < series.size(); i++) {
            System.out.println("Nº " + (i + 1));

            System.out.println(series.get(i).getTitulo());
        }

        vistaSerie.imprimirSeleccionNumero();
        int seleccionSerie = scanner.nextInt();
        scanner.nextLine();

        if (seleccionSerie < 1 || seleccionSerie > series.size()) {
            vistaSerie.imprimirSeleccionNoValida();
            return;
        }

        Serie serieSeleccionada = series.get(seleccionSerie - 1);

        System.out.println("Has seleccionado la película: " + serieSeleccionada.getTitulo());

        System.out.println(serieSeleccionada.reproducir());

    }
    
    @Override
    public void reproducir() {
       reproducirSerie(series);
    }

    @Override
    public void listar() {

        VistaSerie vistaSerie = new VistaSerie();
        vistaSerie.listar(series);
    }

    @Override
    public void menuModificar(Serie serieAModificar) {
        do {
            ejecutarMenuModificarSerie(serieAModificar);
        } while (this.opcion != MenuModificarSerie.VOLVER);
    }

    private void ejecutarMenuModificarSerie(Serie serieAModificar) {
        VistaSerie vistaSerie = new VistaSerie();

        do {
            MenuModificarSerie.imprimirValoresParaMenu();
            this.opcion = MenuModificarSerie.valueOf(
                    vistaSerie.seleccionarOpcionMenuModificar());
        } while (this.opcion == null);

        switch (opcion) {
            case MODIFICAR_TITULO:
                serieAModificar.setTitulo(
                        vistaSerie.solicitarNuevoTitulo());
                break;
            case MODIFICAR_DIRECTOR:
                serieAModificar.setDirector(
                        vistaSerie.solicitarNuevoDirector());
                break;
            case MODIFICAR_FECHA_LANZAMIENTO:
                serieAModificar.setFechaLanzamiento(
                        vistaSerie.solicitarNuevaFechaLanzamiento());
                break;
            case MODIFICAR_GENERO:
                serieAModificar.setGenero(
                        vistaSerie.solicitarNuevoGenero());
                break;
            case MODIFICAR_NUMERO_TEMPORADAS:
                serieAModificar.setNumeroTemporadas(
                        vistaSerie.solicitarNuevoNumeroTemporadas());
                break;
            case MODIFICAR_NUMERO_EPISODIOS_TEMPORADA:
                serieAModificar.setNumeroEpisodiosTemporada(
                        vistaSerie.solicitarNuevosEpisodiosPorTemporada());
                break;
            case MODIFICAR_DURACION_EPISODIO:
                serieAModificar.setDuracionEpisodio(
                        vistaSerie.solicitarNuevaDuracionEpisodios());
                break;
            case MODIFICAR_IDIOMA_ORIGINAL:
                serieAModificar.setIdiomaOriginal(
                        vistaSerie.solicitarNuevoIdiomaOriginal());
                break;
            case VOLVER:
                vistaSerie.imprimirVolverMenuPrincipalDelPrograma();

                break;
            default:
                vistaSerie.imprimirOpcionMenuModificarNoExiste();
        }
    }
}

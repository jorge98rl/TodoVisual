/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.vistas;

import java.util.ArrayList;
import java.util.Scanner;
import menutodovisual.modelos.Pelicula;
import menutodovisual.vistas.interfaces.InterfazVistasMediosVisuales;

/**
 *
 * @author Usuario
 */
public class VistaPelicula implements InterfazVistasMediosVisuales<Pelicula> {

    public int solicitarCodigoIdentificacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código de identifación de la película:");

        return scanner.nextInt();
    }

    @Override
    public String solicitarTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la película:");

        return scanner.nextLine();
    }

    @Override
    public String solicitarDirector() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del director:");

        return scanner.nextLine();
    }

    @Override
    public int solicitarFechaLanzamiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año de estreno:");

        return scanner.nextInt();
    }

    @Override
    public String solicitarGenero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el género de la película:");

        return scanner.nextLine();
    }

    public int solicitarCalificacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación:");

        return scanner.nextInt();
    }

    public int solicitarPresupuesto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el presupuesto:");
        return scanner.nextInt();
    }

    public int solicitarDuracion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la duración de la película en minutos:");

        return scanner.nextInt();
    }

    public String solicitarProductora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la productora:");

        return scanner.nextLine();
    }

    public void imprimirSeleccionarPorIndice() {

        System.out.println("Selecciona una película por su índice:");
    }

    public void imprimirSeleccionVacia() {
        System.out.println("No hay ninguna película para seleccionar...");
    }

    public void imprimirSeleccionNumero() {
        System.out.print("Ingrese el número de la película que desea seleccionar: ");
    }
    
    public void imprimirSeleccionNoValida(){
        System.out.println("Selección no válida");
    }

    @Override
    public void listar(ArrayList<Pelicula> peliculas) {

        if (peliculas.isEmpty()) {
            System.out.println("No hay películas que listar...");
        } else {
            int i = 1;

            for (Pelicula pelicula : peliculas) {
                System.out.println("Nº " + i);
                System.out.println(pelicula.datosParaMostrar());
                i++;
            }
        }
    }

    @Override
    public void leerDatosNueva(Pelicula peliculas) {

        System.out.println("Pelicula agregada con éxito!!");

    }

    @Override
    public int leerMedioAudioVisual() {
        Scanner sca = new Scanner(System.in);

        return sca.nextInt();
    }

    @Override
    public void mostrarNoEncontrado() {
        System.out.println("No se ha encontrado la película solicitada...");
    }

    @Override
    public int seleccionarOpcionMenuModificar() {
        Scanner sca = new Scanner(System.in);

        return sca.nextInt();
    }

    @Override
    public void imprimirVolverMenuPrincipalDelPrograma() {
        System.out.println("Modificación de la película realizada, volviendo al menú principal...");
    }

    @Override
    public void imprimirOpcionMenuModificarNoExiste() {
        System.out.println("La opción seleccionada del menú de modificar placa base no existe...");

    }

    @Override
    public String solicitarNuevoTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la película:");

        return scanner.nextLine();
    }

    @Override
    public String solicitarNuevoDirector() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del director:");

        return scanner.nextLine();
    }

    @Override
    public int solicitarNuevaFechaLanzamiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año de estreno:");

        return scanner.nextInt();
    }

    @Override
    public String solicitarNuevoGenero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el género de la película:");

        return scanner.nextLine();
    }

    public int solicitarNuevaCalificacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación:");

        return scanner.nextInt();
    }

    public int solicitarNuevoPresupuesto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el presupuesto:");
        return scanner.nextInt();
    }

    public int solicitarNuevaDuracion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la duración de la película en minutos:");

        return scanner.nextInt();
    }

    public String solicitarNuevaProductora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la productora:");

        return scanner.nextLine();
    }

    
}

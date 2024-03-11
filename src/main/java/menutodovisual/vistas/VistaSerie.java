/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.vistas;

import java.util.ArrayList;
import java.util.Scanner;
import menutodovisual.modelos.Serie;
import menutodovisual.vistas.interfaces.InterfazVistasMediosVisuales;

/**
 *
 * @author Usuario
 */
public class VistaSerie implements InterfazVistasMediosVisuales<Serie> {

    public int solicitarCodigoIdentificacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código de identificación de la serie:");

        return scanner.nextInt();
    }

    @Override
    public String solicitarTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la serie:");

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

    public int solicitarNumeroTemporadas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de temporadas:");
        return scanner.nextInt();
    }

    public int solicitarEpisodiosPorTemporada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el de episodios de temporadas:");
        return scanner.nextInt();
    }

    public int solicitarDuracionEpisodios() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la duración de los episodios (minutos):");
        return scanner.nextInt();
    }

    public String solicitarIdiomaOriginal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el idioma original de la serie:");
        return scanner.nextLine();
    }

   
     public void imprimirSeleccionarPorIndice() {

        System.out.println("Selecciona una serie por su índice:");
    }

    public void imprimirSeleccionVacia() {
        System.out.println("No hay ninguna serie para seleccionar...");
    }

    public void imprimirSeleccionNumero() {
        System.out.print("Ingrese el número de la serie que desea seleccionar: ");
    }
    
    public void imprimirSeleccionNoValida(){
        System.out.println("Selección no válida");
    }

    @Override
    public void listar(ArrayList<Serie> series) {
        if (series.isEmpty()) {
            System.out.println("No hay series que listar...");
        } else {
            int i = 1;

            for (Serie serie : series) {
                System.out.println("Nº " + i);
                System.out.println(serie.datosParaMostrar());
                i++;
            }
        }
    }

    @Override
    public void leerDatosNueva(Serie serie) {
        System.out.println("¡¡Serie agregada con éxito!!");
    }

    @Override
    public int leerMedioAudioVisual() {

        Scanner sca = new Scanner(System.in);

        return sca.nextInt();
    }

    @Override
    public void mostrarNoEncontrado() {

        System.out.println("No se ha encontrado la serie solicitada...");
    }

    @Override
    public int seleccionarOpcionMenuModificar() {

        Scanner sca = new Scanner(System.in);

        return sca.nextInt();
    }

    @Override
    public void imprimirVolverMenuPrincipalDelPrograma() {
        System.out.println("Modificación de la serie realizada, volviendo al menú principal...");
    }

    @Override
    public void imprimirOpcionMenuModificarNoExiste() {

        System.out.println("La opción seleccionada del menú de modificar la serie no existe...");
    }

    @Override
    public String solicitarNuevoTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la serie:");

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
        System.out.println("Ingrese el género de la serie:");

        return scanner.nextLine();
    }

    public int solicitarNuevoNumeroTemporadas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de temporadas:");
        return scanner.nextInt();
    }

    public int solicitarNuevosEpisodiosPorTemporada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el de episodios de temporadas:");
        return scanner.nextInt();
    }

    public int solicitarNuevaDuracionEpisodios() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la duración de los episodios (minutos):");
        return scanner.nextInt();
    }

    public String solicitarNuevoIdiomaOriginal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el idioma original de la serie:");
        return scanner.nextLine();
    }
}

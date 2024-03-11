/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.vistas;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class VistaMenuPrincipal {


    public static int seleccionarOpcion() {
        Scanner sca = new Scanner(System.in);

        return sca.nextInt();
    }

    public static void imprimirSalirDelPrograma() {
        System.out.println("Cerrando el programa...");
    }

    public static void imprimirOpcionNoExiste() {
        System.out.println("La opción seleccionada no existe...");
    }
}

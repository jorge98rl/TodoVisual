/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package menutodovisual.vistas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaMedioVisual {

    public static int seleccionarTipoMedioAudioVisual(){
    Scanner sca = new Scanner(System.in);
    
    return sca.nextInt();
    }
    
    public static void imprimirTipoMedioAudioVisualNoExiste(){
        System.out.println("El tipo de medio audio visual seleccionado no existe...");
    }
}

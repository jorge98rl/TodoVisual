/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import menutodovisual.controladores.ControladorMenu;
import menutodovisual.controladores.ControladorMedioVisual;

/**
 *
 * @author jorge
 */
public class TodoVisual {

    public static void main(String[] args) {
        /*En mi caso voy a elegir ArrayList, mi forma de manejarme con esta opción 
        me da menos conflicto y es más útil, ya que su forma de almacenar es dinámica 
        y a diferencia del HashMap, viene de manera ordenada,ya que se accede por el índice*/

        ControladorMedioVisual controladorMedioVisual = new ControladorMedioVisual();
        ControladorMenu controladorMenu = new ControladorMenu();
        controladorMenu.menu(controladorMedioVisual);
    }
}

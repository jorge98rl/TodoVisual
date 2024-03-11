/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.controladores;

/**
 *
 * @author jorge
 */
import menutodovisual.controladores.enums.MenuPrincipal;
import menutodovisual.vistas.VistaMenuPrincipal;

public class ControladorMenu {

  MenuPrincipal opcion = MenuPrincipal.SALIR;
    
    public void menu(ControladorMedioVisual controladorMedioVisual) {
        do {
            ejecutarMenu(controladorMedioVisual);
        } while(opcion != MenuPrincipal.SALIR);
    }
    
    public void ejecutarMenu(ControladorMedioVisual controladorMedioVisual) {
        do {
            MenuPrincipal.imprimirValoresParaMenu();
            opcion = MenuPrincipal.valueOf(VistaMenuPrincipal.seleccionarOpcion());
        } while(opcion == null);

        switch(opcion) {
            case REGISTRAR_MEDIO_VISUAL:
                controladorMedioVisual.registarNuevo();

                break;
            case MODIFICAR_MEDIO_VISUAL:
                controladorMedioVisual.modificar();

                break;
            case LISTAR_MEDIO_VISUAL:
                controladorMedioVisual.listar();

                break;
            case REPRODUCIR_MEDIO_VISUAL:
                controladorMedioVisual.reproducir();

                break;
            case SALIR:
                VistaMenuPrincipal.imprimirSalirDelPrograma();

                break;
            default:
                VistaMenuPrincipal.imprimirOpcionNoExiste();
        }
    }
    

}

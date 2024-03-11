/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.controladores.enums;

/**
 *
 * @author Usuario
 */
public enum MenuPrincipal {

    REGISTRAR_MEDIO_VISUAL(1, "Registrar Medio Visual"),
    MODIFICAR_MEDIO_VISUAL(2, "Modificar Medio Visual"),
    LISTAR_MEDIO_VISUAL(3, "Listar Medio Visual"),
    REPRODUCIR_MEDIO_VISUAL(4, "Reproducir Medio Visual"),
    SALIR(4, "Salir del programa");

    private int idOpcion;
    private String nombreOpcion;

    private MenuPrincipal(int idOpcion, String nombreOpcion) {
        this.idOpcion = idOpcion;
        this.nombreOpcion = nombreOpcion;
    }

    public int getIdOpcion() {
        return idOpcion;
    }

    public String getNombreOpcion() {
        return nombreOpcion;
    }

    public static void imprimirValoresParaMenu() {

        System.out.println("Indique el número de la opción deseada:");

        for (MenuPrincipal menuPrincipal : MenuPrincipal.values()) {
            System.out.println(
                    menuPrincipal.getIdOpcion()
                    + ". "
                    + menuPrincipal.getNombreOpcion());
        }

    }

    public static MenuPrincipal valueOf(int idOpcion) {
        for (MenuPrincipal menuPrincipal : MenuPrincipal.values()) {
            if (menuPrincipal.getIdOpcion() == idOpcion) {
                return menuPrincipal;
            }
        }

        return null;
    }
}

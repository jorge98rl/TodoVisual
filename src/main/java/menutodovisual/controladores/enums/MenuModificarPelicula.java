/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.controladores.enums;

/**
 *
 * @author Usuario
 */
public enum MenuModificarPelicula {

    MODIFICAR_TITULO(1, "Modificar el título"),
    MODIFICAR_DIRECTOR(2, "Modificar el director"),
    MODIFICAR_FECHA_LANZAMIENTO(3, "Modificar la fecha de lanzamiento"),
    MODIFICAR_GENERO(4, "Modificar el género"),
    MODIFICAR_CALIFICACION(5, "Modificar la calificación"),
    MODIFICAR_PRESUPUESTO(6, "Modificar presupuesto"),
    MODIFICAR_DURACION(7,"Modificar duración"),
    MODIFICAR_PRODUCTORA(8,"Modificar productora"),
    VOLVER(9, "Volver al menú principal");

    private int idOpcion;
    private String nombreOpcion;

    private MenuModificarPelicula(int idOpcion, String nombreOpcion) {
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

        for (MenuModificarPelicula menuModificarPelicula : MenuModificarPelicula.values()) {
            System.out.println(
                    menuModificarPelicula.getIdOpcion()
                    + "."
                    + menuModificarPelicula.getNombreOpcion());
        }
    }
    
    public static MenuModificarPelicula valueOf(int idOpcion){
        for(MenuModificarPelicula menuModificarPelicula : MenuModificarPelicula.values()){
            if(menuModificarPelicula.getIdOpcion() == idOpcion){
                return menuModificarPelicula; 
            }
        }
        
        return null; 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package menutodovisual.controladores.enums;

/**
 *
 * @author Usuario
 */
public enum MenuModificarSerie {

    MODIFICAR_TITULO(1, "Modificar el título"),
    MODIFICAR_DIRECTOR(2, "Modificar el director"),
    MODIFICAR_FECHA_LANZAMIENTO(3, "Modificar la fecha de lanzamiento"),
    MODIFICAR_GENERO(4, "Modificar el género"),
    MODIFICAR_NUMERO_TEMPORADAS(5, "Modificar la calificación"),
    MODIFICAR_NUMERO_EPISODIOS_TEMPORADA(6, "Modificar presupuesto"),
    MODIFICAR_DURACION_EPISODIO(7,"Modificar duración"),
    MODIFICAR_IDIOMA_ORIGINAL(8,"Modificar productora"),
    VOLVER(9, "Volver al menú principal");

    private int idOpcion;
    private String nombreOpcion;

    private MenuModificarSerie(int idOpcion, String nombreOpcion) {
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

        for (MenuModificarSerie menuModificarSerie : MenuModificarSerie.values()) {
            System.out.println(
                    menuModificarSerie.getIdOpcion()
                    + "."
                    + menuModificarSerie.getNombreOpcion());
        }
    }
    
    public static MenuModificarSerie valueOf(int idOpcion){
        for(MenuModificarSerie menuModificarSerie : MenuModificarSerie.values()){
            if(menuModificarSerie.getIdOpcion() == idOpcion){
                return menuModificarSerie; 
            }
        }
        
        return null; 
    }
}

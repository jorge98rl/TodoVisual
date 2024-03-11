/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.modelos.enums;

/**
 *
 * @author Usuario
 */
public enum TipoMedioAudioVisual {

    PELICULA(1, "Pelicula"),
    SERIE(2, "Serie");

    private int idTipoMedioAudioVisual;
    private String nombreTipoMedioAudioVisual;

    private TipoMedioAudioVisual(int idTipoMedioAudioVisual, String nombreTipoMedioAudioVisual) {
        this.idTipoMedioAudioVisual = idTipoMedioAudioVisual;
        this.nombreTipoMedioAudioVisual = nombreTipoMedioAudioVisual;
    }

    public int getidTipoMedioAudioVisual() {
        return idTipoMedioAudioVisual;
    }


    public String getnombreTipoMedioAudioVisual() {
        return nombreTipoMedioAudioVisual;
    }

    public static void imprimirValoresParaMenu() {
        System.out.println("Indique el número de la opción deseada:");
        
        for (TipoMedioAudioVisual tipoMedioAudioVisual : TipoMedioAudioVisual.values()) {
            System.out.println(
                    tipoMedioAudioVisual.getidTipoMedioAudioVisual()+ 
                    ". " + 
                    tipoMedioAudioVisual.getnombreTipoMedioAudioVisual());
        }
    }
    
    public static TipoMedioAudioVisual valueOf(int idTipoMedioAudioVisual){
        for(TipoMedioAudioVisual tipoMedioAudioVisual: TipoMedioAudioVisual.values()){
            if (tipoMedioAudioVisual.getidTipoMedioAudioVisual() == idTipoMedioAudioVisual){
                return tipoMedioAudioVisual; 
            }
        }
        
        return null; 
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.controladores;

import menutodovisual.modelos.enums.TipoMedioAudioVisual;
import menutodovisual.vistas.VistaMedioVisual;

/**
 *
 * @author Usuario
 */
public class ControladorMedioVisual {

    ControladorPelicula controladorPeliculas;
    ControladorSerie controladorSeries;

    public ControladorMedioVisual() {
        controladorPeliculas = new ControladorPelicula();
        controladorSeries = new ControladorSerie();
    }

    public ControladorPelicula getControladorPeliculas() {
        return controladorPeliculas;
    }

    public void setControladorPeliculas(ControladorPelicula controladorPeliculas) {
        this.controladorPeliculas = controladorPeliculas;
    }

    public ControladorSerie getControladorSeries() {
        return controladorSeries;
    }

    public void setControladorSeries(ControladorSerie controladorSeries) {
        this.controladorSeries = controladorSeries;
    }

    public void registarNuevo() {
        TipoMedioAudioVisual opcion = null;

        do {
            TipoMedioAudioVisual.imprimirValoresParaMenu();
            opcion = TipoMedioAudioVisual.valueOf(
                    VistaMedioVisual.seleccionarTipoMedioAudioVisual()
            );
        } while (opcion == null);

        switch (opcion) {
            case PELICULA:
                this.controladorPeliculas.registarNueva();
                break;
            case SERIE:
                this.controladorSeries.registarNueva();
                break;

            default:
                VistaMedioVisual.imprimirTipoMedioAudioVisualNoExiste();
        }
    }

    public void modificar(){
        TipoMedioAudioVisual opcion = null;
        
        do {
            TipoMedioAudioVisual.imprimirValoresParaMenu();
            opcion = TipoMedioAudioVisual.valueOf(VistaMedioVisual.seleccionarTipoMedioAudioVisual());
        } while(opcion == null);
        
        switch(opcion) {
            case PELICULA:
                this.controladorPeliculas.modificar();

                break;
            case SERIE:
                this.controladorSeries.modificar();

                break;
            default:
                VistaMedioVisual.imprimirTipoMedioAudioVisualNoExiste();
        }
    }
    
    public void listar() {
        TipoMedioAudioVisual opcion = null;
        
        do {
            TipoMedioAudioVisual.imprimirValoresParaMenu();
            opcion = TipoMedioAudioVisual.valueOf(VistaMedioVisual.seleccionarTipoMedioAudioVisual());
        } while(opcion == null);
        
        switch(opcion) {
            case PELICULA:
                this.controladorPeliculas.listar();

                break;
            case SERIE:
                this.controladorSeries.listar();

                break;
            default:
                VistaMedioVisual.imprimirTipoMedioAudioVisualNoExiste();
        }
    }
    
    public void reproducir(){
        TipoMedioAudioVisual opcion = null; 
        
         do {
            TipoMedioAudioVisual.imprimirValoresParaMenu();
            opcion = TipoMedioAudioVisual.valueOf(VistaMedioVisual.seleccionarTipoMedioAudioVisual());
        } while(opcion == null);
         
         switch(opcion){
             case PELICULA: 
                 this.controladorPeliculas.reproducir();
                 break; 
                 
             case SERIE:
                 this.controladorSeries.reproducir();
                 
                 break; 
             default:
                 VistaMedioVisual.imprimirTipoMedioAudioVisualNoExiste();
         }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package menutodovisual.controladores.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 * @param <MedioAudioVisual>
 */
public interface InterfazControladoresMediosVisuales<MedioAudioVisual> {

    public void registarNueva();

    public void modificar();

    public void seleccionar(ArrayList<MedioAudioVisual> medioAudioVisual);
    
    public void reproducir();

    public void listar();

    public void menuModificar(MedioAudioVisual medioAudioVisualAModificar);

}

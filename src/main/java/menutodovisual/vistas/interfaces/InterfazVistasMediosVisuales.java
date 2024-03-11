/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package menutodovisual.vistas.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 * @param <MedioAudioVisual>
 */
public interface InterfazVistasMediosVisuales<MedioAudioVisual> {

    public void listar(ArrayList<MedioAudioVisual> medioAudioVisual);

    public String solicitarTitulo();

    public String solicitarDirector();

    public int solicitarFechaLanzamiento();

    public String solicitarGenero();

    public String solicitarNuevoTitulo();

    public String solicitarNuevoDirector();

    public int solicitarNuevaFechaLanzamiento();

    public String solicitarNuevoGenero();
   
    public void leerDatosNueva(MedioAudioVisual medioAudioVisual);

    public int leerMedioAudioVisual();

    public void mostrarNoEncontrado();

    public int seleccionarOpcionMenuModificar();

    public void imprimirVolverMenuPrincipalDelPrograma();

    public void imprimirOpcionMenuModificarNoExiste();

}

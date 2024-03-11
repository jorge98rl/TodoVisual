/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.modelos;

/**
 *
 * @author Usuario
 */
public abstract class MedioAudioVisual {

    private int codigoIdentitifacion;  
    private String titulo;
    private String director;
    private int fechaLanzamiento;
    private String genero;

    public MedioAudioVisual(int codigoIdentitifacion) {
        this.codigoIdentitifacion = codigoIdentitifacion; 
    }

    public int getCodigoIdentitifacion() {
        return codigoIdentitifacion;
    }

    public void setCodigoIdentitifacion(int codigoIdentitifacion) {
        this.codigoIdentitifacion = codigoIdentitifacion;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String datosParaMostrar() {
        String datos = "";

        datos += "Título: " + this.titulo + "\n";
        datos += "Director: " + this.director + "\n";
        datos += "Fecha de Lanzamiento: " + this.fechaLanzamiento + "\n";
        datos += "Género: " + this.genero + "\n";

        return datos;
    }

    abstract public String reproducir();

}

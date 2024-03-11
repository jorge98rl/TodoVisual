/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutodovisual.modelos;

/**
 *
 * @author Usuario
 */
public class Serie extends MedioAudioVisual {

    private int numeroTemporadas;
    private int numeroEpisodiosTemporada;
    private int duracionEpisodio;
    private String idiomaOriginal;

    public Serie(int codigoIdentificacion) {
        super(codigoIdentificacion);
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisodiosTemporada() {
        return numeroEpisodiosTemporada;
    }

    public void setNumeroEpisodiosTemporada(int numeroEpisodiosTemporada) {
        this.numeroEpisodiosTemporada = numeroEpisodiosTemporada;
    }

    public int getDuracionEpisodio() {
        return duracionEpisodio;
    }

    public void setDuracionEpisodio(int duracionEpisodio) {
        this.duracionEpisodio = duracionEpisodio;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    @Override
    public String datosParaMostrar() {
        String datos = "";

        datos += "|-----------------------------------------|\n";
        datos += super.datosParaMostrar();
        datos += "Número de temporadas: " + this.numeroTemporadas + "\n";
        datos += "Número de episodios por temporada: " + this.numeroEpisodiosTemporada + "\n";
        datos += "Duración de cada episodio: " + this.duracionEpisodio + "\n";
        datos += "Idioma original de la serie: " + this.idiomaOriginal + "\n";
        datos += "|------------------------------------------|\n";
        return datos;
    }

    @Override
    public String reproducir() {
        return "Hazte las palomitas que ya ha empezado...";
    }

}

package menutodovisual.modelos;

public class Pelicula extends MedioAudioVisual {

    private int calificacion;
    private int presupuesto;
    private int duracion;
    private String productora;

    public Pelicula(int codigoIdentificacion) {
        super(codigoIdentificacion);
    }

    
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    @Override
    public String datosParaMostrar() {
        String datos = "";
        datos += "|-----------------------------------|\n";
        datos += super.datosParaMostrar();
        datos += "Calificación: " + this.calificacion + "\n";
        datos += "Presupuesto: " + this.presupuesto + "\n";
        datos += "Duración: " + this.duracion + "\n";
        datos += "Productora: " + this.productora + "\n";
        datos += "|-----------------------------------|\n";
        return datos;
    }

    @Override
    public String reproducir() {
        return "Ponte cómodo que empezamos después del anuncio...";
    }

}

package tarea1;

public class Libro {

    //*ZONA DE ATRIBUTOS
    private String titulo;
    private double costoPublicacion;


    public Libro() {
        this.titulo = "GUERRA MUNDIAL Z";
        this.costoPublicacion = 400;
    }

    public Libro(String tituloDesdeAFuera) {
        this.titulo = tituloDesdeAFuera;
        this.costoPublicacion = 3500;
    }

    public Libro(String titulo, double costoDefault) {
        this.titulo = titulo;
        this.costoPublicacion = costoDefault;
    }

    public double calcularPrecioVenta() {
        return this.titulo.length() * 50;
    }


    //OVERLOAD - poliformismo

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCostoPublicacion() {
        return costoPublicacion;
    }

    public void setCostoPublicacion(double costoPublicacion) {
        this.costoPublicacion = costoPublicacion;
    }
}
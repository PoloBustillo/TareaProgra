package tarea1;

public class LibroPublicado extends Libro {
    private String editorial;

    public LibroPublicado(String titulo, double costoDePublicacion, String editorial) {
        //SUPER
        super(titulo, costoDePublicacion);
        this.editorial = editorial;
    }

    public LibroPublicado(String titulo, String editorial) {
        //SUPER
        super(titulo);
        this.editorial = editorial;
    }

    @Override
    public double calcularPrecioVenta() {
        return (getTitulo().length() * 50) * 2;
    }


    public double calcularPrecioVenta(double desc) {
        return ((getTitulo().length() * 50) * 2) * desc;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}

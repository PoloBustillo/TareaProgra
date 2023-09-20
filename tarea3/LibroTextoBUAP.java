package tarea3;

public class LibroTextoBUAP extends Libro {

    private String facultad;

    public LibroTextoBUAP(String titulo, String autores, double precio) {
        super(titulo, autores, precio);
    }

    public LibroTextoBUAP(String titulo, String autores, double precio, String facultad) {
        super(titulo, autores, precio);
        this.facultad = facultad;
    }

    public void imprimePrecioLibroTextoBUAP() {
        imprimePrecioLibro();
        System.out.println("facultad = " + facultad);
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}

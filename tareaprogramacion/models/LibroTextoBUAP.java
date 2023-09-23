package tareaprogramacion.models;

public class LibroTextoBUAP extends LibroTexto {

    private String facultad;

    public LibroTextoBUAP(String titulo, String[] autores, double precio, String curso) {
        super(titulo, autores, precio, curso);
    }

    public LibroTextoBUAP(String titulo, String[] autores, double precio, String curso, String facultad) {
        super(titulo, autores, precio, curso);
        this.facultad = facultad;
    }

    public void imprimePrecioLibroTextoBUAP() {
        imprimePrecioLibroTexto();
        System.out.println("facultad = " + facultad);
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}

package tarea4;

public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto(String titulo, String autores, double precio) {
        super(titulo, autores, precio);
    }

    public LibroTexto(String titulo, String autores, double precio, String curso) {
        super(titulo, autores, precio);
        this.curso = curso;
    }


    public void imprimePrecioLibroTexto() {
        imprimePrecioLibro();
        System.out.println("curso = " + curso);
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

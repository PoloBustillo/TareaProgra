package tarea3;

public class Novelas extends Libro {

    private String tema;

    public Novelas(String titulo, String autores, double precio) {
        super(titulo, autores, precio);
    }

    public Novelas(String titulo, String autores, double precio, String tema) {
        super(titulo, autores, precio);
        this.tema = tema;
    }

    public void imprimePrecioLibroNovelas() {
        imprimePrecioLibro();
        System.out.println("tema = " + tema);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}

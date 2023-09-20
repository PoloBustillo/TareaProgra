import javax.swing.*;

public class Libro {

    private String titulo;
    private String autores;
    private double precio;



    public void imprimeLibro() {
        System.out.println("titulo = " + titulo);
        System.out.println("autores = " + autores);
    }

    public void imprimePrecioLibro(){
        imprimeLibro();
        System.out.println("precio = " + precio);
    }

    public void ventanaLibro(){
        JOptionPane.showMessageDialog(null,"Titulo: "+titulo+", Autor: "+ autores+", Precio: "+ precio);
    }
    public Libro(String titulo, String autores, double precio) {
        this.titulo = titulo;
        this.autores = autores;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

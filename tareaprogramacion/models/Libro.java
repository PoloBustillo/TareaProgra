package tareaprogramacion.models;

import javax.swing.*;
import java.util.Arrays;

public class Libro {

    private String titulo;
    private String[] autores;
    private double precio;


    public Libro(String titulo, String[] autores, double precio) {
        this.titulo = titulo;
        this.autores = autores;
        this.precio = precio;
    }

    public Libro(String titulo, String[] autores) {
        this.titulo = titulo;
        this.autores = autores;
    }

    public void imprimeLibro() {
        System.out.println("________________________________________________________________");
        System.out.println("TITULO = " + titulo);
        System.out.println("AUTORES = " + Arrays.toString(autores));
    }

    public void imprimePrecioLibro() {
        imprimeLibro();
        System.out.println("PRECIO = " + precio);
    }

    public void ventanaLibro() {
        JOptionPane.showMessageDialog(null, "Titulo: " + titulo + ", Autor: " + autores + ", Precio: " + precio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

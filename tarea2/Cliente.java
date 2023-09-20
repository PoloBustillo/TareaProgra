package tarea2;

import tarea1.Libro;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("TITULO:");
        String titulo = leer.next();

        System.out.println("AUTORES:");
        String autores = leer.next();

        System.out.println("PRECIO:");
        double precio = leer.nextDouble();


        Libro libro = new Libro(titulo, autores, precio);


        System.out.println("TITULO2:");
        titulo = leer.next();

        System.out.println("AUTORES2:");
        autores = leer.next();

        System.out.println("PRECIO2:");
        precio = leer.nextDouble();
        Libro libro2 = new Libro(titulo, autores, precio);

        System.out.println("***************************************");
        libro.imprimePrecioLibro();
        System.out.println("***************************************");
        libro2.imprimePrecioLibro();
        System.out.println("***************************************");

        System.out.println("ACTUALIZA EL PRECIO DEL PRIMERO:");
        precio = leer.nextDouble();
        libro.setPrecio(precio);
        System.out.println("***************************************");
        libro.imprimePrecioLibro();
        System.out.println("***************************************");
        libro2.imprimePrecioLibro();
        System.out.println("***************************************");

//        libro.ventanaLibro();
//        libro2.ventanaLibro();


        leer.close();


    }
}

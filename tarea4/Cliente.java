package tarea4;

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

        System.out.println("CURSO:");
        String curso = leer.next();

        System.out.println("FACULTAD:");
        String facultad = leer.next();


        LibroTextoBUAP libro = new LibroTextoBUAP(titulo, autores, precio, curso, facultad);


        System.out.println("***************************************");
        libro.imprimePrecioLibroTextoBUAP();
        System.out.println("***************************************");


        System.out.println("TITULO 2:");
        titulo = leer.next();

        System.out.println("AUTORES 2:");
        autores = leer.next();

        Novelas libro2 = new Novelas(titulo, autores, 0.0);
        System.out.println("***************************************");
        libro2.imprimeLibro();
        System.out.println("***************************************");

        System.out.println("TITULO 3:");
        titulo = leer.next();

        System.out.println("AUTORES 3:");
        autores = leer.next();
        Novelas libro3 = new Novelas(titulo, autores, 0.0);
        System.out.println("***************************************");
        libro3.imprimeLibro();
        System.out.println("***************************************");


        System.out.println("ACTUALIZAR PRECIO LIBRO 1:");
        precio = leer.nextDouble();
        libro.setPrecio(precio);

        System.out.println("***************************************");
        libro.imprimePrecioLibroTextoBUAP();
        System.out.println("***************************************");

//        libro.ventanaLibro();
//        libro2.ventanaLibro();


        leer.close();


    }
}

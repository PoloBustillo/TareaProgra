package tareaprogramacion.clientes;

import tareaprogramacion.models.Libro;
import tareaprogramacion.utils.PrintConsole;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteLibros {
    private static String leerDato(String nombreDato, boolean isNumeric) {

        Scanner leer = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println(nombreDato.toUpperCase() + ": ");
        if (!isNumeric) {
            return leer.nextLine();
        } else {
            return String.valueOf(leer.nextDouble());
        }

    }

    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<Libro>();
        for (int i = 0; i < 2; i++) {
            PrintConsole.printTextArt("LIBRO " + i, PrintConsole.ART_SIZE_MEDIUM, PrintConsole.ASCIIArtFont.ART_FONT_MONO, "#");
            String titulo = leerDato("TITULO " + i, false);
            String[] autores = leerDato("AUTORES " + i + "(SEPARADOS POR COMA)", false).split(",");
            String precio = leerDato("PRECIO " + i, true);
            libros.add(new Libro(titulo, autores, Double.parseDouble(precio)));
            libros.get(i).imprimePrecioLibro();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

        String precio = leerDato("ACTUALIZA PRECIO DE LIBRO 0", true);
        libros.get(0).setPrecio(Double.parseDouble(precio));
        libros.get(0).imprimePrecioLibro();

    }
}

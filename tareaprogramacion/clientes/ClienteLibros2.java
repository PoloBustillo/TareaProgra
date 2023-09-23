package tareaprogramacion.clientes;

import tareaprogramacion.models.Libro;
import tareaprogramacion.models.LibroTextoBUAP;
import tareaprogramacion.models.Novelas;
import tareaprogramacion.utils.PrintConsole;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteLibros2 {
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
        ArrayList libros = new ArrayList<Libro>();

        for (int i = 0; i < 1; i++) {
            PrintConsole.printTextArt("LIBRO " + i, PrintConsole.ART_SIZE_MEDIUM, PrintConsole.ASCIIArtFont.ART_FONT_MONO, "#");
            String titulo = leerDato("TITULO " + i, false);
            String[] autores = leerDato("AUTORES " + i + "(SEPARADOS POR COMA)", false).split(",");
            String curso = leerDato("CURSO " + i, false);
            String facultad = leerDato("FACULTAD " + i, false);
            String precio = leerDato("PRECIO " + i, true);
            libros.add(new LibroTextoBUAP(titulo, autores, Double.parseDouble(precio), curso, facultad));
            LibroTextoBUAP libroBUAP = (LibroTextoBUAP) libros.get(i);
            libroBUAP.imprimePrecioLibroTextoBUAP();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        PrintConsole.printTextArt("LIBRO 1", PrintConsole.ART_SIZE_MEDIUM, PrintConsole.ASCIIArtFont.ART_FONT_MONO, "#");
        String titulo = leerDato("TITULO 1", false);
        String[] autores = leerDato("AUTORES 1 (SEPARADOS POR COMA)", false).split(",");
        Novelas novela = new Novelas(titulo, autores);
        String tema = leerDato("TEMA", false);
        novela.setTema(tema);
        novela.imprimePrecioLibroNovelas();

        LibroTextoBUAP libroBUAP = (LibroTextoBUAP) libros.get(0);
        String precio = leerDato("ACTUALIZA PRECIO DE LIBRO 0 (" + libroBUAP.getPrecio() + ")", true);
        libroBUAP.setPrecio(Double.parseDouble(precio));
        libroBUAP.imprimePrecioLibroTextoBUAP();


    }
}

package tarea9;


import java.util.Scanner;

public class Cliente {

    private static String datoDesdeTeclado(String tipoNumero) {
        Scanner leer = new Scanner(System.in);
        System.out.println(tipoNumero + ": ");
        return leer.next();
    }

    public static void main(String[] args) {


        String titulo = datoDesdeTeclado("TITULO");
        String autores = datoDesdeTeclado("AUTORES");
        System.out.println("PRECIO:");
        Scanner leer = new Scanner(System.in);
        double precio = leer.nextDouble();


        Libro libro = new Libro(titulo, autores, precio);

        System.out.println("***************************************");
        libro.imprimePrecioLibro();
        System.out.println("***************************************");


        String codigo = datoDesdeTeclado("CODIGO");
        String mensaje = datoDesdeTeclado("TEXTO");
        String remitente = datoDesdeTeclado("REMITENTE");
        String llamada = datoDesdeTeclado("LLAMADA");
        MensajeTexto mt = new MensajeTexto(codigo, mensaje);
        Mensaje mensajeObj = new Mensaje(remitente, llamada, mt);

        mensajeObj.imprimir();
        leer.close();


    }
}

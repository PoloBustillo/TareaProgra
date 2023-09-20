package tarea8;

import java.util.Scanner;

public class Cliente {

    private static String numeroDesdeTeclado(String tipoNumero) {
        Scanner leer = new Scanner(System.in);
        System.out.println(tipoNumero + ": ");
        return leer.next();
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String remitente = numeroDesdeTeclado("NUMERO REMITENTE");
        String codigo = numeroDesdeTeclado("CODIGO");
        String mensaje = numeroDesdeTeclado("MENSAJE");
        String receptor = numeroDesdeTeclado("RECEPTOR");

        MensajeTexto mt = new MensajeTexto(codigo, mensaje);
        Mensaje mensajeObj = new Mensaje(remitente, receptor, mt);


        mensajeObj.imprimir();
        leer.close();

    }

}

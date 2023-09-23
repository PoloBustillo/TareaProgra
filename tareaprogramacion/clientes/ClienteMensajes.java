package tareaprogramacion.clientes;

import tareaprogramacion.models.Mensaje;
import tareaprogramacion.models.MensajeTexto;
import tareaprogramacion.utils.PrintConsole;

import java.util.Scanner;

public class ClienteMensajes {

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

        MensajeTexto[] mensajesTexto = new MensajeTexto[3];

        PrintConsole.printTextArt("MENSAJE", PrintConsole.ART_SIZE_MEDIUM, PrintConsole.ASCIIArtFont.ART_FONT_MONO, "#");
        String remitente = leerDato("REMITENTE", false);
        for (int i = 0; i < 2; i++) {
            String codigo = leerDato("CODIGO " + i, false);
            String mensaje = leerDato("MENSAJE " + i, false);
            mensajesTexto[i] = new MensajeTexto(codigo, mensaje);
        }

        Mensaje msj = new Mensaje(remitente, mensajesTexto);

        msj.imprimir();

    }
}

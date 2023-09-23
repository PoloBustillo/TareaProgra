package tareaprogramacion.clientes;

import tareaprogramacion.models.Catedratico;
import tareaprogramacion.models.Estudiante;
import tareaprogramacion.models.Persona;
import tareaprogramacion.utils.PrintConsole;

import java.util.Scanner;

public class ClientePersonas {
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
        Persona persona = new Persona("Bob", "Puebla");
        Estudiante estudiante = new Estudiante("Pablo", "Puebla", "Compu", 1200);
        Catedratico catedratico = new Catedratico("Pedro", "Puebla", "Arquitectura", 34000);

        PrintConsole.printTextArt("PERSONA ", PrintConsole.ART_SIZE_MEDIUM, PrintConsole.ASCIIArtFont.ART_FONT_MONO, "#");
        persona.imprimePersona();
        PrintConsole.printTextArt("ESTUDIANTE ", PrintConsole.ART_SIZE_MEDIUM, PrintConsole.ASCIIArtFont.ART_FONT_MONO, "#");
        estudiante.imprimeEstudiante();
        PrintConsole.printTextArt("CATEDRATICO ", PrintConsole.ART_SIZE_MEDIUM, PrintConsole.ASCIIArtFont.ART_FONT_MONO, "#");
        catedratico.imprimeCatedratico();
        String residencia = leerDato("CAMBIAR RESIDENCIA DE CATEDRATICO:", false);
        catedratico.setResidencia(residencia);
        String salario = leerDato("CAMBIAR SALARIO DE CATEDRATICO:", true);
        catedratico.setSalario(Float.parseFloat(salario));
        catedratico.imprimeCatedratico();


    }
}



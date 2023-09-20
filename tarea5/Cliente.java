package tarea5;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("************PERSONA**********");
        System.out.println("NOMBRE:");
        String nombre = leer.next();

        System.out.println("RESIDENCIA:");
        String residencia = leer.next();

        Persona persona = new Persona(nombre, residencia);
        persona.imprimePersona();

        System.out.println("************ESTUDIANTE**********");
        System.out.println("NOMBRE:");
        nombre = leer.next();

        System.out.println("RESIDENCIA:");
        residencia = leer.next();

        System.out.println("FACULTAD:");
        String facultad = leer.next();

        System.out.println("PAGO INSCRIPCION:");
        float pago = leer.nextFloat();


        Estudiante est = new Estudiante(nombre, residencia, facultad, pago);
        est.imprimeEstudiante();


        System.out.println("************CATEDRATICO**********");
        System.out.println("NOMBRE:");
        nombre = leer.next();

        System.out.println("RESIDENCIA:");
        residencia = leer.next();

        System.out.println("FACULTAD:");
        facultad = leer.next();

        System.out.println("SALARIO:");
        pago = leer.nextFloat();


        Catedratico catedratico = new Catedratico(nombre, residencia, facultad, pago);
        catedratico.imprimeCatedratico();


    }
}

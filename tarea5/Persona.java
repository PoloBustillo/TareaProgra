package tarea5;

public class Persona {
    private String nombre;
    private String residencia;


    public Persona(String nombre, String residencia) {
        this.nombre = nombre;
        this.residencia = residencia;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void imprimePersona() {
        System.out.println("nombre = " + nombre);
        System.out.println("residencia = " + residencia);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
}

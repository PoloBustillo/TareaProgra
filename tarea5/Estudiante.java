package tarea5;

public class Estudiante extends Persona {
    private String facultad;
    private float pagoInscripcion;

    public Estudiante(String nombre, String residencia, String facultad, float pagoInscripcion) {
        super(nombre, residencia);
        this.facultad = facultad;
        this.pagoInscripcion = pagoInscripcion;
    }

    public void imprimeEstudiante() {
        imprimePersona();
        System.out.println("facultad = " + facultad);
        System.out.println("pago = " + pagoInscripcion);
    }


    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public float getPagoInscripcion() {
        return pagoInscripcion;
    }

    public void setPagoInscripcion(float pagoInscripcion) {
        this.pagoInscripcion = pagoInscripcion;
    }

    public float pagoCuotaSS(float pagoInscripcion) {
        return pagoInscripcion / 10;
    }


}

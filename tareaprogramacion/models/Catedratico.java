package tareaprogramacion.models;

public class Catedratico extends Persona {
    private String facultad;
    private float salario;

    public Catedratico(String nombre, String residencia, String facultad, float salario) {
        super(nombre, residencia);
        this.facultad = facultad;
        this.salario = salario;
    }


    public Catedratico(String nombre, String residencia) {
        super(nombre, residencia);
    }

    public float pagoCuotaSS(float salario) {
        return (float) (salario * .15);
    }

    public void imprimeCatedratico() {
        imprimePersona();
        System.out.println("facultad = " + facultad);
        System.out.println("salario = " + salario);
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

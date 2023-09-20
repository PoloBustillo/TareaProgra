package tarea7;

public class Mensaje {
    private final String llamada;
    private final String remitente;
    private final Mensaje mensaje;

    public Mensaje(String llamada, String remitente, Mensaje mensaje) {
        this.llamada = llamada;
        this.remitente = remitente;
        this.mensaje = mensaje;
    }

    public Mensaje(String remitente, Mensaje mensaje) {
        this.remitente = remitente;
        this.mensaje = mensaje;
    }
}

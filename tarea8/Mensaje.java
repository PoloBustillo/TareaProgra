package tarea8;

public class Mensaje {
    private String llamada;
    private String remitente;
    private MensajeTexto mensaje;

    public Mensaje(String llamada, String remitente, MensajeTexto mensaje) {
        this.llamada = llamada;
        this.remitente = remitente;
        this.mensaje = mensaje;
    }

    public Mensaje(String remitente, MensajeTexto mensaje) {
        this.remitente = remitente;
        this.mensaje = mensaje;
    }

    public void imprimir() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "Mensaje{" +
                "llamada='" + llamada + '\'' +
                ", remitente='" + remitente + '\'' +
                ", mensaje=" + mensaje +
                '}';
    }

    public String getLlamada() {
        return llamada;
    }

    public void setLlamada(String llamada) {
        this.llamada = llamada;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public MensajeTexto getMensaje() {
        return mensaje;
    }

    public void setMensaje(MensajeTexto mensaje) {
        this.mensaje = mensaje;
    }
}

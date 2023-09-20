package tarea6;

public class MensajeTexto {
    private String codigo;
    private String mensajeTexto;

    public MensajeTexto(String codigo, String mensajeTexto) {
        this.codigo = codigo;
        this.mensajeTexto = mensajeTexto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensajeTexto() {
        return mensajeTexto;
    }

    public void setMensajeTexto(String mensajeTexto) {
        this.mensajeTexto = mensajeTexto;
    }
}

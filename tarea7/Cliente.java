package tarea7;

public class Cliente {

    public static void main(String[] args) {
        MensajeTexto mt = new MensajeTexto("tqc", "Te quiero, cariño");
        Mensaje mensaje = new Mensaje("331440123", mt);

        mensaje.imprimir();


    }

}

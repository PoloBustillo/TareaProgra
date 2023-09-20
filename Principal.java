public class Principal {
    public static void main(String[] args) {
        Libro libro = new Libro("TITULO1", "AUTOR1, AUTOR2", 15.9);

        libro.imprimeLibro();
        libro.imprimePrecioLibro();
        libro.ventanaLibro();
    }
}

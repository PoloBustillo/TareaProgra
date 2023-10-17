package tarea1;

public class Cliente {

    public static void main(String[] args) {
        //!CREAR OBJETO
        LibroPublicado libroConEditorial = new LibroPublicado("EL CONDE DE MONTECRISTO", "PENGUIN");
        LibroPublicado libroConEditorial2 = new LibroPublicado("EL CONDE DE MONTECRISTO", "PENGUIN");
        Libro libroSinEditorial = new Libro("EL CONDE DE MONTECRISTO");

        double precioVenta = libroSinEditorial.calcularPrecioVenta();
        System.out.println(precioVenta);
        System.out.println(libroConEditorial.calcularPrecioVenta());
        System.out.println(libroConEditorial2.calcularPrecioVenta() - libroConEditorial2.calcularPrecioVenta(.1));

//        String HP = "Harry Potter";
//        Libro libroUno = new Libro();//Z y 400
//        Libro libroDos = new Libro(HP);//HP y 3500
//        Libro libroTres = new Libro("EL LLANO EN LLAMAS", 500);//LL y 500
//
//
//        System.out.println(libroDos.getCosto() + " " + libroDos.getTitulo());
//        System.out.println(libroTres.getTitulo() + " " + libroTres.getCosto());
//
//        //*USAR GETTERS Y SETTERS
//        //libroUno.setTitulo("AZTECA"); //AZTECA y 400
//        String tituloLibroUno = libroUno.getTitulo();
//        System.out.println(libroUno.getTitulo());
//        System.out.println(libroUno.getCosto());
    }

}

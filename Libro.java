import java.util.Scanner;

/**
 * En esta clase llamada Libro se representan un objeto libro con atributos tales como título, cantidad, y precio.
 */
public class Libro {

    /**
     * Atributos de la clase.
     */
    private String titulo;
    private int cantidad;
    private double precio;

    /**
     * Constructor de la clase Libro. Inicializa los atributos de la clase.
     * @param titulo    El título del libro.
     * @param cantidad  La cantidad de libros.
     * @param precio    El precio del libro.
     */
    public Libro(String titulo, int cantidad, double precio) {
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Método para mostrar información del libro.
     * @return boolean: indica que la información se mostró.
     */
    public boolean informacionLibro() {
        System.out.println("Título del libro: " + titulo);
        System.out.println("Cantidad de libros: " + cantidad);
        System.out.println("Precio del libro: " + precio);
        return true;
    }

    /**
     * Método para mostrar información del cliente
     * @return boolean: indica que la información se mostró.
     */
    public boolean informacionCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese la cédula del cliente: ");
        String cedulaCliente = scanner.nextLine();
        System.out.print("Ingrese el número del cliente: ");
        String numeroCliente = scanner.nextLine();

        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Cédula del cliente: " + cedulaCliente);
        System.out.println("Número del cliente: " + numeroCliente);
        return true;
    }

    /**
     * Método para mostrar información del vendedor
     * @return boolean: indica que la información se mostró.
     */
    public boolean informacionVendedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del vendedor: ");
        String nombreVendedor = scanner.nextLine();
        System.out.print("Ingrese la cédula del vendedor: ");
        String cedulaVendedor = scanner.nextLine();
        System.out.print("Ingrese el día de venta: ");
        String diaVenta = scanner.nextLine();

        System.out.println("Nombre del vendedor: " + nombreVendedor);
        System.out.println("Cédula del vendedor: " + cedulaVendedor);
        System.out.println("Día de venta: " + diaVenta);
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título del libro: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Ingrese la cantidad de libros: ");
        int cantidadLibros = scanner.nextInt();
        System.out.print("Ingrese el precio del libro: ");
        double precioLibro = scanner.nextDouble();

        Libro miLibro = new Libro(tituloLibro, cantidadLibros, precioLibro);
        miLibro.informacionLibro();
        miLibro.informacionCliente();
        miLibro.informacionVendedor();
    }
}

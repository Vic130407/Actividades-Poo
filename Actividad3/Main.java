import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {    
    public static String compararProductos(Producto p1, Producto p2){
        double utilidad = 20.0;
        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);

        if (precio1 > precio2) {
            return "El producto con mayor precio de venta es: " + p1.getDescripcion();
        } else if (precio2 > precio1) {
            return "El producto con mayor precio de venta es: " + p2.getDescripcion();
        } else {
            return "Ambos productos tienen el mismo precio de venta.";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto p1 = new Producto();
        Producto p2 = new Producto();

        try {
            System.out.println("Ingrese los datos del producto 1");
            System.out.println("Descripcion: ");
            p1.setDescripcion(sc.nextLine());
            System.out.println("Codigo: ");
            p1.setCodigo(sc.nextLine());
            System.out.println("Tipo: ");
            p1.setTipo(sc.nextLine());
            try{
                System.out.println("Costo: ");
                p1.setCosto(sc.nextDouble());
                System.out.println("Impuesto (%): ");
                p1.setImpuesto(sc.nextDouble());
            } catch (InputMismatchException e){
                System.out.println("Error en la entrada de datos, cerrando el programa....");
                System.exit(0);
            }
            
            sc.nextLine();

            System.out.println("Ingrese los datos del producto 2");
            System.out.println("Descripcion: ");
            p2.setDescripcion(sc.nextLine());
            System.out.println("Codigo: ");
            p2.setCodigo(sc.nextLine());
            System.out.println("Tipo: ");
            p2.setTipo(sc.nextLine());
            try{
                System.out.println("Costo: ");
                p2.setCosto(sc.nextDouble());
                System.out.println("Impuesto (%): ");
                p2.setImpuesto(sc.nextDouble());
            } catch (InputMismatchException e){
                System.out.println("Error en la entrada de datos, cerrando el programa....");
                System.exit(0);
            }
        } catch (NullPointerException e) {
            System.out.println("Error en la entrada de datos, cerrando el programa.... ");
            System.exit(0);
        }
        System.out.println("\n");
        System.out.println("Datos del producto 1:");
        p1.muestraProducto();
        System.out.println("\n");
        System.out.println("Datos del producto 2:");
        p2.muestraProducto();
        System.out.println("\n");
        System.out.println("Resultado de la comparacion:");
        System.out.println(compararProductos(p1, p2));
    }
}

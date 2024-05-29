import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
        ArrayList<Productos> Producto = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el ID del producto:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la marca del producto:");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el precio del producto:");
            float precio = scanner.nextFloat();
            scanner.nextLine();
            Productos productos = new Productos(id, nombre, marca, precio);
            Producto.add(productos);

            System.out.println("¿Desea agregar otro producto? (Continuar agregando/no, dejar de ingresar)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no, dejar de ingresar")) {
                break; // Sale del bucle
            }
           

    }
    Collections.sort(Producto, Comparator.comparingInt(Productos::getId));
        Iterator<Productos> iterator = Producto.iterator();
        while (iterator.hasNext()) {
            Productos productoActual = iterator.next();
            System.out.println("id: " + productoActual.getId() +
                    ", Nombre: " + productoActual.getNombre() +
                    ", Marca: " + productoActual.getMarca() +
                    ", Precio: " + productoActual.getPrecio());
        }
        scanner.close();
    }
}

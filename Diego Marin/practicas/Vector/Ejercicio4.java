//Agregar productos, insertar uno en una posición, eliminar otro y vaciar el vector.
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<String> productos = new Vector<>();

        productos.add("Arroz");
        productos.add("Azúcar");
        productos.add("Café");

        System.out.print("Producto a insertar: ");
        String prod = sc.nextLine();
        productos.add(1, prod); // add con posición

        System.out.print("Producto a eliminar: ");
        String eliminar = sc.nextLine();
        productos.remove(eliminar); // remove objeto

        System.out.println("Productos actuales: " + productos);

        productos.clear(); // clear
        System.out.println("Vector después de clear(): " + productos);
    }
}

//Ingresar nombres, mostrar primero y último, eliminar uno por posición y verificar si el vector está vacío.
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<String> nombres = new Vector<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese nombre: ");
            nombres.add(sc.nextLine());
        }

        System.out.println("Primer nombre: " + nombres.firstElement()); // firstElement
        System.out.println("Último nombre: " + nombres.lastElement());  // lastElement

        System.out.print("Posición a eliminar: ");
        int pos = sc.nextInt();
        nombres.remove(pos); // remove

        if (nombres.isEmpty()) { // isEmpty
            System.out.println("Vector vacío");
        } else {
            System.out.println("Vector actualizado: " + nombres);
        }
    }
}

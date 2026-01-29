//Leer edades, mostrar mayores de edad, eliminar menores y mostrar capacidad.
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Integer> edades = new Vector<>();

        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese edad: ");
            edades.add(sc.nextInt());
        }

        System.out.println("Mayores de edad:");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(edades.get(i));
            }
        }

        edades.removeIf(e -> e < 18); // removeIf
        System.out.println("Vector sin menores: " + edades);

        System.out.println("Capacidad: " + edades.capacity()); // capacity
    }
}

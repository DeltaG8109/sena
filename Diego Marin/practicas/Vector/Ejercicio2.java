//Ingresar números hasta que el usuario decida parar. Mostrar cuántos números hay, buscar uno y eliminarlo.
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Integer> numeros = new Vector<>();

        int opc;
        do {
            System.out.print("Ingrese un número: ");
            numeros.add(sc.nextInt());

            System.out.print("¿Desea continuar? (1=Sí / 0=No): ");
            opc = sc.nextInt();
        } while (opc == 1);

        System.out.println("Cantidad de números: " + numeros.size()); // size

        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();

        if (numeros.contains(buscar)) { // contains
            System.out.println("Encontrado en posición: " + numeros.indexOf(buscar)); // indexOf
            numeros.remove((Integer) buscar); // remove
            System.out.println("Número eliminado");
        } else {
            System.out.println("Número no encontrado");
        }

        System.out.println("Vector final: " + numeros);
    }
}

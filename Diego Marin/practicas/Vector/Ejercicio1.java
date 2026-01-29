//Leer N notas, guardarlas en un Vector, mostrar todas las notas, modificar una nota y calcular el promedio.
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Double> notas = new Vector<>();

        System.out.print("¿Cuántas notas va a ingresar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese nota: ");
            notas.add(sc.nextDouble()); // add
        }

        System.out.println("Notas ingresadas:");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota " + i + ": " + notas.get(i)); // get
        }

        System.out.print("Ingrese posición a modificar: ");
        int pos = sc.nextInt();
        System.out.print("Nueva nota: ");
        double nueva = sc.nextDouble();
        notas.set(pos, nueva); // set

        double suma = 0;
        for (int i = 0; i < notas.size(); i++) {
            suma += notas.get(i);
        }

        System.out.println("Promedio: " + (suma / notas.size()));
    }
}

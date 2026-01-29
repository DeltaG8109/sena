//13. Leer 10 números enteros, almacenarlos en un vector y determinar si el promedio entero de estos datos está almacenado en el vector.
package Vectores;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vector[] = new int[5];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número para la posición " + (i + 1));
            vector[i] = entrada.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = vector[i] + suma;
        }
        int promedio = suma / vector.length;

        for (int i = 0; i < vector.length; i++) {
            if (promedio == vector[i]) {
                System.out.println("El promedio es " + promedio + " y está en la posición " + (i + 1) + ".");
                break;
            } else {
                System.out.println("No está el promedio en el vector.");
            }
        }
    }
}

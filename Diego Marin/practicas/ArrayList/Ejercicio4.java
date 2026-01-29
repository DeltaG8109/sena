//11. Suma de posiciones pares Llenar un ArrayList con 10 números.
//Suma solo los números que están en posiciones pares (0, 2, 4, 6, 8).

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Llenar la lista con 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros.add(entrada.nextInt());
        }

        // Sumar solo los números en posiciones pares
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 == 0) { // posición par
                suma += numeros.get(i);
            }
        }

        System.out.println("La suma de las posiciones pares es: " + suma);
    }
}

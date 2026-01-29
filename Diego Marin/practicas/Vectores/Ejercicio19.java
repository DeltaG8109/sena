//19. Leer 10 números enteros, almacenarlos en un vector y determinar cuál es el número menor. 
package Vectores;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vector[] = new int[10];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número para la posición" + (i + 1));
            vector[i] = entrada.nextInt();
        }
        int menor = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        System.out.println("El número menor del vector es: " + menor);

    }
}

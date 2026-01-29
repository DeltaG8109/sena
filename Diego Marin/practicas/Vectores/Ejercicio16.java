 ///6. Leer 10 números enteros, almacenarlos en un vector y determinar cuáles son los datos 
///almacenados múltiplos de 3. 
package Vectores;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vector[] = new int[10];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el número para la posición " + (i + 1));
            vector[i] = entrada.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 3 == 0) {
                System.out.println("El" + vector[i] + " es multiplo de tres");
            } else {
                System.out.println("El" + vector[i] + " no es multiplo de tres");
            }
        }
    }
}

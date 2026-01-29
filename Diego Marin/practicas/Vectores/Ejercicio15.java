
package Vectores;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vec = new int[10];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número de la posición " + (i + 1) + ": ");
            vec[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (vec[i] % 3 == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de números múltiplos de 3: " + contador);
    }
}

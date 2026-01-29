package Vectores;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vec = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número de la posición " + (i + 1) + ": ");
            vec[i] = entrada.nextInt();
        }

        System.out.println("Posiciones con números de más de 3 dígitos:");

        for (int i = 0; i < 10; i++) {
            int num = vec[i];
            int temp = num;
            int contador = 0;

            if (temp == 0) {
                contador = 1;
            } else {
                while (temp != 0) {
                    temp /= 10;
                    contador++;
                }
            }

            if (contador > 3) {
                System.out.println("Número: " + num + " en posición: " + i);
            }
        }
    }
}

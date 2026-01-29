package Vectores;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vec = new int[10];
        int contadorMenos3 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número de la posición " + (i + 1) + ": ");
            vec[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int num = vec[i];
            int temp = num;
            int digitos = 0;

            if (temp == 0) {
                digitos = 1;
            } else {
                while (temp != 0) {
                    temp /= 10;
                    digitos++;
                }
            }
            if (digitos < 3) {
                contadorMenos3++;
            }
        }

        System.out.println("Cantidad de números con menos de 3 dígitos: " + contadorMenos3);
    }
}

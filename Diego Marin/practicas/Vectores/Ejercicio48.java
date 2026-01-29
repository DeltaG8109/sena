package Vectores;

import java.util.Scanner;

public class Ejercicio48 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[10];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número entero: ");
            int numero = entrada.nextInt();
            int contador = 0;
            for (int j = 1; j <= numero; j++) {
                if (numero % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                vector[i] = numero;
            }
        }
        int mayor = 0, posicion = 0;
        for (int i = 0; i < vector.length; i++) {
            int contador = 0;
            while (vector[i] > 0) {
                int digito = vector[i] % 10;
                vector[i] = vector[i] / 10;
                if (digito % 2 == 0) {
                    contador++;
                }
            }
            if (contador > mayor) {
                mayor = contador;
                posicion = i;
            }
        }
        System.out.println("La posicion donde se encuentra el primo con mayor digitos pares es: "+posicion);
    }
}

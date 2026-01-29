package Vectores;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[10], mayor = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero entero: ");
            vector[i] = entrada.nextInt();
        }
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == mayor) {
                contador++;
            }
        }
        if (contador == 1) {
            System.out.println("El numero mayor es: " + mayor + " y no se repite");
        } else {
            System.out.println("El numero mayor es: " + mayor + " y se repite " + contador + " veces");
        }
    }
}

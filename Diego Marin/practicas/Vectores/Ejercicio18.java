//18. Leer 10 números enteros, almacenarlos en un vector y determinar en qué posiciones están los números positivos.
package com.mycompany.zsz;

 import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int vector [] = new int [5];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número para la posición "+(i+1));
            vector[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0){
                System.out.println("Los números positivos están en la posición "+(i+1));
                
            }if (vector[i]< 0){
                System.out.println("El número negativo está en la posición."+(i+1));
            }          
        }
    }
}

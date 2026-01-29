//14. Leer 10 números enteros, almacenarlos en un vector y determinar 
//cuántas veces se repite el promedio entero de los datos dentro del vector. 
package Vectores;

import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int vector [] = new int [10];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número para la posición "+(i+1));
            vector[i] = entrada.nextInt();
        }
        int suma = 0, promedio = 0;
        for (int i = 0; i < vector.length; i++) {
             suma = vector[i] + suma;
        }
         promedio = suma / vector.length;
        int rep = 0;
        for (int i = 0; i < vector.length; i++) {
            if(promedio == vector[i]){
                rep ++;
            }
        }
        System.out.println("El promedio es " +promedio);
        System.out.println("Las veces que se repiten dentro del vector es " + rep);
    }
}

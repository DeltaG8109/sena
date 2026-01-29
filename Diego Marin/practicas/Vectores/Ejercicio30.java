///30. Leer 10 números enteros, almacenarlos en un vector. Luego leer un entero y determinar si este 
///último entero se encuentra entre los 10 valores almacenados en el vector.
package Vectores;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int vector [] = new int [10];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número para la posición " + (i+1));
            vector[i] = entrada.nextInt();
        }
        System.out.println("Ingrese un número: ");
        int num1 = entrada.nextInt();
        
        int cont = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num1){
                cont ++;
            }
        }
        if (cont > 0){
            System.out.println("El número " + num1 + " se encuentra en el vector");
        }else{
            System.out.println("El número" + num1 + " no se encuentra en el vector");
        }
    }
}

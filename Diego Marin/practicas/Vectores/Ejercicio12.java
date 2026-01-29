
//12. Leer 10 números enteros, almacenarlos en un vector y determinar a cuánto es igual elpromedio entero de los datos del vector.
package Vectores;
import java.util.Scanner;
public class Ejercicio12 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vector [] = new int [10];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número para la posición "+(i+1));
            vector[i] = entrada.nextInt();
            
        }
        int suma = 0;
        for (int j = 0; j < vector.length; j++) {
           suma = vector[j] + suma; 
        }
        
        int promedio = suma / vector.length;
        System.out.println("El promedio entero de los 10 números ingresados es : "+promedio);
    }
}

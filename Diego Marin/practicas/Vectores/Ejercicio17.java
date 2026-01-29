///17. Leer 10 números enteros, almacenarlos en un vector y determinar cuántos números negativos hay.
package Vectores;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int vector [] = new int [10];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el número para la posición "+ (i+1));
            vector[i] = entrada.nextInt();
        }
        int negativos = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] < 0){
                System.out.println("El número de la posición" + (i+1)+" es negativo");
                negativos ++;
            }
        }
        System.out.println("La cantidad de números negatiivos en el vector son: "+ negativos);
    }
}

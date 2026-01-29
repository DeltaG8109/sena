
package Vectores;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vector [] = new int [10];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite un número en la posición "+(i+1)+":");
            vector [i] = entrada.nextInt();
        }
        int mayor = 0, posicion = 0;
        for (int i = 0; i < vector.length; i++) {
            int contador = 0;
            for (int j = 1; j <= vector[i]; j++) {
                if(vector[i] % j == 0){
                    contador++;
                }
            }
            if(contador == 2){
                if(vector[i]>mayor){
                    mayor = vector [i];
                    posicion = i+1;
                }
            }
        }
        System.out.println("La posicion en la que se encuentra mayor primo es "+posicion);
    }
}

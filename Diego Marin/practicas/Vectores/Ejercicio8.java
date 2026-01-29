
package Vectores;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int vector [] = new int [10], posicion = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número entero: ");
            vector [i] = entrada.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 10 == 4){
                posicion = i;
                 System.out.println("Los números ingresados que terminan en 4 estan en la posicion: "+ i);
            }
           
        }
        
    }
}

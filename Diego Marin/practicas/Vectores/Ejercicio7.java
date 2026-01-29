
package Vectores;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vector [] = new int [10], mayor = 0, menor = 0;
        
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número entero: ");
            vector [i] = entrada.nextInt();
        }
        int posicion = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] > mayor){
                mayor = vector[i];
                posicion = i;
            }
        }
        System.out.println("El número mayor es: "+mayor+" y está en la posicion: "+posicion);
    }
}

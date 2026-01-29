
//1. Guardar y mostrar números 
//Solicitar al usuario 5 números enteros, almacenarlos en un ArrayList<Integer> y luego mostrarlos uno por uno.
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        ArrayList<Integer> numeros = new ArrayList<>(); // Creamos la ArrayList
        
        for (int i = 0; i < 5; i++) {                         // llenamos la ArrayList
            System.out.println("Ingrese el número" + (i+1));
            numeros.add(entrada.nextInt());
        }
        
        System.out.println("Los números ingresados son: ");  // Mostramos los números ingresados en la ArrayList
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("El número de la posición" + (i+1) + " es " + numeros.get(i));
        }
    }
}



//2. Suma de todos los elementos
//Leer 8 números, guardarlos en un ArrayList y mostrar la suma total.
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList <Integer> numeros = new ArrayList<>();
        
        System.out.println("Ingrese la cantidad de números que va tener la lista: ");
        int cantidad = entrada.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println(i+1+" Número: ");
            numeros.add (entrada.nextInt());
        }
        
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        System.out.println("Los elementos de la lista son: "+ numeros);
        System.out.println("La suma de todos los elementos de la lista es: " + suma);
    }
}

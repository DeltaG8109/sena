//Enunciado: Leer números hasta que el usuario ingrese un número negativo.
//Luego agregar un número al inicio con addFirst() y otro al final con addLast().
//Mostrar la lista completa.
package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        LinkedList <Integer> Numeros = new LinkedList <>();
        
        System.out.println("Ingrese un número, negativo si desea terminar: ");
        int num = entrada.nextInt();
        
        while(true){
            if(num < 0){
                break;
            }
            
            Numeros.add(num);
            
            System.out.println("Ingrese un número, negativo si desea terminar: ");
            num = entrada.nextInt();
        }
        
        System.out.println("Ingrese un número al inicio: ");
        int inicio = entrada.nextInt();
        Numeros.addFirst(inicio);
        
        System.out.println("Ingrese un número al final: ");
        int ultimo = entrada.nextInt();
        Numeros.addLast(ultimo);
        
        System.out.println("Lista completa : ");
        
        for (int i = 0; i < Numeros.size(); i++) {
            System.out.println("Elemento " + (i+1) + " es " + Numeros.get(i));
        }
        
    }
}

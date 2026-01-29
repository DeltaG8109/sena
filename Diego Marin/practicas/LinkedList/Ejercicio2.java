//Leer varios números y guardarlos en una LinkedList<Integer>.
//Eliminar todos los repetidos dejando solo una copia.
//Mostrar la lista final.
package LinkedList;
import java.util.Scanner;
import java.util.LinkedList;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        LinkedList <Integer> numeros = new LinkedList <>();
        
        System.out.println("Ingrse la cantidad de números que va ingresar: ");
        int cantidad = entrada.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el " + (i+1) + " número: ");
            int num = entrada.nextInt();

            if(numeros.contains(num)){
                System.out.println("El número ya se encuentra, se va eliminar el repetido.");
                numeros.remove((Integer)num);
            }else{
                numeros.add(num);
            }
        }      
        System.out.println("La lista completa es: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println((i+1)+" números es: "+ numeros.get(i));
        }
    }
}

//Pide al usuario 10 números enteros y guárdalos en un HashSet.
//Al final, muestra los números ingresados sin repetir.

import java.util.HashSet;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese 10 nombres si son repetidos no se almacenaran.");

        var hash = new HashSet<String>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre:");
            hash.add(sc.nextLine());
        }

        System.out.println(hash);
    }
}

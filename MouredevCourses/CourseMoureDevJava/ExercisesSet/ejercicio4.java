/*Guarda 8 números enteros en un HashSet.
Luego pide un número y:

Si existe, elimínalo

Si no existe, muestra un mensaje */

import java.util.HashSet;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var nums = new HashSet<Integer>();

        System.out.println("Ingrese 8 numeros:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el numero #" + (i+1) + ":");
            nums.add(sc.nextInt());
        }

        System.out.println("Ingrese un numero:");
        var n = sc.nextInt();

        if(nums.contains(n)){
            nums.remove(n);
            System.out.println("Numero eliminado es " + n + ".");
        }else{
            System.out.println("No existe este numero.");
        }

        System.out.println(nums);
    }
}

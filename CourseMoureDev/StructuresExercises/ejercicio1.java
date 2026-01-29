//1.Crea una Array con 5 valores e imprime su longitud.

import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese una edad para la posicion #" + (i+1) + ":");
            nums[i] = sc.nextInt();
        }

        System.out.println("La longitud de la Array es de " + nums.length + ".");
    }
}
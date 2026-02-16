/*Guarda los colores favoritos del usuario en un HashSet<String>.
Luego pide un color y verifica si ya existe en el conjunto. */

import java.util.HashSet;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        var colors = new HashSet<String>();

        while(true){
            System.out.println("Ingrese un color(Para salir ingrese salir");
            var color = sc.nextLine();
            if(color.equalsIgnoreCase("salir")){
                break;
            }else{
                colors.add(color);
            }
        }

        System.out.println("Ingrese un color para verificar si se encuentra en el conjunto de colores.");
        var c = sc.nextLine();

        if(colors.contains(c)){
            System.out.println("Este color existe en el Conjunto de colores.");
        }else{
            System.out.println("Este color NO existe en el Conjunto de colores.");
        }
    }
}

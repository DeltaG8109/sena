//12. Lista sin repetidos (básico)
//Pedir al usuario 7 números e ir agregando al ArrayList solo si no están repetidos.


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese la catidad de números que va tener la lsita: ");
        int cantidad = entrada.nextInt();

        for (int i = 0; i < cantidad; i++) {
            int numero;
            while(true){
                System.out.println(i+1 + " Número: ");
                 numero = entrada.nextInt();
                 if(numeros.contains(numero)){
                     System.out.println("El número ya está, ingrese otro.");
                 }else{
                     numeros.add(numero);
                     break;
                 }
            }
        }
        System.out.println("La lista sin números repetidos son : "+ numeros);
    }
}

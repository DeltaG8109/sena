//3.Leer 10 números enteros, almacenarlos . Luego leer un entero y determinar cuantos divisores exactos tiene  cada número del stack entre el numero.
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Stack<Integer> pila = new Stack<>();

        // 1. Leer 10 números y guardarlos en el stack
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            pila.push(entrada.nextInt());
        }

        // 2. Leer el número a analizar
        System.out.print("\nIngrese el número al que quiere contarle divisores: ");
        int numero = entrada.nextInt();

        int contador = 0;

        // 3. Revisar cuántos elementos de la pila son divisores exactos
        while (!pila.isEmpty()) {
            int valor = pila.pop();   // sacamos el valor
            System.out.println(valor +"AQUI");
            if (valor % numero == 0) {  // divisor exacto
                contador++;
            }
        }

        System.out.println("\nCantidad de divisores exactos encontrados: " + contador);
    }
}
package LinkedList;

import java.util.Scanner;
//Crea un programa que use una LinkedList<Integer> para almacenar números ingresados por el usuario.
import java.util.LinkedList;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LinkedList<Integer> numeros = new LinkedList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("a: Insertar un número en una posición específica");
            System.out.println("b: Eliminar el primer número o el último.");
            System.out.println("c: Eliminar un número por valor");
            System.out.println("d: Buscar el índice donde aparece un número");
            System.out.println("e: Contar cuántas veces aparece un número manualmente.");
            System.out.println("f: Mostrar la lista completa.");
            System.out.println("g: salir");
            System.out.println("Ingrese una opción: ");
            String opcion = entrada.next();

            if (opcion.equals("a")) {
                System.out.println("Ingrese el numero: ");
                int num = entrada.nextInt();
                System.out.println("Ingrese la posición: ");
                int pos = entrada.nextInt();
                numeros.add(pos - 1, num);
            }
            if (opcion.equals("b")) {
                System.out.println("Qué número desea eliminar, primero o ultimo?: ");
                String respuesta = entrada.next();
                if (respuesta.equals("primero")) {
                    System.out.println("El " + numeros.getFirst() + " ha sido eliminado.");
                    numeros.removeFirst();
                } else if (respuesta.equals("ultimo")) {
                    System.out.println("El" + numeros.getLast() + " ha sido eliminado");
                    numeros.removeLast();
                }
            }
            if (opcion.equals("c")) {
                System.out.println("Ingrese el numero a eliminar: ");
                int num = entrada.nextInt();
                if (numeros.contains(num)) {
                    System.out.println("El numero " + num + " ha sido eliminado");
                    numeros.remove((Integer) num);
                } else {
                    System.out.println("El " + num + " no se encuentra en la lista");
                }

            }
            if (opcion.equals("d")) {
                System.out.println("Ingrese el indice");
                int indice = entrada.nextInt();
                if (indice >= 0 && indice < numeros.size()) {
                    System.out.println("El número del indice " + indice + " es: " + numeros.get(indice));
                }else{
                    System.out.println("El indice no existe");
                }

            }
            if (opcion.equals("e")) {
                System.out.println("Ingrese el número: ");
                int num = entrada.nextInt();
                int cont = 0;
                for (int i = 0; i < numeros.size(); i++) {
                    if (numeros.get(i)== num) {
                        cont++;
                    }
                }
                System.out.println("La cantidad de veces que está " + num + " es: " + cont);
            }
            if (opcion.equals("f")) {
                System.out.println(numeros);
            }
            if (opcion.equals("g")) {
                System.out.println("Gracias");
                break;
            }
        }
    }
}

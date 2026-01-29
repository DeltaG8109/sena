//Una clínica tiene una fila de espera para atender pacientes.
//Debes usar una LinkedList<String> para almacenar los nombres de los pacientes en el orden en el que van llegando.
package LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        LinkedList<String> pacientes = new LinkedList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("a: Agregar un paciente");
            System.out.println("b: Atender al primer paciente (eliminarlo de la lista).");
            System.out.println("c: Mostrar quién es el siguiente en ser atendido");
            System.out.println("d: Buscar si un paciente está en la fila");
            System.out.println("e: Mostrar toda la fila con su posicións");
            System.out.println("f: salir");
            System.out.println("Ingrese una opción: ");
            String opcion = entrada.next();

            if (opcion.equals("a")) {
                System.out.println("Ingrese el nombre del paciente: ");
                pacientes.addLast(entrada.next());
            }
            if (opcion.equals("b")) {
                System.out.println("Primer paciente atendido, fue: "+ pacientes.getFirst());
                pacientes.removeFirst();
            }
            if (opcion.equals("c")) {
                System.out.println("El siguiente paciente en ser atendido es: " + pacientes.getFirst());
            }
            if (opcion.equals("d")) {
                System.out.println("Ingrese el nombre a buscar: ");
                String buscar = entrada.next();
                if (pacientes.contains(buscar)) {
                    System.out.println("El paciente se encuentra en la lista en la posición: " + (pacientes.indexOf(buscar)+1));
                } else {
                    System.out.println("El paciente no se encuentra en la lista.");
                }
            }
            if (opcion.equals("e")) {
                for (int i = 0; i < pacientes.size(); i++) {
                    System.out.println((i + 1) + ". " + pacientes.get(i) + ".");
                }
            }
            if (opcion.equals("f")) {
                System.out.println("Muchas gracias por su uso en este hermoso programa.");
                break;
            }
        }

    }
}

package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<String> historial = new Stack<>();

        System.out.println("Bienvenido al historial de páginas.");

        while (true) {
            System.out.println("Opciones: ");
            System.out.println("a: Ingrese la página: ");
            System.out.println("b: historial: ");
            System.out.println("c: back: ");
            System.out.println("d: salir: ");

            String opcion = entrada.next();

            if (opcion.equals("a")) {
                System.out.println("Ingrese el nombre de la página");
                historial.push(entrada.next());
                System.out.println(historial.peek()+ " fue añadido");
            }
            if (opcion.equals("b")) {
                System.out.println(historial);
            }
            if (opcion.equals("c")) {
                if (historial.isEmpty()) {
                    System.out.println("El historial está vacio.");
                } else {
                    String pagina = historial.pop();
                    System.out.println("Volviendo desde " + pagina);
                    if(!historial.empty()){
                        System.out.println("Página actual: " + historial.peek());
                    }else{
                        System.out.println("No hay más páginas ");
                    }
                }
            }
            if (opcion.equals("d")) {
                System.out.println("GRACIAS");
                break;
            }

        }
    }
}

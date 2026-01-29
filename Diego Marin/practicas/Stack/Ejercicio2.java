package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Stack<String> historial = new Stack<>();
        String texto;

        System.out.println("Escribe palabras o frases.");
        System.out.println("Escribe 'deshacer' para eliminar la última acción.");
        System.out.println("Escribe 'fin' para terminar.");
        System.out.println("-----------------------------------------------");

        while (true) {
            System.out.print("👉 Ingrese texto: ");
            texto = entrada.nextLine();

            if (texto.equalsIgnoreCase("fin")) {
                break;
            }

            if (texto.equalsIgnoreCase("deshacer")) {

                if (historial.isEmpty()) {
                    System.out.println("⚠ No hay nada para deshacer.");
                } else {
                    String ultimo = historial.pop();
                    System.out.println("✔ Se deshizo: " + ultimo);
                }

            } else {
                historial.push(texto);
                System.out.println("✔ Guardado en historial.");
            }
        }

        System.out.println("\n📌 Historial final:");
        if (historial.isEmpty()) {
            System.out.println("El historial está vacío.");
        } else {
            for (String h : historial) {
                System.out.println("- " + h);
            }
        }
    }
}


import java.util.HashSet;
import java.util.Scanner;

/*🔥 Ejercicio 8 – HashSet + validación

Enunciado:
Pide al usuario ingresar correos electrónicos.
No permitas correos repetidos.
Cuando termine, muestra la lista final. */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var correos = new HashSet<String>();

        while(true){
            System.out.println("Ingrese correo(Para salir escribir salir)");
            String co = sc.nextLine();

            if(co.equalsIgnoreCase("salir")){
                break;
            }else{
                if(correos.contains(co.toLowerCase())){
                    System.out.println("Correo repetido, no se agrego.");
                    continue;
                }else{
                    correos.add(co.toLowerCase());
                }
            }
        }

        System.out.println("La lista de correos es:\n" + correos + ".");
    }
}

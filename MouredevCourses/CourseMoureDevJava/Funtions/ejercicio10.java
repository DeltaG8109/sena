//10.Crea una funcion que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio10 {

    public static void ingresarNombres(ArrayList<String> names){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese nombres a almacenar(salir para salir)");
            String nombre = sc.nextLine();
            if(nombre.equalsIgnoreCase("sAlir")){
                break;
            }else{
                names.add(nombre);
            }
        }
    }
    public static void mostrarE(ArrayList<String> n){
        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
    }
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        ingresarNombres(names);
        mostrarE(names);
    }

    
}

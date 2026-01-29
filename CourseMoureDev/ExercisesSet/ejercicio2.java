
import java.util.HashSet;
import java.util.Scanner;

/*Pide al usuario que ingrese nombres (uno por uno).
El programa termina cuando escriba "fin". */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var names = new HashSet<String>();

        var condition = true;
        var cont = 0;
        while(condition){
            System.out.println("Ingrese un nombre:");
            var n = sc.nextLine();
            cont++;
            if(n.equalsIgnoreCase("fin")){
                condition = false;
            }else{
                names.add(n);
            }
        }

        System.out.println("Cantidad de nombres diferentes ingreso es de \n" + cont);
        System.out.println("Lista de nombres unicos:\n" + names);
    }
}

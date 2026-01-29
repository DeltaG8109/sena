
import java.util.HashSet;
import java.util.Scanner;

/*Pide al usuario que ingrese edades hasta que escriba -1.
Luego muestra:

Cuántas edades únicas hay

Las edades guardadas */
public class ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        var nums = new HashSet<Integer>();

        while(true){
            System.out.println("Ingrese edades(Para salir escribir -1)");
            var n = sc.nextInt();

            if(n == -1){
                break;
            }else{
                nums.add(n);
            }
        }

        System.out.println("LA cantidad de edades unicas es de :" + nums.size() + ".");

        System.out.println("Las edades guardadas son " + nums);

    }
}

//10.Crea un programa que calcule el factorial de un numero dado.
public class ejercicio10 {
    public static void main (String[] args){

        var num = 4;
        var factorial = 1;
        for(int i = 1; i <= 4 ; i++){
            factorial *= i;
        }

        System.out.println("El factorial del " + num + " es " + factorial);
    }
}

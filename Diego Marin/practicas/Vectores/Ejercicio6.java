
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1=0 , num2= 0, mayor = 0, menor= 0;
        int vector [] = new int [10];
        System.out.println("Ingrese un numero entero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese un segundo número entero: ");
        num2 = entrada.nextInt();
        
        if(num1>num2){
            mayor = num1;
            menor = num2;
        }else{
            mayor = num2;
            menor = num1;
        }
        int indice = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = menor; j <= mayor; j++) {
                int contador = 0;
                for (int k = 1; k <= j; k++) {
                    if(j % k == 0){
                        contador++;
                    }
                }
                if(contador == 2 && indice<vector.length){
                    vector[indice] = j;
                    indice++;
                }
            }
        }
        System.out.println("Los primeros 10 números primos entre: "+ menor + " y "+ mayor +" son: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}

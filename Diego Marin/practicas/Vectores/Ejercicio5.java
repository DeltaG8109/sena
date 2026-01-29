//5. Almacenar en un vector de 10 posiciones los 10 números primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
package Vectores;

public class Ejercicio5 {
    public static void main(String[] args) {
        int vector [] = new int [10];
       
        int indice = 0;
        for (int j = 100; j <= 300; j++) {
            int contador = 0;
            for (int k = 1; k <= j; k++) {
                if (j % k == 0){
                    contador++;
                }
            }
            if(indice < 10){
                if(contador == 2){
                    vector [indice] = j;
                    indice++;
                    
                }
            }
                
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}

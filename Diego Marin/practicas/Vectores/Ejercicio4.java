
package Vectores;


public class Ejercicio4 {
    public static void main(String[] args) {
        int vector [] =  new int [10];
        vector[0] = 0; vector[1] = 1;
        
        for (int i = 2; i < 10; i++) {
           vector[i] = (vector[i-1]) + (vector[i-2]);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}

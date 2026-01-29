//37. Leer dos matrices 4x6 enteras y determinar si el número mayor de una matriz se encuentra en la misma posición exacta en la otra matriz.
import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Matriz 1

        int m1 [][] = new int[2][3];

        //Matriz 2
        int m2 [][] = new int[2][3];

        //Llenar m1

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.println("i=" + i + "j="+ j );
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz 2\n");
        //Llenar m2
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.println("i=" + i + "j="+ j );
                m2[i][j] = sc.nextInt();
            }
        }

        //Buscar la posicion mayor en la primer matriz
        int posF= 0, posC = 0, mayor = 0;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if(m1[i][j] >mayor ){
                    mayor = m1[i][j];
                    posF = i;
                    posC = j;
                }
            }
        }

        //Buscar si esta en el a posi exacta
        boolean encuentra = false;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {

                if((posF == i && posC == j) && m2[i][j] == mayor){
                    encuentra = true;
                    break;
                }
            }
        }

        if(encuentra){
            System.out.println("Se encuentra en la misma posicion.");
        }else{
            System.out.println("No se encuentra");
        }
    }
}

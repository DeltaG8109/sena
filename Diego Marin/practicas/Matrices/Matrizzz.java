package com.mycompany.zsz;

import java.util.Scanner;
public class Matrizzz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [][] matriz = new int [4][4];
        
        System.out.println("Ingrese los 16 números de la matriz 4x4: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Número en posición: ["+(i+1)+ "]["+(j+1) +"]");
            
            matriz [i][j] = entrada.nextInt();
            }
        }
    
    int mayor = matriz [0][0];
    int filaMayor = 1;
    int colMayor = 1;
    
        for(int i = 0; i < 4 ; i ++){
            for (int j = 0; j < 4; j++) {
                if (matriz [i][j] > mayor ){
                    mayor = matriz [i][j];
                    filaMayor = i + 1;
                    colMayor = j + 1;
                }
            }
        }
        
        System.out.println("El número es mayor "+ mayor);
        System.out.println("Se encuentra en la fila " +filaMayor);
        System.out.println("Se encuentra en la columna " + colMayor);
        
        entrada.close();
    }
}


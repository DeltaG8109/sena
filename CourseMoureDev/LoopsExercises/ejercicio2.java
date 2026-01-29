//2.Usando un bucle do-while para mostar todos los valores de un ArrayList.

import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args){
        var n = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            n.add(i);
        }

        System.out.println(n + "\n\n");
        System.out.println("----------------------------------");

        var cont = 0;

        do {
            System.out.println(n.get(cont));
            cont++;
        } while(cont < n.size());
    }
}

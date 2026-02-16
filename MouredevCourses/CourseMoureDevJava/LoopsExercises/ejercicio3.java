//3.Imprimelos multiplos de 5 del 1 al 50 usnado un for.
public class ejercicio3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}

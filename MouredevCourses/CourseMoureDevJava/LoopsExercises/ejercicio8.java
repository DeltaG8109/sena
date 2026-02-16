//8.Usa continue para saltar los multiplos de 3 del 1 al 20.
public class ejercicio8 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 20; i++) {
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}

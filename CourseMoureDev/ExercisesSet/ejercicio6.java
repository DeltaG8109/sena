
import java.util.HashSet;

/*Crea un método que reciba un HashSet<Integer>
y retorne cuántos números son mayores a 18. */
public class ejercicio6 {

    static int cantN(HashSet<Integer> n){
        var cont = 0;
        for(int number : n){
            if(number >= 18){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        
        var nums = new HashSet<Integer>();
        nums.add(15);
        nums.add(14);
        nums.add(19);
        nums.add(18);
        nums.add(21);
        System.out.println(cantN(nums));
    }
}
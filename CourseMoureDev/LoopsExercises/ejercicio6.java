
import java.util.HashMap;
import java.util.HashSet;

//6.Usa for-each para recorrer un HashSet y un HashMap.

public class ejercicio6 {
    public static void main(String[] args) {
        HashSet<Integer> n = new HashSet<>();

        HashMap<Integer,Integer> nums = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            n.add(i+1);
        }
        System.out.println(n);

        for (int i = 0; i < 10; i++) {
            nums.put(i, (i+1));
        }
        System.out.println(nums);

        for(Integer num : n){
            System.out.println(num);
        }

        for(HashMap.Entry<Integer, Integer> entry : nums.entrySet()){
            System.out.println("Clave: " + entry.getKey() + " Valor: " + entry.getValue());
        }
    }
}

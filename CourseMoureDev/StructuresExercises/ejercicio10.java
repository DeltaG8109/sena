//Dado una Array, transformalo en un ArrayList, a continuacion en un HashMao
import java.util.ArrayList;
import java.util.HashMap;
public class ejercicio10 {
    public static void main(String[] args) {
        int num[] = new int[5];

        num[0] = 14;
        num[1] = 1;
        num[2] = 18;
        num[3] = 24;
        num[4] = 94;

        for (int i : num) {
            System.out.println(i);
        }

        //Convertirlo a ArrayList
        var newNum = new ArrayList<Integer>();

        for (int i = 0; i < num.length; i++) {
            newNum.add(num[i]);
        }

        System.out.println(newNum);

        //Convertirlo a HashMap
        var newMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < newNum.size(); i++) {
            newMap.put(newNum.get(i), newNum.get(i));
        }

        System.out.println(newMap);

    }
}

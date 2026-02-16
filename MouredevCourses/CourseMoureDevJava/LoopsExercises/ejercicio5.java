//5.Usa un for para recorrer un Array y mostrar sus valores.
public class ejercicio5 {
    public static void main(String[] args) {
        
        int nums[] = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }

        for (int i: nums) {
            System.out.println(i);
        }
    }
}

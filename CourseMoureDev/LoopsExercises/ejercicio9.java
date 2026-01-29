//9.Usa break para detener un bucle cuando encuentres un numero negativo en una Array.
public class ejercicio9 {
    public static void main(String[] args) {
        int nums[] = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }

        nums[3] = -5;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                System.out.println("Numero negativo encontado es el " + nums[i]);
                break;
            }
            System.out.println(nums[i]);
        }
    }
}

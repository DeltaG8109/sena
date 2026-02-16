//2.Modifica uno de los valores de la Array e imprime el valor del indice antes y despues de modificarlo.

public class ejercicio2 {
    public static void main(String[] args) {
        
        int nums[] = new int[5];

        nums[0] = 54;
        nums[1] = 81;
        nums[2] = 30;
        nums[3] = 10;
        nums[4] = 11;
        System.out.println(nums[0]);
        nums[0] = 125;
        System.out.println(nums[0]);
    }
}

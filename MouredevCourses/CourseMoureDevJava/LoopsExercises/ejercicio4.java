//4.Recorre un Array de 5 numeros e imprime la suma total.
public class ejercicio4 {
    public static void main(String[] args) {
        int n[] = new int[5];

        for (int i = 0; i < n.length; i++) {
            n[i] = i;
        }

        var sum = 0;
        for (int num : n) {
            sum += num;
        }

        System.out.println("La suma de todos los numeros de la Array es de " + sum + ".");
    }
}

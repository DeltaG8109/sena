//9.Escribe un metodo que reciba un numero y retorna su factorial
public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("El factorial del numero es " + factorial(5) + ".");
    }

    public static int factorial(int n){
        var fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

//6.Crea un metodo que reciba una edad y retorne true si es mayor de edad.
public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esMayor(18));
    }

    public static boolean esMayor(int n){
        if(n > 17){
            return true;
        }
        return false;
    }
}

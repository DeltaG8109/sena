//5.Escribe una funcion que reciba un numero y diga si es par o impar.
public class ejercicio5 {
    public static void main(String[] args) {
        parOImpar(10);
    }

    public static void parOImpar(int n){
        if(n % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar.");
        }
    }

}

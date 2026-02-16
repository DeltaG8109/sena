public class Rentangle{
    public static void area(int base, int altura){
        System.out.println("El area del Rentangulo es " + ((base * altura)/2));
    }

    public static void perimetro(int base, int altura){
        System.out.println("El perimetro del Rentangulo es " + ((base + altura)*2));
    }

    public static void main(String[] args) {
        Rentangle rectangle1 = new Rentangle();
        rectangle1.area(10, 5);
        rectangle1.perimetro(10, 5);
    }
}
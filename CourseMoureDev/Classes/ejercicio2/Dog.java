//2.Crea una clase Dog con un metodo bark() que imprima su sonido.
public class Dog {

    String sound;

    public void bark(String sound){
        this.sound = sound;
    }

    public void mostrarSonido(String sound){
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Dog sonido = new Dog();

        sonido.mostrarSonido("Guau Guau Guau");
    }

}

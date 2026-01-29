// 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.

public class jer3{
    public static void main(String[] args) {
        
        var dog = new Dog();
        dog.makeSound();

        var cat = new Cat();
        cat.makeSound();
    }

    public static class  Animal {

        public void makeSound(){
            System.out.println("Hacer sonido.");
        }
    }

    public static class  Dog extends Animal{

        @Override
        public void makeSound(){
            System.out.println("Woof");
        }
    }

    public static class  Cat extends Animal{

        @Override
        public void makeSound(){
            System.out.println("Meow");
        }
    }

}
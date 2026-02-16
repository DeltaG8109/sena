public class Inheritance {
    public static void main(String[] args){

        //Herencia

        var animal = new Animal("Mi Animal");
        animal.eat();

        var dog = new dog("Juan",25);
        dog.eat();

        var cat = new cat("CatJuan");
        cat.eat();

        var bird = new bird("Dario");
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        public Animal(String name){
            this.name = name;
        }

    
        public void eat(){
            System.out.println("El animal con nombre " + name +" esta comiendo.");
        }

    }

    public static class dog extends Animal{

        int age;

        public dog(String name, int age){
            super(name);
            this.age = age;
        }

        
    }

    public static class cat extends Animal{
        public cat(String name){
            super(name);
        }
    }

    public static class bird extends Animal{
        
        public bird(String name){
            super(name);
        }
        public void fly(){
            System.out.println("Esta volando.");
        }
    }
}


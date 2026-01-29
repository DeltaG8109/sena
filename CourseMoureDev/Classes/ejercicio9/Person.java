import java.util.ArrayList;
public class Person{
    static ArrayList<String> names = new ArrayList<>();
    String name;
    int age;
    

    public Person(String name, int age){
        
        this.name = name;
        this.age = age;
        this.names.add( name);
    }

    public void viewNameAndAge(){
        System.out.println("El nombre es " + this.name + " la edad es " + this.age + ".");
    }

    public void viewAllNames(){
        System.out.println( "\n La lista de nombres es " + this.names + ".");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan", 20);
        Person person2 = new Person("Dario", 25);
        Person person3 = new Person("Car", 32);
        Person person4 = new Person("Andres", 29);

        person4.viewNameAndAge();
        System.out.println(Person.names);
    }
}
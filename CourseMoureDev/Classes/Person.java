public class Person {

    //Atributos
    String name;
    int age;

    //Constructor sirve para obligar a ingresar name y age
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    //Metodos
    public void sayHello(){
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }
    
}

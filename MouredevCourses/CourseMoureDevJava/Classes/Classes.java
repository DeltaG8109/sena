public class Classes{
    public static void main(String[] args) {
        var person = new Person("Juan",23);

        person.sayHello();

        person.name = "Esteban";
        System.out.println(Person.name);

    }
}


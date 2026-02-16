// 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().

public class ejer2{

    public static void main(String[] args) {
        var person = new Person("Dario gomez",  23);

        System.out.println(person.name + "\n" + person.age);

        var student = new Student("Juan", 18);

        student.grade = 11;

        System.out.println(student.name + "\n" + student.age);
        student.Study();

    }

    public static class Person{
        
        String name;
        int age;

        public Person(String name,int age){
            this.name = name;
            this.age = age;
        }

        public String getname(){
            return name;
        }

        public int getAge(){
            return age;
        }

    }

    public static class Student extends Person{

        int grade;

        public Student(String name,int age){
            super(name, age);
        }

        public int grade(){
            return grade;
        }

        public void Study(){
            System.out.println("Estudiante esta estudiando.");
        }
    }
}

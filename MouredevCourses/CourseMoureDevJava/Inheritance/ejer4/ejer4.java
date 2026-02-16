// 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

public class ejer4{
    public static void main(String[] args){
        var employee = new Employee(1600000, "Juan");

        System.out.println(employee.getSalary());
        System.out.println(employee.getName());

        var manager = new Manager(1700000, "Dario","Caldas");
        
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());

        System.out.println(manager.getDepartment());
    }
}
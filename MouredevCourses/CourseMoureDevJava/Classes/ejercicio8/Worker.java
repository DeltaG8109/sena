public class Worker{
    String name;
    Double salary;

    public Worker(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public void viewSalary(){
        System.out.println("EL salario de " + this.name + " es de " + this.salary + ".");
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Dario Gomez",150000.0);

        worker.viewSalary();
    }
}
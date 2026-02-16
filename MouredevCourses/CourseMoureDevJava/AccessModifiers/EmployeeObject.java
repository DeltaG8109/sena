public class EmployeeObject {
    
    private String name;
    private double salary;

    public EmployeeObject(String name,double salary){
        setName(name);
        setSalary(salary);
    }

    public void getName(){
        System.out.println(this.name);
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            System.out.println("Error!");
        }else{
            this.name = name;
        }
    }

    public void getSalary(){
        System.out.println(this.salary);
    }
    
    public void setSalary(double salary){
        if(salary < 0){
            System.out.println("Error!");
        }else{
            this.salary = salary;
        }
    }

    public void raiseSalary(double porcent){
        double newSalary = ((salary * (porcent/100)) + salary);
        if(porcent > 0){
            System.out.println("Su salario incrementa a " + newSalary + "." );
            this.salary = newSalary;
        }else{
            System.out.println("Error, porcentaje debe ser positivo.");
        }
    }
}

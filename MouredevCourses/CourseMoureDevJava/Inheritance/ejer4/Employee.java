public class Employee {
    int salary;
    String name;

    public Employee(int salary,String name){
        setSalary(salary);
        setName(name);
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        if(salary < 1){
            System.out.println("Error.");
        }else{
            this.salary = salary;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.trim().isEmpty()){
            System.out.println("Error.");
        }else{
            this.name = name;
        }
    }
}

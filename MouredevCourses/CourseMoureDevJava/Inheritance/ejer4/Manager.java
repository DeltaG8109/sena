public class Manager extends Employee{
    private String deparment;

    public Manager(int salary,String name,String department){
        super(salary, name);
        this.deparment = department;
    }

    public String getDepartment(){
        return deparment;
    }
}

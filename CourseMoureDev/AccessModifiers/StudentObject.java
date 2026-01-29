public class StudentObject {
    private int grade;

    public StudentObject(int grade){
        setGrade(grade);
    }

    private void setGrade(int grade){
        if(grade > 0 && grade < 100){
            this.grade = grade;
        }else{
            System.out.println("Error.");
        }
    }

    public boolean isPassed(){
        if(this.grade >= 60){
            return true;
        }else{
            return false;
        }
    }
}

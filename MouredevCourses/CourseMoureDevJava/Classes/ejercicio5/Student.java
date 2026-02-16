package ejercicio5;


public class Student {
    int score;

    public Student(int score){
        this.score = score;
    }
    public void validation(){
        if(this.score>= 60){
            System.out.println("Aprobo.");
        }else{
            System.out.println("Reprobo.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(50);
        student1.validation();
    }
}


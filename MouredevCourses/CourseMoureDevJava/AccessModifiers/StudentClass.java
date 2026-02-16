public class StudentClass {
    public static void main(String[] args) {
        StudentObject student1 = new StudentObject(100);

        if(student1.isPassed()){
            System.out.println("Paso.");
        }else{
            System.out.println("No paso.");
        }
    }
}

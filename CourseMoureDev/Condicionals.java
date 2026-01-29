public class Condicionals {
    public static void main(String[] args) {
        
        //Condicionals 

        var age = 37;

        if (age > 17) {
            System.out.println("El usuario e smayor de edad.");    
        }
        
        //Switch

        var day = 2;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Ni lunes, ni martes, ni miercoles");
        }
    }
}

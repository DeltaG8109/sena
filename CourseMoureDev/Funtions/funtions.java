import java.util.ArrayList;
import java.util.Arrays;

public class funtions {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            sendEmail();
        }
        sendEmail();

        sendEmailToUser("montoyajuanes11@gmail.com");
        sendEmailToUser("montoyajuanes11@gmail.com","Dario");
    
        var users = new ArrayList<>(Arrays.asList("Juan","Esteban","Montoya"));
        sendEmailToUser(users);

        var state = sendEmailWithState("");
        System.out.println(state);
    }

    //Funcion  sin parametros sin retorno
    public static void sendEmail(){
        System.out.println("Se envia el email");
    }

    //Funcion con parametros

    public static void sendEmailToUser(String email){
        System.out.println("Se envia email a " + email);
    }

    public static void sendEmailToUser(String email,String name){
        System.out.println("Se envia email a " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails){
        for (int i = 0; i < 10; i++) {
            
        }
    }

    //Funcion con retorno

    public static boolean sendEmailWithState(String email){
        if(email.isEmpty()){
            return false;
        }
        System.out.println("Se envia el email a " + email);
        return true;
    }
}

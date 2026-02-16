import java.util.Scanner;

public class UserObject {

    private String username;
    private String password;

    public UserObject(String username,String password){
        setUsername(username);
        setPassword(password);
    }

    public void setUsername(String username){
        if(username == null || username.trim().isEmpty()){
            System.out.println("Error");
        }else{
            this.username = username;
        }
    }

    public void setPassword(String password){
        if(password == null || password.trim().isEmpty()){
            System.out.println("Error");
        }else{
            this.password = password;
        }
    }
    
    public void checkPassword(){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        while (cont < 3) {
            System.out.println("Ingrese clave para poder iniciar sesion:");
            String inputPassword = sc.nextLine();
            if(inputPassword.equals(this.password)){
                System.out.println("Acceso concedido.");
                break;
            }else{
                System.out.println("Contraseña incorrecta.");
                cont++;
            }
        }
        if(cont == 3){
            System.out.println("Su cuenta ha sido bloqueada, demasiados intentos fallidos.");
        }
    }
}

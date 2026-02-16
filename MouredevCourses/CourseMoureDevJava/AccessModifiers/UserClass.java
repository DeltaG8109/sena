
import java.util.Scanner;

public class UserClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserObject user1 = new UserObject("Juan8109", "Jem_1002576545");

        user1.checkPassword();
    }
}

//4.Añade 4 valores al ArrayList y elimina uno a continuacion.
import java.util.ArrayList;
public class ejercicio4 {
    public static void main(String[] args) {
        var n = new ArrayList<String>();

        n.add("Juan");
        n.add("Karen");
        n.add("Cris");
        n.add("Santy");

        System.out.println(n);

        n.remove(0);
        
        System.out.println(n);

    }
}

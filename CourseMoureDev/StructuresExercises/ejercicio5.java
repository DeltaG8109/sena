//5. Crea un HashSet con 2 valores diferentes

import java.util.HashSet;

public class ejercicio5 {
    public static void main(String[] args) {
        
        var names = new HashSet<>();

        names.add("Juan");
        names.add("Juan");
        names.add("Karen");
        names.add("Cris");

        System.out.println(names);
        
        //Eliminar uno de los elementos HahSet

        names.remove("Juan");

        System.out.println(names);
    }
}

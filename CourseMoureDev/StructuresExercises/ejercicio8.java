//8.Crea un HashMap donde la clave sea un nombre y el valor el numero de telefono.Añade 3 contactos
import java.util.HashMap;

public class ejercicio8 {
    public static void main(String[] args) {
        HashMap<String, Long> names = new HashMap<>();

        names.put("Juan", 3137498332L);
        names.put("Pablo", 3113576220L);
        names.put("Milena", 3148943364L);

        System.out.println(names);
        System.out.println("El numero de Milena es " + names.get("Milena"));

        //Modifica uno de los contactos y elimina el otro

        names.replace("Juan", 123L);
        names.remove("Pablo");

        System.out.println(names);
    }
}

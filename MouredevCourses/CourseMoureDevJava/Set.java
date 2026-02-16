
import java.util.HashSet;

public class Set {
    public static void main(String[] args){

        //Declaracion y Creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos
        names.add("Brais");
        names.add("Moure");
        names.add("MoureDev");
        names.add("MoureDev");
        System.out.println(names.size());

        //Acceder a los elementos

        System.out.println(names);

        //Buscar elementos
        System.out.println(names.contains("Brais"));
        System.out.println(names.contains("MoureDev"));
    }
}

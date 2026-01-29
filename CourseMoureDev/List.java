
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
        //Decalaracion y cracion
        ArrayList<String> names = new ArrayList<>();
        var number = new ArrayList<>();

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos
        names.add("Brais");
        names.add("Moure");
        names.add("MoureDev");
        System.out.println(names.size());

        //Accede a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        //Modificar elementos 
        names.set(2,"montoyajuan11@gmail.com");
        System.out.println(names.getLast());

        //Eliminar elementos 
        names.remove(2);

        //Buscar elementos
        System.out.println(names.contains("Brais"));
        System.out.println(names.contains("MoureDev"));

        //Limpiar la ArrayList
        names.clear();
        System.out.println(names.size());

    }
}

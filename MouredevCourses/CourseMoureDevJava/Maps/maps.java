import java.util.HashMap;

public class maps{
    public static void main(String[] args) {
        
        //Declaracion de HashMap
        var names = new HashMap<String,String>();
        var numbers = new HashMap<Integer, String>();

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos

        names.put("Dario", "gomez@gmail.com");
        names.put("Juan", "juan@gmail.com");
        names.put("Carlos", "carlos@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        //Acceder a los elementos

        System.out.println(names.get("Dario"));

        //Verificar el elemento
        System.out.println(names.containsKey("Dari"));

        //Eliminar elementos
        System.out.println(names.remove("Dario"));
        System.out.println(names.remove("Juan"));

        //Lipiar HashMap

        names.clear();
        System.out.println(names);
    }
}
public class Strings {
    public static void main(String[] args) {
        //Trim
        System.out.println(" Hola, me llamo Juan ".trim());

        //Replace
        System.out.println((" Hola, me llamo Juan ".replace("Juan","Esteban")).trim());

        var name = "Juan";
        var age = 23;
        //Format
        System.out.println(String.format("Hola, %s.Tengo %d.", name, age));

        //Mayus and Minus
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        name = name.toUpperCase();

        System.out.println(name);

        //Comprobar si contiene
        System.out.println("Hola, Java".contains("Brais"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        //Comparacion
        System.out.println(name.equals("JUAN"));
        System.out.println(name.equalsIgnoreCase("jUAn"));

        //== VS equals
        var a = "Brais";
        var b = "Brais";
        var c = new String("Brais");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        //Replace
        System.out.println(" Hola, me llamo Juan ".replace(" ", ""));

        
    }
}

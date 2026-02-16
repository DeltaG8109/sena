public class StringExercises {
    public static void main(String[] args) {
        
        //1.Concatena dos cadenas de Texto
        System.out.println("Juan " + "Montoya");

        //2.Muestra la longitud de una cadena de texto
        System.out.println("Juan".length());

        //3.Muestra el primer y uñtimo caracter de un String
        var a = "Juan";
        System.out.println(a.charAt(a.length()-a.length()));
        System.out.println(a.charAt(a.length()-1));

        //4.Convierte a Mayusculas y Minusculas un String
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        //5.Comprueba si una cadena de texto contiene una palabra concreta
        System.out.println(a.equals("Juan"));

        //6.Formatea un String con un entero
        System.out.println(String.format("Juan tiene %d", 23));

        //7.Elimina los espacios en blanco del pincipio y del final
        System.out.println(" Juan tiene 25 años ".trim());

        //8.Sustituye todos los espacios en blanco de un String por un guion -.
        System.out.println(" Juan tiene 25 años ".replace(" ", "-"));

        //9.Comprueba si dos Strings son iguales
        var aa = "Juan";
        var bb = "Juan";

        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));

        //10.Comprueba si dos Strings tienen la misma longitud.
        System.out.println(aa.length() == bb.length());
    }
}

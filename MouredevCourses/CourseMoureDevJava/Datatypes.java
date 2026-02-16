public class Datatypes {
    public static void main(String[] args) {
        

        //Tipos de Datos Primitivos

        int myInt = 23;
        System.out.println(myInt);

        double myDouble = 1.75;
        System.out.println(myDouble);

        //float,long,byte
        char myChar = 'n';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);

        //Tipo de dato en tiempo de compilacion

        System.out.println(myString.getClass().getSimpleName());
    }
}

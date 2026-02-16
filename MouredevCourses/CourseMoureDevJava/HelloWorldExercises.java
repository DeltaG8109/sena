public class HelloWorldExercises{
    public static void main(String[] args){
        
        //Imprime un mensaje que diga tu nombre en lugar de hola mundo!
        System.out.println("Hola, Juan!");

        //Imprime dos lines: "Hola" y luego "Mundo" con un solo println
        System.out.println("Hola" + "\nMundo");

        //Añade un comentaro sobre lo que hace cada linea

        //Crea un comentario de varias lineas
        /*Esto
        es 
        un
        comentario de varias lineas */

        //Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("23\nMorado\nPereira");

        //Explora varios System.XXX.println(); mas alla del "out"
        System.gc();

        //Utiliza varios println para imprimir una frase
        System.out.println("Hola");
        System.out.println("Querido ");
        System.out.println("Y");
        System.out.println("Amado");
        System.out.println("Mundo");

        //Imprime un diseño ASCII (por ejemplo cara feliz usando simbolos)
        int n = 90;
        System.out.println((char) n);
        System.out.println("    _ ____ ____ ___ ___ ____ _ _                      \r\n" + //
                        "   / \\ / ___| / ___|_ _|_ _| | _ \\ __ _| |_| |_ ___ _ __ _ __ ___\r\n" + //
                        "  / _ \\ \\___ \\| | | | | | | |_) / _` | __| __/ _ \\ '__| '_ \\/ __|\r\n" + //
                        " / ___ \\ ___) | |___ | | | | | __/ (_| | |_| || __/ | | | | \\__ \\\r\n" + //
                        "/_/ \\_\\____/ \\____|___|___| |_| \\__,_|\\__|\\__\\___|_| |_| |_|___/");

        //Intenta ejecutar el metodo main y observa el error

    }
}
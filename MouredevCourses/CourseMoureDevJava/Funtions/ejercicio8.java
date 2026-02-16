
public class ejercicio8 {
    public static void main(String[] args) {
        int array[] = {1,25,21,14,12};

        System.out.println("La media de la array es " + media(array));
    }

    public static int media(int array[]){
        
        var suma = 0;
        for(int a : array){
            suma += a;
        }
        var me = suma / array.length;
        return me;
    }
}

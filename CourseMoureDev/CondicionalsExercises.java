public class CondicionalsExercises {
    public static void main(String[] args) {
        
        //1.Establece la edad de un usuario y muestra si puede votar(mayor o igual a 18)
        var age = 18;

        if(age >= 18){
            System.out.println("El usuario puede Votar.");
        }else{
            System.out.println("El usuario no puede votar.");
        }

        //2.Decalare dos numeros y muestra cual es mayor, o si son iguales.

        var num1 = 10;
        var num2 = 20;

        if(num1 > num2){
            System.out.println("El numero mayor es " + num1 + ".");
        }else if(num2 > num1){
            System.out.println("El numero mayor es " + num2 + ".");
        }else{
            System.out.println("Los numeros son iguales");
        }

        //3.Dado un numero, verifica si es positivo, negativo o cero.
        
        var num = 0;

        if(num > 0){
            System.out.println("El numero es positivo");
        }else if(num < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }

        //4.Crea un programa que diga si un numero es par o impar.

        var n = 15;

        if(n % 2 != 0){
            System.out.println("Es un numero impar.");
        }else{
            System.out.println("El numero es par.");
        }

        //5.Verifica si un numero esta en el rango del 1 al 100.
        if( n > 0 && n < 101){
            System.out.println("El numero esta en el rango del 1 al 100.");
        }else{
            System.out.println("El numero NO esta en el rango del 1 al 100.");
        }
        //6.Declara una variable con el dia de la semana(1-7) y muesttra su nombre con swich
        var d = 7;
        switch (d) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Ningun dia de la semana.");
        }

        //7.Simula un sistema de notas: muestra Sobresaliente, Aprobado o suspenso segun la nota de 0 a 100.

        var nota = 79;

        if(nota > 79 && nota < 101){
            System.out.println("Sobresaliente");
        }else if (nota > 45 && nota < 80) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspenso");
        }

        //8.Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var ageBoy = 14;
        var compain = false;

        if(ageBoy > 15 || compain == true){
            System.out.println("Puede entrar al Cine.");
        }else{
            System.out.println("No puede entrar al Cine.");
        }

        //9.Crea un programa que diga si una letra es vocal o consonante (char)

        var ch = 'a' ;

        if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
            System.out.println("Es vocal");
        }else{
            System.out.println("Es consonante");
        }

        //10.Usa tres variables a, b , c y muestra cual es mayor de las 3
        var aaa = 25;
        var bbb = 31;
        var ccc = 17;

        if(aaa > bbb && aaa > ccc){
            System.out.println("El numero mayor es" + aaa);
        }
    }
}

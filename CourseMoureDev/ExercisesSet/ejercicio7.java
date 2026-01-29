/*🔵 Ejercicio 7 – Comparar dos HashSet
Enunciado:
Crea dos HashSet:
Uno con materias de un estudiante
Otro con materias aprobadas

Muestra:
Materias aprobadas
Materias pendientes

Pistas:
removeAll()
retainAll() */

import java.util.HashSet;

public class ejercicio7 {
    public static void main(String[] args) {
        
        var mate = new HashSet<String>();
        var mateApro = new HashSet<String>();

        mate.add("Matematicas");
        mate.add("Ingles");
        mate.add("Castellano");
        mate.add("Sociales");
        mate.add("Religion");
        mate.add("Etica");

        mateApro.add("Matematicas");
        mateApro.add("Ingles");
        mateApro.add("Castellano");

        System.out.println("Materias aprobadas\n"+ mateApro + ".");

        var pendientes = new HashSet<String>(mate);
        pendientes.removeAll(mateApro);

        //Materias no aprobadas
        System.out.println(pendientes);
        
        
    }
}

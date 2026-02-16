//1.Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
public class Book {
    
    String title;
    String author;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void mostrarDatos() {
    System.out.println("\nTítulo: " + title);
    System.out.println("Autor: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Juego de Tronos","Juan");

        b1.mostrarDatos();
    }
}

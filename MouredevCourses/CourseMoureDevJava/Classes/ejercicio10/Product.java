public class Product{
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void discount(){
        
        double precioConDescuento = this.price - (this.price * 0.10);

        String precioOriginalFormateado = String.format("%,.0f", this.price).replace(",", ".");

        String precioNuevoFormateado =
                String.format("%,.0f", precioConDescuento).replace(",", ".");
        System.out.println("El descuento es del 10 % antes valia $" + precioOriginalFormateado + " queda en $" + precioNuevoFormateado + "." );
    }

    public static void main(String[] args) {
        Product product1 = new Product("Ferrar", 600000.0);

        product1.discount();
    }
}
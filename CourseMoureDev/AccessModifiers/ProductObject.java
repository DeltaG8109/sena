//Crea una clase product con el atributo privado price. Añade el metodo setPrice(double price) que solo permita productos mayores a 0
public class ProductObject {
    
    private double price;

    public ProductObject(double price) {
        setPrice(price);
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Error, Price incorrect");
        }
    }

    public double getPrice(){
        return price;
    }
}

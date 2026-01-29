//4.Crea una clase Car con atributos brand y model y un metodo showData().

public class Car {
    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void showData(){
        System.out.println("\nBrand: " + brand + "\nModel: " + model);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Maseratti", "2026");
        Car car2 = new Car("Ferrari Pura Sangre", "2023");
        car1.showData();
        car2.showData();
    }
}

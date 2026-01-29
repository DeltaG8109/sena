// 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().

public class ejer1 {
    public static void main(String[] args) {
        
        var vehicle = new Vehicle();

        vehicle.move();

        Car car = new Car();

        car.move();
        car.honk();


    }

    public static class Vehicle{
        public void move(){
            System.out.println("Vehiculo moviendose.");
        }
    }
    
    public static class Car extends Vehicle{

        
        public void honk(){
            System.out.println("Vehiculo pitando.");
        }
    }
}
    

    
    


public class CarClass {
    
    public static void main(String[] args) {
        CarObject car1 = new CarObject(100);
        System.out.println(car1.getSpeed());
        car1.accelerate(10);
        System.out.println(car1.getSpeed());
        car1.brake(10);
        System.out.println(car1.getSpeed());
        car1.brake(50);
        System.out.println(car1.getSpeed());
        car1.accelerate(50);
        System.out.println(car1.getSpeed());
    }
    
}

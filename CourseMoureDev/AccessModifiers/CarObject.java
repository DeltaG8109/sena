public class CarObject {

    private int speed;

    public CarObject(int speed){
        setSpeed(speed);
    }
    
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if(speed > 0){
            this.speed = speed;
        }else{
            System.out.println("Error.");
        }
    }

    public void accelerate(int amount){
        if(amount > 0 ){
            int aum = amount + this.speed;
            if(aum <= 120){
                this.speed = aum;
            }
            
        }else{
            System.out.println("Error.");
        }
    }

    public void brake(int amount){
        if(amount > 0 && amount <= speed ){
            this.speed -= amount;
        }else{
            System.out.println("Error.");
        }
    }
}

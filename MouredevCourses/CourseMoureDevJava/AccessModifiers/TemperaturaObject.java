public class TemperaturaObject {
    
    private double celsius;

    public TemperaturaObject(double celsius){
        setCelsius(celsius);
    }

    public double getCelsius(){
        return celsius;
    }

    public void setCelsius(double celsius){
        if(celsius > -101 && celsius < 101){
            this.celsius = celsius;
        }else{
            System.out.println("Error!");
        }
    }
}

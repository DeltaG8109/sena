public class RentangleObject {

    private double width;
    private double height;

    public RentangleObject(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    public void getWidth(){
        System.out.println(this.width);
    }

    public void getHeight(double width){
        System.out.println(this.height);
    }

    public void setWidth(double width){
        if(width < 0){
            System.out.println("Error!");
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height){
        if(height < 0){
            System.out.println("Error!");
        }else{
            this.height = height;
        }
    }

    public double calcularArea(){
        return this.width * this.height;
    }
}

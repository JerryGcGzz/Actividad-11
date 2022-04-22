public class Circle implements Shape{

    public static final double Pi = 3.141592;
    private double radio;

    public Circle(){
    }

    public Circle(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getPerimeter(){
        return 2*radio*Pi;
    }
    public double getArea(){
        return radio*radio*Pi;
    }
}

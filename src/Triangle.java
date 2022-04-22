public class Triangle implements Shape{

    private double lado;
    private double altura;

    public Triangle(){
    }

    public Triangle(double lado){
        this.lado = lado;
        this.altura = calculateHeight();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        this.altura = calculateHeight();
    }

    public double getAltura() {
        return altura;
    }

    public double getPerimeter(){
        return 3*lado;
    }

    public double getArea(){
        return (lado*altura) / 2.0;
    }

    public double calculateHeight(){
        return (Math.sqrt(3.0)*this.lado) / 2.0;
    }
}

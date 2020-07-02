package _00_University_Java.Experiment;

public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return a * b;
    }

}

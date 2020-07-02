package _00_University_Java.Experiment;

public class Circle extends Shape {
    double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public double getArea() {
        return r * r * 3.14;
    }

}

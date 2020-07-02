package _00_University_Java.Experiment;

public abstract class Shape {
    String color;

    public Shape() {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public String show() {
        return this.color;
    }

    public abstract double getArea();

}

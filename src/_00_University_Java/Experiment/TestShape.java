package _00_University_Java.Experiment;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle("红色", 9.8);
        System.out.println("圆形颜色为：" + circle.color);
        System.out.println("半径为：" + circle.r);
        System.out.println("面积为：" + circle.getArea());
        Rectangle rectangle = new Rectangle("绿色", 9.2, 7.8);
        System.out.println("长方形颜色为：" + rectangle.color);
        System.out.println("长方体长为：" + rectangle.a + "宽为：" + rectangle.b);
        System.out.println("面积为：" + rectangle.getArea());
    }
}

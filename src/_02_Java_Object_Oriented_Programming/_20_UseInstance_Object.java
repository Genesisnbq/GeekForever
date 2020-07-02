package _02_Java_Object_Oriented_Programming;

public class _20_UseInstance_Object {
    // 从数据类型的角度看, 类就是自己创建了一个新的数据类型
    // 一个java程序中, 不允许类同名
    // 和统一路径下, 不能有相同名字的文件有异曲同工之妙
    //>>todo 使用new 操作符, 可以创建一个类的实例/对象(instance/object)
    // 创建一个 _20_Class 的实例
    public static void main(String[] args) {
        Merchandise m1 = new Merchandise();
        System.out.println(m1.name + " " + m1.count + " " + m1.price); //缺省值(初值)
        m1.name = "茉莉花茶"; // 不给他赋值是 null
        m1.id = "20200313";
        m1.count = 100;
        m1.price = 99.9;

        Merchandise m2 = new Merchandise();
        m2.name = "可口可乐";
        m2.id = "20200314";
        m2.count = 100;
        m2.price = 99999.9;
        // .操作符类似与的
        // 用new创建对象变量
        // 用对象变量来指向对象
        // 用. 来读写 成员变量的值
    }
}

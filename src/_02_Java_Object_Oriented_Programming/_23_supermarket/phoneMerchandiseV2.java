package _02_Java_Object_Oriented_Programming._23_supermarket;

//>> TODO 继承的语法就是在类名后面使用extends 加要继承的类名
//>> TODO 被继承的类叫做父类(Parent Class), 比如本例中的Merchandise
//>> TODO 继承者叫做字类(SubClass), 比如本例中的 phoneMerchandiseV2
//>> TODO 没错, 别的类也可以继承字类, 比如可以有一个HuaweiPhone继承PhoneMerchandiseV2
// TODO 这时候, HuaweiPhone就是phoneMerchandiseV2的子类了
//>> TODO 子类继承了父类的什么呢? -> 所有的属性和方法
//>> TODO 但是子类并不能访问父类的private的成员(包括方法和属性)
public class phoneMerchandiseV2 extends Merchandise {

    // 给phone增加新的属性和方法
    private double screenSize;
    private double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;

    public phoneMerchandiseV2(String name, String id, int count, double soldPrice,
                              double purchasePrice, double screenSize, double cpuHZ,
                              int memoryG, int storageG, String brand, String os) {
        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;
    }
}

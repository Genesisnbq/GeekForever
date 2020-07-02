package _02_Java_Object_Oriented_Programming._23_supermarket;

public class phoneMerchandiseV1 {
    // 给phone 增加新的属性和方法
    private double screenSize;
    private double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;

    // 我们要从商品类里复制所有的方法和属性, 因为这是一个商品最基础的属性和操作
    private String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;

    // 构造方法
    public phoneMerchandiseV1(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    // 构造方法的重载
    public phoneMerchandiseV1(String name, String id, int count, double soldPrice) {
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }

    public phoneMerchandiseV1() {
        this("无名", "000", 0, 1, 1.1);
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        return soldPrice - purchasePrice;
    }

    public boolean meetCondition() {
        return true;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getCpuHZ() {
        return cpuHZ;
    }

    public void setCpuHZ(double cpuHZ) {
        this.cpuHZ = cpuHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getOs() {
        return os;
    }
}

package _00_JavaGui.FruitStore.src.doMain;

/**
 * 水果项的数据模型信息
 * 水果项模型
 */
public class FruitItem {
    //id
    private int id;
    //编号
    private String number;
    //名称
    private String name;
    //价格
    private double price;
    //计价单位
    private String unit;

    //构造方法
    public FruitItem() {
        super();
    }

    public FruitItem(String number, String name, double price, String unit) {
        super();
        this.number = number;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }


    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}

package _02_Java_Object_Oriented_Programming._50_hashCodeAndEquals.supermarket;

import java.util.Objects;

public class MerchandiseV2 {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;


    public MerchandiseV2(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public MerchandiseV2(String name, String id, int count, double soldPrice) {
        // double purPrice = soldPrice * 0.8;
        // this(name, id, count, soldPrice, purchasePrice);
        this(name, id, count, soldPrice, soldPrice * 0.8);
        // double purPrice = soldPrice * 0.8;
    }

    public MerchandiseV2() {
        this("无名", "000", 0, 1, 1.1);

    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + calculateProfit());
    }

    public double calculateProfit() {
        return soldPrice - purchasePrice;
    }

    public double buy(int count) {
        if (this.count < count) {
            System.out.println("购买失败，库存不够");
            return -1;
        }
        this.count -= count;
        double cost = count * soldPrice;
        System.out.println("购买成功，花费为" + cost);
        return cost;
    }


    // >> TODO hashCode 和 equals是我们最常覆盖的两个方法
    // >> TODO 覆盖的原则是，equals为true，hashCode就应该相等。这是一种约定俗成的规范
    // >> TODO 即equals为true是hashCode相等的充分非必要条件，hashCode相等是equals为true的必要不充分条件


    // 可以调用这个equals方法, 说明我本身不是null,但是传进来的参数有可能是null
    // 所以首先需要判断一下传进来的参数是不是null
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // 必须得是我的对象或者是我的子类, instanceof 才会是true
        if (!(o instanceof MerchandiseV2)) return false;
        MerchandiseV2 that = (MerchandiseV2) o; // 强转  将Object o 强制转换为 MerchandiseV2,不然类型不匹配
        return getCount() == that.getCount() &&
                Double.compare(that.getSoldPrice(), getSoldPrice()) == 0 &&
                Double.compare(that.getPurchasePrice(), getPurchasePrice()) == 0 &&
                getName().equals(that.getName()) &&
                getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getCount(), getSoldPrice(), getPurchasePrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}

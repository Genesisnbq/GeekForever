package _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket;

public class Merchandise {
    public String name;
    public String id;
    //Todo 将 count 改成double 兼容散装产品
    public double count;
    public double soldPrice;
    public double purchasePrice;

    /**
     * 初始化方法
     * 这是javadoc
     *
     * @param name          商品的名字
     * @param id            商品的id
     * @param count         商品的数量
     * @param soldPrice     商品的售价
     * @param purchasePrice 商品的进价
     */
    public void init(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        if (soldPrice < 0) {
            //检查合法性
            System.out.println("售价不合法, 设置为0");
            this.soldPrice = 0;
        } else this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + ", id是" +
                id + ", 商品售价是" + soldPrice +
                ", 商品得库存量是" + count + ", 销售一个得毛利润是" +
                (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        if (profit <= 0) {
            return 0;
        } else {
            return profit;
        }
    }

    //>> TODO 如果返回值是基本类型, 则符合自动转换规则  小可以转大  大不能转小  int->long  long!-> int
    public double getCurrentCount() {
        return count;
    }

    public int getIntSoldPrice() {
        return (int) soldPrice; // 强制转换成与返回值匹配的类型
    }

    //>>todo 参数是定义在方法名字后面的括号里的
    //>>todo 参数定义的规范和变量一样,都有类型名字加标识符,这里的标识符叫做参数名
    //>>todo 方法体中的代码可以使用参数
    //>>todo 参数的值在调用方法的时候需要给出,实参(实际参数)
    //  todo 方法定义这里的参数, 叫做形参(形式参数)
    // 如果返回值是负数, 就代表购买失败, 比如库存不足
    public void buy(int countToBuy) { // 带参数的方法
        if (count < countToBuy) {
            System.out.println("商品库存不够");
            return;
        }
        System.out.println("商品单价为: " + purchasePrice);
        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = purchasePrice * fullPriceCount + halfPriceCount * purchasePrice / 2;
        count -= countToBuy;
    }// 一个方法可以有多个参数

    // TODO 论斤卖的商品，数量是double。我们把count成员变量改成double类型
    public void buy(double count) {
        System.out.println("buy(double)被调用了");
        if (this.count < count) {
            return;
        }
        this.count -= count;
        double totalCost = count * soldPrice;
    }

    public boolean hasEnoughCountFor(int count) {
        return this.count >= count;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public void makeEnoughForOneByOne(int count) {
        boolean hasEnough = this.hasEnoughCountFor(count);
        if (!hasEnough) {
            this.addCount(1);
            makeEnoughForOneByOne(count);  // IntelliJ 会在最左边有一个绿色的标记(递归)
        }
    }
}

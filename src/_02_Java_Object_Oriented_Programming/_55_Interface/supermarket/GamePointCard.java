package _02_Java_Object_Oriented_Programming._55_Interface.supermarket;

import java.util.Date;

// >> TODO 一个类只能继承一个父类，但是可以实现多个接口
// >> TODO 如果实现的接口里定义了一样的方法，那么也没问题。但是要求方法名，参数，返回值类型都必须一摸一样。
public class GamePointCard extends MerchandiseV2 implements ExpireDateMerchandise, VirtualMerchandise {

    private final Date produceDate;
    private final Date expirationDate;

    public GamePointCard(String name, String id, int count, double soldPrice, double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice);
        this.produceDate = produceDate;
        this.expirationDate = expirationDate;
    }

    // >> TODO 一个类实现接口，就是从接口继承了抽象方法
    public boolean notExpireInDays(int days) {
        return daysBeforeExpire() > days;
    }

    public Date getProducedDate() {
        return produceDate;
    }

    public Date getExpireDate() {
        return expirationDate;
    }

    //剩余保质期的百分比
    public double leftDatePercentage() {
        return 1.0 * daysBeforeExpire() / (daysBeforeExpire() + daysAfterProduce());
    }

    public double actualValueNow(double leftDatePercentage) {
        return soldPrice;
    }

    private long daysBeforeExpire() {
        long expireMS = expirationDate.getTime();
        long left = expireMS - System.currentTimeMillis();
        if (left < 0) {
            return -1;
        }
        // 返回值是long，是根据left的类型决定的
        return left / (24 * 3600 * 1000);
    }

    private long daysAfterProduce() {
        long expireMS = expirationDate.getTime(); // 返回从1970年到现在的时间(毫秒)
        long left = expireMS - System.currentTimeMillis(); //得到商品保质期剩余的毫秒数
        if (left < 0) { // <0寿命截至到当前, 已经过期了
            return -1;
        }
        // 返回值是long，是根据left的类型决定的
        return left / (24 * 3600 * 1000); // 用毫秒/一天有多少毫秒, 可以得到保质期还有多少天
    }


}

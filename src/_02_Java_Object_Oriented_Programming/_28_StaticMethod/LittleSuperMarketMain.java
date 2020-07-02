package _02_Java_Object_Oriented_Programming._28_StaticMethod;

import _02_Java_Object_Oriented_Programming._28_StaticMethod.Supermarket.*;

public class LittleSuperMarketMain {
    public static void main(String[] args) {
        // 创建一个小超市类
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket(
                "有家小超市", "浦东新区世纪大道666号",
                100, 200, 200);

        System.out.println("VIP的折上折折扣最终为：" + Merchandise.getDiscountOnDiscount(littleSuperMarket));

    }
}

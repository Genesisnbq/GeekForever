package _02_Java_Object_Oriented_Programming._25_Supermarket_System;

import _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket.*;

public class LittleSupermarketConstructorMain {
    public static void main(String[] args) {
        // 创建一个小超市类
        LittleSupermarketConstructor littleSuperMarket = new LittleSupermarketConstructor(
                "有家小超市", "浦东新区世纪大道666号",
                100, 200, 200);

        System.out.println("下面请利润最高的商品自我介绍：");
        littleSuperMarket.getBiggestProfitMerchandise().describe();
    }
}
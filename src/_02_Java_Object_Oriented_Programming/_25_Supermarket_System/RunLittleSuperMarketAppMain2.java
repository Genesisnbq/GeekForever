package _02_Java_Object_Oriented_Programming._25_Supermarket_System;

import _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket.LittleSuperMarket;
import _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket.Merchandise;

public class RunLittleSuperMarketAppMain2 {
    public static void main(String[] args) {
        // 创建一个小超市类
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
//        // 依次给超市的名字，地址，停车位赋值
//        littleSuperMarket.supermarketName = "有家小超市";
//        littleSuperMarket.address = "浦东新区世纪大道666号";
//        littleSuperMarket.parkingCount = 100;
//        // 给超市200种商品
//        littleSuperMarket.merchandise = new Merchandise[200];
//        // 统计用的数组
//        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandise.length];
//
//        // 为了使用方便，创建一个商品数组引用，和littleSuperMarket.merchandises指向同一个数组对象
//        Merchandise[] all = littleSuperMarket.merchandise;
//        // 遍历并给200种商品赋值
//        for (int i = 0; i < all.length; i++) {
//            // 创建并给商品的属性赋值
//            Merchandise m = new Merchandise();
//            m.name = "商品" + i;
//            m.count = 200;
//            m.purchasePrice = Math.random() * 200;
//            m.soldPrice = m.purchasePrice * (1 + Math.random());
//            m.id = "ID" + i;
//            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
//            all[i] = m;
//        }
        littleSuperMarket.init("有家小超市", "浦东新区世纪大道666号",
                100, 200, 200);

        System.out.println("LittleSupermarket的对象是: " + littleSuperMarket);
        System.out.println("下面请利润最高的商品自我介绍：");
        // >> TODO 返回值可以直接使用，不必赋值给一个变量再使用。
//        littleSuperMarket.getBiggestProfit().describe();
        Merchandise m = littleSuperMarket.getBiggestProfit();  // m是利润最高的商品
        m.describe();
        System.out.println("利润最高的Merchandise对象是: " + m);
        if (!m.hasEnoughCountFor(500)) {
            System.out.println("补充库存");
            int toBeAdded = 500;
            littleSuperMarket.incomingSum -= toBeAdded * m.purchasePrice; //用超市的收入-购买费用
            m.addCount(toBeAdded);
        }
    }
}

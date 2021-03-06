package _02_Java_Object_Oriented_Programming._50_hashCodeAndEquals;

import _02_Java_Object_Oriented_Programming._50_hashCodeAndEquals.supermarket.LittleSuperMarket;
import _02_Java_Object_Oriented_Programming._50_hashCodeAndEquals.supermarket.MerchandiseV2;

public class ObjectEqualsAppMain {
    public static void main(String[] args) {

        int defaultCount = 200;
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, defaultCount);

        MerchandiseV2 t0 = new MerchandiseV2(
                "商品" + 0,
                "ID" + 0,
                defaultCount,
                1999,
                999
        );

        MerchandiseV2 t10 = new MerchandiseV2(
                "商品" + 10,
                "ID" + 10,
                defaultCount,
                1999,
                999
        );

        MerchandiseV2 t100 = new MerchandiseV2(
                "商品" + 100,
                "ID" + 100,
                defaultCount,
                1999,
                999
        );

        // >> TODO 看看结果为什么是这样？
        System.out.println(superMarket.findMerchandise(t0));
        System.out.println(superMarket.findMerchandise(t10));
        System.out.println(superMarket.findMerchandise(t100));

    }

}

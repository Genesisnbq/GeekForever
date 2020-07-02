package _02_Java_Object_Oriented_Programming._54_Enumerate;

import _02_Java_Object_Oriented_Programming._54_Enumerate.supermarket.LittleSuperMarket;

public class LittleSupperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        superMarket.getBiggestProfitMerchandise().describe();
    }
}

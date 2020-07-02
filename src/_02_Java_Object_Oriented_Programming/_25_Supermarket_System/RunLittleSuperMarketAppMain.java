package _02_Java_Object_Oriented_Programming._25_Supermarket_System;

import java.util.Scanner;

import _02_Java_Object_Oriented_Programming._25_Supermarket_System.person.Customer;
import _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket.LittleSuperMarket;
import _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket.Merchandise;

public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道666号";
        littleSuperMarket.supermarketName = "彬琪超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandise = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandise.length];
        //littleSuperMarket.merchandise[i]
        Merchandise[] all = littleSuperMarket.merchandise;
        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200; // 1-200
            m.soldPrice = (1 + Math.random()) * 200 + 1; //200-400
            all[i] = m;  // 通过引用来修改值
        }
        System.out.println("超市开门啦!");
        boolean open = true;
        Scanner in = new Scanner(System.in);
        while (open) {
            LittleSuperMarket t = littleSuperMarket;
            System.out.println("本店叫做" + t.supermarketName);
            System.out.println("本店地址" + t.address);
            System.out.println("共有停车位" + t.parkingCount + "个");
            System.out.println("今天的营业额为" + t.incomingSum);
            System.out.println("共有商品" + t.merchandise.length + "种");
            Customer customer = new Customer();
            Customer c = customer;
            c.name = "顾客编号" + ((int) (Math.random() * 10000));
            c.money = (1 + Math.random()) * 1000;
            c.isDrivingCar = Math.random() > 0.5;
            if (c.isDrivingCar) {
                if (t.parkingCount > 0) {
                    System.out.println("欢迎" + c.name + "驾车而来. 本店已经为您安排了车位,停车免费");
                    t.parkingCount--;
                } else {
                    System.out.println("不好意思, 本店车位已满. 欢饮下次光临");
                }
                double totalCost = 0.0;
                while (true) {
                    System.out.println("本店提供" + all.length + "种商品, 欢迎选购. 请输入商品编号");
                    int index = Integer.parseInt(in.nextLine());
                    if (index < 0) {
                        break;
                    }
                    if (index >= all.length) {
                        System.out.println("本店没有这种商品, 请输入编号在0-" + (all.length - 1) +
                                "之内的商品编号.");
                        continue;
                    }
                    Merchandise m = all[index];
                    System.out.println("您选购的商品名字" + m.name + ". 单价是" + m.soldPrice + ". 请问" +
                            "您要购买多少个?");
                    int numToBuy = Integer.parseInt(in.nextLine());
                    if (numToBuy <= 0) {
                        System.out.println("不买看看也好! 欢饮继续挑选.");
                        continue;
                    }
                    if (numToBuy > m.count) {
                        System.out.println("本店库存没那么多, 欢饮继续选购");
                        continue;
                    }
                    if (numToBuy * m.purchasePrice > customer.money) {
                        System.out.println("您带的钱不够, 欢迎继续挑选.");
                        continue;
                    }
                    totalCost += numToBuy * m.soldPrice;
                    m.count -= numToBuy;
                    t.merchandiseSold[index] += numToBuy;
                }
                c.money -= totalCost;
                if (c.isDrivingCar) {
                    t.parkingCount++;
                }
                System.out.println("顾客" + c.name + "共消费了" + totalCost);
                t.incomingSum += totalCost;
                System.out.println("还继续营业吗?");
                open = in.nextBoolean();
            }
            System.out.println("超市关门啦! ");
            System.out.println("今天总的营业额为" + t.incomingSum + ". 营业情况如下:");
            for (int i = 0; i < t.merchandiseSold.length; i++) {
                Merchandise m = all[i];
                int numSold = t.merchandiseSold[i];
                if (numSold > 0) {
                    double incoming = m.soldPrice * numSold;
                    double netIncoming = (m.soldPrice - m.purchasePrice) + numSold;
                    System.out.println(m.name + "售出了" + numSold + "个, 销售额为" + incoming + ". 净利润为" +
                            netIncoming);
                }
            }
        }
    }
}

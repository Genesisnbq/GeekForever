package _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket;

// 方法调用的结果
public class MerchandiseDescAppMain {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise();
//        merchandise.name = "书桌";
//        merchandise.soldPrice = 999.9;
//        merchandise.purchasePrice = 500;

//        merchandise.count = 40;
//        merchandise.id = "DESK009";
        merchandise.init("书桌", "DESK0009", 40, 999.9, 500);
        merchandise.describe();
        // 把内和外分开, 可以做更多的事情

    }
}

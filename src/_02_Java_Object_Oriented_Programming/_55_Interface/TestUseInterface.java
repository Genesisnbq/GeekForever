package _02_Java_Object_Oriented_Programming._55_Interface;

import java.util.Date;

import _02_Java_Object_Oriented_Programming._55_Interface.supermarket.*;

public class TestUseInterface {
    public static void main(String[] args) {
        Date produceDate = new Date(); //空代表是当前时间
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard = new GamePointCard(
                "手机001", "Phone001", 100, 1999, 999,
                produceDate, expireDate
        );

        // >>TODO 接口也是一种类型, 枚举也是一种类型, 给接口的引用赋值, 类似于可以使用子类的引用给父类赋值
        ExpireDateMerchandise expireDateMerchandise = gamePointCard;
        VirtualMerchandise virtual = gamePointCard;

        MerchandiseV2 m = gamePointCard;
        expireDateMerchandise = (ExpireDateMerchandise) m;
        virtual = (VirtualMerchandise) m;

        if (m instanceof ExpireDateMerchandise) {
            System.out.println("m 是 ExpireDateMerchandise类型的实例");
        }

        if (m instanceof VirtualMerchandise) {
            System.out.println("m 是 VirtualMerchandise类型的实例");
        }
    }
}

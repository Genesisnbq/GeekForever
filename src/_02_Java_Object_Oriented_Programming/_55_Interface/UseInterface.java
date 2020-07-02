package _02_Java_Object_Oriented_Programming._55_Interface;


import _02_Java_Object_Oriented_Programming._55_Interface.supermarket.ExpireDateMerchandise;
import _02_Java_Object_Oriented_Programming._55_Interface.supermarket.GamePointCard;
import _02_Java_Object_Oriented_Programming._55_Interface.supermarket.MerchandiseV2;
import _02_Java_Object_Oriented_Programming._55_Interface.supermarket.VirtualMerchandise;

import java.util.Date;

public class UseInterface {

    public static void main(String[] args) {

        Date produceDate = new Date(); //空就是当前时间
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard = new GamePointCard(
                "手机001", "Phone001", 100, 1999, 999,
                produceDate, expireDate
        );

        // phoneExtendsMerchandise.describe();


        //接口也是一种类型, 枚举也是一种类型, 类型就可以有引用, 就可以指向实例
        // >> TODO 可以用实现接口的类的引用，给接口的引用赋值。类似于可以使用子类的引用给父类赋值
        ExpireDateMerchandise expireDateMerchandise = gamePointCard;

        VirtualMerchandise virtual = gamePointCard;

        MerchandiseV2 m = gamePointCard;

        expireDateMerchandise = (ExpireDateMerchandise) m;

        virtual = (VirtualMerchandise) m;

        if (m instanceof ExpireDateMerchandise) {
            System.out.println("m 是 ExpireDateMerchandise 类型的实例");
        }

        if (m instanceof VirtualMerchandise) {
            System.out.println("m 是 VirtualMerchandise 类型的实例");
        }


    }
}

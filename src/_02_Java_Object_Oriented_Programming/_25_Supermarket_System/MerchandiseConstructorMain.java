package _02_Java_Object_Oriented_Programming._25_Supermarket_System;

import _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket.*;

public class MerchandiseConstructorMain {
    public static void main(String[] args) {
        MerchandiseWithConstructor merchandise = new MerchandiseWithConstructor("书桌",
                "DESK009", 40, 999.9, 500);

        // >> TODO 如果我们自己添加类构造方法，Java就不会再添加无参数的构造方法。
        // >> TODO 这时候，就不能直接 new 一个对象不传递参数了（看例子）
//         MerchandiseV2WithConstructor merchandise2 = new MerchandiseV2WithConstructor();

    }
}

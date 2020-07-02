package _02_Java_Object_Oriented_Programming._27_StaticVariable;

import _02_Java_Object_Oriented_Programming._27_StaticVariable.Supermarket.*;

// 引入这个类中所有的 静态变量
import static _02_Java_Object_Oriented_Programming._27_StaticVariable.Supermarket.MerchandiseWithStaticVariable.*; //这是java的新语法
// 也可以直接 类名.静态变量名 调用

public class MerchandiseMain {
    public static void main(String[] args) {
        MerchandiseWithStaticVariable merchandise = new MerchandiseWithStaticVariable
                ("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();

        // >> TODO 使用import static来引入一个静态变量，就可以直接用静态变量名访问了
        //    TODO import static也可以使用通配符*来引入一个类里所有静态变量
        // 两种方式
        System.out.println(DISCOUNT_FOR_VIP);
        System.out.println(MerchandiseWithStaticVariable.DISCOUNT_FOR_VIP);
    }
}



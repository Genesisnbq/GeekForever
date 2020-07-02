package _02_Java_Object_Oriented_Programming._31_VisibilityModifier;


import _02_Java_Object_Oriented_Programming._31_VisibilityModifier.Supermarket.*;
//import com.geekbang.supermarket.NonPublicClassCanUseAnyName;

public class MerchandiseMain {
    public static void main(String[] args) {
        // >> TODO 非共有的类，不能在包外被使用
//         NonPublicClassCanUseAnyName asd;
        Merchandise merchandise = new Merchandise
                ("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();
    }
}

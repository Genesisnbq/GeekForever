package _02_Java_Object_Oriented_Programming._37_ParentClassHideInSubclass;

import _02_Java_Object_Oriented_Programming._37_ParentClassHideInSubclass.supermarket.*;

public class UsePhoneHasAMerchandise {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise(
                "手机001", "Phone001", 100, 1999, 999);
        PhoneHasAMerchandise phone = new PhoneHasAMerchandise(
                4.5, 3.5, 4, 128, "索尼", "安卓", merchandise
        );
        phone.describePhone();

        //TODO 所有和商品相关的操作, 我们要先从Phone里获得商品的引用, 然后再通过这个引用操作商品
        //手机就不是商品了
        //TODO 所有和商品相关的操作, 我们要先从Phone里获得商品的引用, 然后再通过这个引用操作商品
        //TODO 我们可以在每次修改手机的厂商和型号的时候, 都去set一下商品的名字. 繁琐, 但是做得到
        phone.getMerchandise().describe();
        phone.getMerchandise().getName();

        //TODO 如果要限制购买的数量不超过5怎么办? 来移步继承
        phone.getMerchandise().buy(100);
    }
}

package _02_Java_Object_Oriented_Programming._38_Overlay;

import _02_Java_Object_Oriented_Programming._38_Overlay.supermarket.*;

public class UsePhoneExtendsMerchandise {
    public static void main(String[] args) {
        Phone phone = new Phone(
                "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        phone.describePhone();
        System.out.println();

        System.out.println(phone.getName());
        System.out.println();

        phone.buy(100);

        phone.buy(3);
    }
}

package _02_Java_Object_Oriented_Programming._64_runSupermarketCode_Design;


import _02_Java_Object_Oriented_Programming._64_runSupermarketCode_Design.supermarket.Phone;

public class UsePhoneMerchandise {
    public static void main(String[] args) {
        Phone phone = new Phone(
                "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        // phoneExtendsMerchandise.describe();

        phone.describePhone();
    }
}

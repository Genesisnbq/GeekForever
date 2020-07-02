package _02_Java_Object_Oriented_Programming._41_ParentAndSonReferenceAssignmentRelationship;

import _02_Java_Object_Oriented_Programming._41_ParentAndSonReferenceAssignmentRelationship.supermarket.*;

public class LittleSupermarketMain {
    public static void main(String[] args) {
        LittleSupermarket superMarket = new LittleSupermarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        Merchandise m0 = superMarket.getMerchandiseOf(0);
        m0.describe();
        System.out.println();
        Merchandise m100 = superMarket.getMerchandiseOf(100);
        m100.describe();
        System.out.println();
        Merchandise m10 = superMarket.getMerchandiseOf(10);
        m10.describe();
    }
}

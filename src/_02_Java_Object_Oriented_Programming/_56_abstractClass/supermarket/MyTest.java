package _02_Java_Object_Oriented_Programming._56_abstractClass.supermarket;

import java.util.Date;

public class MyTest extends AbstractExpireDateMerchandise {
    public MyTest(String name, String id, int count, double soldPrice, double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice, produceDate, expirationDate);
    }

    @Override
    public double actualValueNow(double leftDatePercentage) {
        return 0;
    }

    @Override
    protected void test() {

    }
}

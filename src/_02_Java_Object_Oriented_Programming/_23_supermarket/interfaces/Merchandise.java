package _02_Java_Object_Oriented_Programming._23_supermarket.interfaces;

public interface Merchandise {

    String getName();

    double getSoldPrice();

    double getPurchasePrice();

    int buy(int count);

    void putBack(int count);

    Category getCategory();

    int getCount();
}

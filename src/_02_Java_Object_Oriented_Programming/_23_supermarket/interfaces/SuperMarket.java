package _02_Java_Object_Oriented_Programming._23_supermarket.interfaces;

public interface SuperMarket {

    Merchandise[] getAllMerchandise();

    Merchandise[] getRandomMerchandiseOfCategory(Category category);

    void addEarnedMoney(double earnedMoney);

    void dailyReport();

}

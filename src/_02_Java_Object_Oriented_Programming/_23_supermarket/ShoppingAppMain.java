package _02_Java_Object_Oriented_Programming._23_supermarket;

import _02_Java_Object_Oriented_Programming._23_supermarket.impl.SimpleShopman;
import _02_Java_Object_Oriented_Programming._23_supermarket.interfaces.Customer;
import _02_Java_Object_Oriented_Programming._23_supermarket.interfaces.Shopman;
import _02_Java_Object_Oriented_Programming._23_supermarket.interfaces.SuperMarket;

import static _02_Java_Object_Oriented_Programming._23_supermarket.util.ShoppingUtil.*; //直接引入静态方法

public class ShoppingAppMain {
    public static void main(String[] args) {

        SuperMarket superMarket = createSuperMarket();

        Shopman shopman = new SimpleShopman(superMarket);

        boolean open = true;
        while (open) {
            new ShoppingTask(shopman).executeTask();
            output("是否继续营业？(Yes)");
            open = !input().next().trim().equalsIgnoreCase("no");
        }
        superMarket.dailyReport();
    }

}

class ShoppingTask {
    private Shopman shopman;

    public ShoppingTask(Shopman shopman) {
        this.shopman = shopman;
    }

    public void executeTask() {
        Customer customer = createCustomer(true);
        shopman.serveCustomer(customer);

    }

}

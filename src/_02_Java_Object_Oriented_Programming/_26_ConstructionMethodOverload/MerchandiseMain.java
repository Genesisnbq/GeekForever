package _02_Java_Object_Oriented_Programming._26_ConstructionMethodOverload;

import _02_Java_Object_Oriented_Programming._26_ConstructionMethodOverload.Supermarket.*;

public class MerchandiseMain {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise("vscode环境配置", "20200411", 100, 10);
        merchandise.describe();
    }
}

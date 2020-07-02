package _00_JavaGui.FruitStore.src.data;

import java.util.ArrayList;

import _00_JavaGui.FruitStore.src.doMain.FruitItem;
import org.w3c.dom.ls.LSOutput;

/**
 * 存储数据的方式
 */
public class DataBase {
    public static ArrayList<FruitItem> data = new ArrayList<FruitItem>();

    //初始数据
    static {
        data.add(new FruitItem("1", "苹果", 5.0, "kg"));
    }

    public static ArrayList<FruitItem> getData() {
        return data;
    }
}

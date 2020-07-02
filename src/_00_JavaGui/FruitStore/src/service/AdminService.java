package _00_JavaGui.FruitStore.src.service;

import _00_JavaGui.FruitStore.src.dao.AdminDao;
import _00_JavaGui.FruitStore.src.doMain.FruitItem;

import java.util.ArrayList;

/**
 * 管理界面的功能服务类
 */
public class AdminService {
    //查询功能服务
    public static ArrayList<FruitItem> queryFruitItem() {
        //调用dao包中的获取所有数据方法的 queryFruitItem
        //返回数据
        return AdminDao.queryAllData();
    }

    //添加功能服务
    public static boolean addFruitItem(String number, String name, String price, String unit) {
        //调用dao中的获取所有数据方法queryAllData()
        ArrayList<FruitItem> data = AdminDao.queryAllData();
        //编号进行对比, 观察集合中是否已经有了
        for (FruitItem datum : data) {
            if (number.equals(datum.getNumber())) {
                return false;
            }
        }
        FruitItem thisFruitItem = new FruitItem(number, name, Double.parseDouble(price), unit);
        //调用dao中的添加数据的方法 addFruitItem()
        AdminDao.addFruitItem(thisFruitItem);
        //成功之后再返回
        return true;
    }

    //修改功能服务
    public static boolean updateFruitItem(String number, String name, String price, String unit) {
        //调用dao中的获取所有数据的方法queryAllData()
        ArrayList<FruitItem> data = AdminDao.queryAllData();
        //对比是否有相同编号, 有则操作, 无修改个毛
        for (FruitItem datum : data) {
            if (number.equals(datum.getNumber())) {
                //调用dao中的删除指定编号得方法deleteFruitItem()
                //先删除
                AdminDao.deleteFruitItem(number);
                //封装新的FruitItem
                FruitItem temp = new FruitItem(number, name, Double.parseDouble(price), unit);
                //先添加
                AdminDao.addFruitItem(temp);
                return true;
            }
        }
        return false;
    }

    //删除功能服务
    public static boolean deleteFruitItem(String number) {
        ArrayList<FruitItem> data = AdminDao.queryAllData();
        for (FruitItem datum : data) {
            if (number.equals(datum.getNumber())) {
                AdminDao.deleteFruitItem(number);
                return true;
            }
        }
        return false;
    }
}
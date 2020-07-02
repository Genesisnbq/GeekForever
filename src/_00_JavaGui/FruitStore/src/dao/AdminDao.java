package _00_JavaGui.FruitStore.src.dao;

//import _00_JavaGui.FruitStore.src.data.DataBase;

import _00_JavaGui.FruitStore.src.doMain.FruitItem;
import _00_JavaGui.FruitStore.src.tools.JDBCUtils;
import _00_JavaGui.FruitStore.src.tools.preparedData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 管理员界面按钮操作,数据访问类
 * 获取数据库的相关信息
 */
public class AdminDao {
    //获取所有数据
    public static ArrayList<FruitItem> queryAllData() {
        //创建一个ArrayList集合, 用来存储查询到的水果信息
        ArrayList<FruitItem> list = new ArrayList<>();
        //获取数据库的连接
        try {
            Connection conn = JDBCUtils.getConnection();
            //获取PreparedStatement对象
            String sql = "select * from fruit";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //执行SQL语句   查询
            ResultSet result = pstmt.executeQuery();
            //处理结果集
            while (result.next()) {
                //数据封装
                //把数据库中的每条数据(每行), 封装成FruitItem 对象,然后添加到list集合
                FruitItem fruitItem = new FruitItem();
                fruitItem.setId(result.getInt("id"));
                fruitItem.setName(result.getString("fruitname"));
                fruitItem.setNumber(result.getString("number"));
                fruitItem.setPrice(result.getDouble("price"));
                fruitItem.setUnit(result.getString("unit"));
                list.add(fruitItem);
            }
            pstmt.close();
            result.close();
            return list;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //添加数据
    public static void addFruitItem(FruitItem fruitItem) {
        try {
            Connection conn = JDBCUtils.getConnection();
            String sql = "insert into fruit(number, fruitname, price, unit) values(?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            preparedData.setData(pstmt, fruitItem.getNumber(), fruitItem.getName(),
                    fruitItem.getPrice(), fruitItem.getUnit());
            //执行SQL语句
            pstmt.executeUpdate();
            // 不关也没事, java有自动回收机制
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    //删除数据
    public static void deleteFruitItem(String deleteNumber) {
        try {
            Connection conn = JDBCUtils.getConnection();
            String sql = "delete from fruit where number = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, deleteNumber);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

//    //获取所有数据
//    public static ArrayList<FruitItem> queryAllData() {
//        return DataBase.data;
//    }
//
//    //添加数据
//    public static void addFruitItem(FruitItem fruitItem) {
//        DataBase.data.add(fruitItem);
//    }
//
//    //删除数据
//    public static void deleteFruitItem(String deleteNumber) {
//        //查询集合中的数据
//        for (int i = 0; i < DataBase.data.size(); i++) {
//            FruitItem thisFruitItem = DataBase.data.get(i);
//            //如果有水果项编号与传入编号相同, 则从集合中删除
//            if (thisFruitItem.getNumber().equals(deleteNumber)) {
//                DataBase.data.remove(i);
//            }
//        }
//    }
}

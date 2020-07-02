package _00_JavaGui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * JTable 表格
 */
public class _23_JTable extends JFrame {
    public _23_JTable() {
        super("JTable Demo");
        init(); //使用JTable表格对象来创建一个表格
    }

    //使用init()方法创建表格;
    public void init() {
        //定义一个一维数组 作为列标题
        Object[] columnNames = {"姓名", "年龄", "性别"};
        //定义一个二维数组, 作为表格中的数据  行  记录
        Object[][] rowDate = {
                new Object[]{"李清照", "29", "女"},
                new Object[]{"苏格拉底", "56", "男"},
                new Object[]{"李白", "35", "男"},
                new Object[]{"弄玉", "18", "女"},
                new Object[]{"倪彬琪", "20", "男"}
        };
        //创建一个表格
        JTable table = new JTable(rowDate, columnNames);
        this.add(new JScrollPane(table)); //表格可以有滚动条
        this.pack(); //自适应窗体大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
//        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _23_JTable();
    }
}

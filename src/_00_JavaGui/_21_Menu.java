package _00_JavaGui;

import java.awt.event.*;
import javax.swing.*;

/**
 * 菜单的创建和使用
 */
public class _21_Menu extends JFrame {
    public _21_Menu() {
        super("Menu Demo");
        JMenuBar menuBar = new JMenuBar(); //创建菜单栏
        JMenu menu = new JMenu("操作"); //创建菜单
        JMenuItem menuItem = new JMenuItem("弹出窗口");
        JMenuItem menuItem2 = new JMenuItem("关闭");
        //组建下拉式菜单
        menu.add(menuItem);
        menu.addSeparator();//添加分隔符
        menu.add(menuItem2);
        menuBar.add(menu);
        //为事件添加监听器
        ActionListener listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(_21_Menu.this, true);//模式对话框
                dialog.setTitle("弹出对话框");
                dialog.setSize(200, 200);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        };
        ActionListener listener2 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                _21_Menu.this.dispose();
                System.exit(0);
            }
        };
        menuItem.addActionListener(listener);
        menuItem2.addActionListener(listener2);
        this.setJMenuBar(menuBar); //菜单栏添加到窗体
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _21_Menu();
    }
}

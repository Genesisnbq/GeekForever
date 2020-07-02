package _00_JavaGui;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class _22_popupMenu extends JFrame {
    public _22_popupMenu() {
        super("PopupMenu Demo");
        //创建一个JPopupMenu 菜单
        JPopupMenu popupMenu = new JPopupMenu();
        //创建三个菜单项
        JMenuItem refreshItem = new JMenuItem("refresh");//刷新
        JMenuItem creteItem = new JMenuItem("create");//新建
        JMenuItem exitItem = new JMenuItem("exit");//退出
        //把菜单项添加到菜单中
        popupMenu.add(creteItem);
        popupMenu.addSeparator();
        popupMenu.add(refreshItem);
        popupMenu.addSeparator();
        popupMenu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //为JFrame 添加 鼠标监听器
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //如果点击的是鼠标的右键, 显示弹出菜单
                if (e.getButton() == e.BUTTON3) {//BUTTON3表示鼠标右键
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());//获取鼠标的点击坐标
                }
            }
        });
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _22_popupMenu();
    }
}

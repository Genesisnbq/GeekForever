package _00_JavaGui;

import java.awt.*;
import java.awt.event.*;

//使用匿名内部类处理事件
/*
用匿名内部类,实现程序
 */
public class _09_useAnonymousInnerClassesToHandleEvent {
    public static void main(String[] args) {
        Frame f = new Frame("我的窗体");
        f.setSize(400, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        Button button1 = new Button("Exit");//创建一个按钮
        f.add(button1);

        //用内部类的方式, 为按钮注册监听器
        //用匿名内部类的方式, 实现事件的处理
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}

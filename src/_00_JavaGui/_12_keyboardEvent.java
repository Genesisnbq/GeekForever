package _00_JavaGui;

import java.awt.event.*;
import java.awt.*;

public class _12_keyboardEvent {
    public static void main(String[] args) {
        Frame f = new Frame("KeyEvent");
        f.setLayout(new FlowLayout());
        f.setSize(400, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        TextField textField = new TextField(30); //创建文本框对象
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode(); //返回键对应的整数值
                //返回按键的字符串描述
                String s = KeyEvent.getKeyText(keyCode);
                System.out.println("输入的内容为: " + s + ",keyCode的值" + keyCode);
            }
        });
        f.add(textField);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭");
                f.dispose();
            }
        });
    }
}

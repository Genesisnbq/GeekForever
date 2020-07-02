package _00_JavaGui;

import java.awt.*;
import java.awt.event.*;

public class _06_noLayout {
    public static void main(String[] args) {
        Frame f = new Frame("不使用布局管理器");
        //取消Frame的布局管理器
        f.setLayout(null); //取消的效果
        f.setSize(400, 300);
        Button button1 = new Button("Press");
        Button button2 = new Button("Pop");
        //设置按钮显示的位置与大小
        button1.setBounds(40, 60, 100, 30);
        button2.setBounds(140, 90, 100, 30);
        //添加按钮到窗口
        f.add(button1);
        f.add(button2);
        f.setVisible(true);
    }
}

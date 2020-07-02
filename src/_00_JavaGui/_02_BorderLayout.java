package _00_JavaGui;

import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;

public class _02_BorderLayout {
    public static void main(String[] args) {
        // 创建一个名为 BorderLayout的布局管理器
        Frame f = new Frame("BorderLayout");// 创建一个名为BorderLayout的窗体
        f.setLayout(new BorderLayout()); //设置窗体中的布局管理器, 默认水平和垂直是 0 0
        f.setSize(300, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        //下面代码是创建5个按钮, 分别用于填充BorderLayout的5个区域
        Button button1 = new Button("Eastern");
        Button button2 = new Button("South");
        Button button3 = new Button("Western");
        Button button4 = new Button("North");
        Button button5 = new Button("Center");

        // 将设置好的按钮添加到窗体中, 被设置按钮所在位置
        f.add(button1, BorderLayout.EAST);
        f.add(button2, BorderLayout.SOUTH);
        f.add(button3, BorderLayout.WEST);
        f.add(button4, BorderLayout.NORTH);
        f.add(button5, BorderLayout.CENTER);


    }
}

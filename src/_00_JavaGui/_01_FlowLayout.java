package _00_JavaGui;

import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;

public class _01_FlowLayout {
    public static void main(String[] args) {
        // 创建一个名为 FlowLayout的窗体
        Frame f = new Frame("FlowLayout");
        // 设置窗体大小
        f.setSize(220, 300);
        //设置窗体显示位置
        f.setLocation(300, 200);
        // 设置窗体中额布局管理器 FlowLayout, 左对齐, 水平间距为20 像素, 垂直间距为30px 像素
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        // 把按钮添加到f窗体中
        f.add(new Button("First Button"));
        f.add(new Button("Second Button"));
        f.add(new Button("Third Button"));
        f.add(new Button("Fourth Button"));
        f.add(new Button("Fifth Button"));
        f.add(new Button("Sixth Button"));
        // 设置窗体可见
        f.setVisible(true);
    }
}

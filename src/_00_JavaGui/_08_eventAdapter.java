package _00_JavaGui;

import java.awt.*;
import java.awt.event.*;

public class _08_eventAdapter {
    public static void main(String[] args) {
        Frame f = new Frame("事件适配器");        //创建新窗体
        f.setSize(400, 300); //设置窗体大小
        f.setLocation(300, 200); // 设置窗体显示位置
        f.setVisible(true); // 设置窗体可见
        //为窗口注册监听器
        f.addWindowListener(new MyWindowListener1());
    }
}

//继承WindowAdapter类, 重写windowClosing方法
//通过继承windowAdapter类, 来写单一的事件处理, 而不用实现 WindowListener 接口
class MyWindowListener1 extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        Window window = (Window) e.getComponent();
        window.dispose();
    }
}

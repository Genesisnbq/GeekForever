package _00_JavaGui;

import java.awt.*;
import java.awt.event.*;

public class _07_AwtEventHandlingMechanism {
    public static void main(String[] args) {
        //创建新的窗体
        Frame f = new Frame("Awt事件处理机制");
        f.setSize(400, 300);//设置窗口的尺寸大小
        f.setLocation(300, 200); // 设置窗口显示位置
        f.setVisible(true);//设置窗口显示
        //为窗口的组件注册一个监听器

    }
}

//创建一个类叫做MyWindowListener类实现WindowListener 接口
class MyWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        //监听器监听对象做出处理
        Window window = e.getWindow();
        window.setVisible(false);
        //释放窗口
        window.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

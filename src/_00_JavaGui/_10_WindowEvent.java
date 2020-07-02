package _00_JavaGui;

import java.awt.*;
import java.awt.event.*;

/**
 * 窗口事件
 */
public class _10_WindowEvent {
    public static void main(String[] args) {
        Frame f = new Frame("WindowEvent");
        f.setSize(400, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        //使用内部类创建WindowListener对象
        //用这个对象监听窗体事件
        f.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("WindowOpened --- 窗体打开事件");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                Window window = (Window) e.getComponent();
                System.out.println("windowClosing --- 窗体正在关闭事件");
                window.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {

                System.out.println("windowClosed --- 窗口关闭事件");

            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified --- 窗口图标化事件");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified --- 窗体取消图标化事件");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated ---窗体激活事件");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated --- 窗体停用事件");
            }
        });
    }
}

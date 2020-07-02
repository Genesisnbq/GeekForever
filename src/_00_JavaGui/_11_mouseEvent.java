package _00_JavaGui;

import java.awt.*;
import java.awt.event.*;

/**
 * 鼠标事件
 */


public class _11_mouseEvent {
    public static void main(String[] args) {
        Frame f = new Frame("MouseEvent");
        f.setSize(400, 300);
        f.setLayout(new FlowLayout()); //使用流式布局管理器 FlowLayout
        f.setLocation(300, 200);
        f.setVisible(true);

        Button button1 = new Button("Button"); //创建一个按钮
        f.add(button1);//将按钮添加到窗体
        //为按钮添加 一个鼠标事件的监听器
//        button1.addMouseListener(new MouseListener() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println("mouseClicked --- 鼠标完成点击事件");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                System.out.println("mousePressed --- 鼠标按下事件");
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println("mouseReleased --- 鼠标释放事件");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                System.out.println("mouseEntered --- 鼠标进入按钮区域事件");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                System.out.println("mouseExited --- 鼠标移出按钮区域事件");
//            }
//        });
        button1.addMouseListener(new MyMouseListener());
    }
}

class MyMouseListener extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标完成点击");
    }
}

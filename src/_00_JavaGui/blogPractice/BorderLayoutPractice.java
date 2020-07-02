package _00_JavaGui.blogPractice;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPractice extends JFrame {
    JPanel jp1, jp2;
    JButton jb1, jb2, jb3, jb4, jb5, jb6;

    public static void main(String[] args) {
        BorderLayoutPractice borderLayout = new BorderLayoutPractice();
    }

    //构造函数
    public BorderLayoutPractice() {
        //创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();

        jb1 = new JButton("西瓜");
        jb2 = new JButton("苹果");
        jb3 = new JButton("荔枝");
        jb4 = new JButton("葡萄");
        jb5 = new JButton("桔子");
        jb6 = new JButton("流萤");

        //设置布局管理器
        // JPanel1 布局默认是 BorderLayout //添加JPanel
        // JPanel 属于容器类组件, 可以加入别的组件
        jp1.add(jb1);
        jp1.add(jb2);

        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);

        //把 JPanel 就爱如JFrame
        this.add(jp1, BorderLayout.NORTH);
        this.add(jp2, BorderLayout.SOUTH);
        this.add(jb6, BorderLayout.CENTER);

        JPanel jp3 = new JPanel();
        JButton jb13 = new JButton("new");
        JButton jb11 = new JButton("old");
        JButton jb12 = new JButton("yes!!");
        jp3.add(jb13);
        jp3.add(jb12);
        jp3.add(jb11);
        this.add(jp3, BorderLayout.WEST);


        this.setSize(300, 400);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}

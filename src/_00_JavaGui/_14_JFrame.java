package _00_JavaGui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

/**
 * JFrame
 */
public class _14_JFrame extends JFrame {
    public _14_JFrame() {
        this.setTitle("JFrameTest");
        this.setSize(250, 300);
        //定义一个按钮
        JButton button1 = new JButton("按钮"); //区别是他是在 swing包下的   awt
        //设置流式布局管理器
        this.setLayout(new FlowLayout());
        this.add(button1);
        //设置点击关闭按钮时的一个默认操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new _14_JFrame();
    }
}

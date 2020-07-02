package _00_JavaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * JCheckBox 组件(复选框)
 */
public class _18_JCheckBox extends JFrame {
    public _18_JCheckBox() {
        super("JCheckBox");
        //创建一个JLabel标签, 标签文本居中对齐
        JLabel label = new JLabel("读懂流萤的七月，是来自遥远的抚慰", JLabel.CENTER);
        label.setFont(new Font("宋体", Font.PLAIN, 20));//设置标签文字的字体
        JCheckBox italic = new JCheckBox("italic");//倾斜
        JCheckBox bold = new JCheckBox("Bold");//加粗
        JPanel panel = new JPanel();//创建一个面板
        //添加复选框按钮到面板中
        panel.add(italic);
        panel.add(bold);
        //把面板添加刀窗体的下方
        this.add(panel, BorderLayout.SOUTH);
        //为复选框定义    ActionListener监听器
        //为两个复选框添加事件监听器
        //
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode = Font.PLAIN; //默认样式就是没有样式
                if (italic.isSelected()) { //选中了倾斜复选框
                    mode += Font.ITALIC;
                }
                if (bold.isSelected()) {
                    mode += Font.BOLD;
                }
                label.setFont(new Font("宋体", mode, 20));
            }
        };
        //将监听器添加给两个复选框
        italic.addActionListener(listener);
        bold.addActionListener(listener);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //把标签添加到窗体中显示
        this.add(label);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _18_JCheckBox();
    }
}

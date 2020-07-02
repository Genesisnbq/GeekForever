package _00_JavaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _19_JRadioButton extends JFrame {
    public _19_JRadioButton() {
        JPanel pallet = new JPanel();//创建一个调色板
        this.add(pallet, BorderLayout.CENTER); //添加到中间位置
        ButtonGroup group = new ButtonGroup();//单选按钮选项
        JRadioButton button1 = new JRadioButton("灰色");
        JRadioButton button2 = new JRadioButton("粉色");
        JRadioButton button3 = new JRadioButton("黄色");
        //添加按钮到按钮组上
        group.add(button1);
        group.add(button2);
        group.add(button3);
        //到按钮添加到窗口下
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        this.add(panel, BorderLayout.SOUTH);
        //创建单选按钮的动作监听
        ActionListener listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = null;
                if (button1.isSelected()) {
                    color = Color.GRAY;
                }
                if (button2.isSelected()) {
                    color = Color.PINK;
                }
                if (button3.isSelected()) {
                    color = Color.YELLOW;
                }
                pallet.setBackground(color);
            }
        };
        //为单选按钮添加监听器
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800, 600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _19_JRadioButton();
    }
}

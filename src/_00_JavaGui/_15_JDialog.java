package _00_JavaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JDialog
 */
public class _15_JDialog {
    public static void main(String[] args) {
        //建立两个按钮
        JButton button1 = new JButton("模式对话框");
        JButton button2 = new JButton("非模式对话框");
        JFrame f = new JFrame("JDialog");
        f.setSize(300, 250);
        f.setLocation(300, 200);
        f.setLayout(new FlowLayout());
        f.add(button1);
        f.add(button2);
        //设置点击关闭的默认关闭操作
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        //创建JDialog
        JDialog dialog = new JDialog(f, "Dialog");
        dialog.setSize(220, 150);//设置对话框大小
        dialog.setLocation(350, 150);//设置对话框显示的位置
        dialog.setLayout(new FlowLayout()); //设置对话框的布局管理器
        JButton button3 = new JButton("确定");
        dialog.add(button3); //在对话框中添加按钮
        Label label = new Label("标签");
        dialog.add(label);
        //为"模式对话框"按钮添加一个点击的事件操作
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //设置当前对话框的状态设为模式对话框
                dialog.setModal(true);//true代表是一个模式对话框
                //修改标签的内容
                label.setText("Modal dialog, please enter yes to exit");
                //显示对话框
                dialog.setVisible(true);
            }
        });
        //为"非模式对话框"按钮添加一个点击事件
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setModal(false); //false代表是一个非模式对话框
                label.setText("non-modal dialog, enter the yes to exit");
                dialog.setVisible(true);
            }
        });
        //为对话框中的按钮添加一个点击事件
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
    }
}

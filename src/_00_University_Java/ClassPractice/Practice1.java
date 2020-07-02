package _00_University_Java.ClassPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice1 {
    public static final JFrame f = new JFrame("课堂联系");
    public static final JButton button = new JButton("打开一个对话框");
    public static final JDialog dialog = new JDialog();

    public static void main(String[] args) {
        init();
        addComponent();
        addListener();
    }

    public static void init() {
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        dialog.setSize(300, 120);
        dialog.setModal(true);
        dialog.setTitle("倪彬琪的对话框");
        dialog.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void addComponent() {
        f.add(button, BorderLayout.SOUTH);
    }

    public static void addListener() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });
    }
}

package _00_JavaGui.blogPractice;

import javax.swing.*;
import java.awt.*;

public class GridLayoutPractice extends JFrame {
    JLabel usernameLabel, passwdLabel;
    JTextField usernameTextField;
    JPasswordField passwdTextField;
    JButton loadButton, cancelButton;
    JPanel jPanel1, jPanel2, jPanel3;

    public static void main(String[] args) {
        new GridLayoutPractice().setVisible(true);
    }

    public GridLayoutPractice() {
        init();
        addComponent();
        addListener();
    }

    private void init() {
        usernameLabel = new JLabel("用户名");
        passwdLabel = new JLabel("密   码");
        usernameTextField = new JTextField(10);
        passwdTextField = new JPasswordField(10);
        loadButton = new JButton("登录");
        cancelButton = new JButton("取消");
        this.setSize(250, 150);
        this.setLayout(new GridLayout(3, 1)); //3行1列的网格布局
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private void addComponent() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jPanel1.add(usernameLabel);
        jPanel1.add(usernameTextField);
        jPanel2.add(passwdLabel);
        jPanel2.add(passwdTextField);
        jPanel3.add(loadButton);
        jPanel3.add(cancelButton);
        this.add(jPanel1);
        this.add(jPanel2);
        this.add(jPanel3);
    }

    private void addListener() {

    }
}

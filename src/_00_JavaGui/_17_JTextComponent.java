package _00_JavaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 文本组件 JTextField  和 文本域组件 JTextArea
 */

public class _17_JTextComponent extends JFrame {
    public _17_JTextComponent() {
        this.setLayout(new BorderLayout());
        this.setTitle("聊天窗口");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //上面部分
        JTextArea chatContent = new JTextArea(12, 34); //默认显示12行, 34列的效果
        //创建一个滚动面板
        JScrollPane scrollPane = new JScrollPane(chatContent);
//        scrollPane.setViewportView(chatContent); //和上面效果一样
        chatContent.setEditable(false); //设置文本域不可被编辑

        this.setLocationRelativeTo(null);
        this.add(scrollPane, BorderLayout.CENTER); //默认就是居中
        //下面部分
        JLabel label = new JLabel("聊天信息");//创建一个标签
        JTextField inputField = new JTextField(20);//设置20的宽度文本框
        JButton sendButton = new JButton("发送");//创建一个按钮
        JPanel inputPanel = new JPanel(); //创建一个面板用来存储上面的组件
        JButton clearButton = new JButton("清空");
        inputPanel.add(label);
        inputPanel.add(inputField);
        inputPanel.add(sendButton);
        inputPanel.add(clearButton);
        this.add(inputPanel, BorderLayout.SOUTH);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatContent.setText("");
            }
        });
        //为按钮添加事件
        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == 10) {
                    String content = inputField.getText();
                    if (content != null && !content.trim().equals("")) {
                        chatContent.append("本人: " + content + "\n");
                    } else {
                        chatContent.append("输入信息不能为空!\n");
                    }
                    inputField.setText("");
                }
            }
        });
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = inputField.getText(); //获取对应文本框的内容
                if (content != null && !content.trim().equals("")) {
                    //如果不为空,将输入的文本信息追加到聊天窗口中
                    chatContent.append("本人: " + content + "\n");

                } else {
                    //如果内容为空,提示聊天信息不能为空
                    chatContent.append("聊天信息不能为空!\n");
                }
                //将文本框的内容设置为空
                inputField.setText("");//将文本框内容设置为空
            }
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _17_JTextComponent();
    }
}

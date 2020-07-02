package _00_University_Java.Gui_ExperimentPart2.src.MainWindow;

import _00_University_Java.Gui_ExperimentPart2.src.Tools.GuiTools;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class finalDialog extends JDialog {
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonStart = new JButton("开始");
    JButton buttonJudge = new JButton("判断");
    JButton buttonAsk = new JButton("出题");
    JButton buttonReStart = new JButton("重新开始");
    JButton buttonClear = new JButton("清除");
    JPanel panel = new JPanel();
    JTextField inField = new JTextField(6);
    JTextField ansField = new JTextField(6);
    JLabel label1 = new JLabel("加法: ");
    JLabel label2 = new JLabel("以内的练习");
    JLabel inputLabel = new JLabel("请输入答案");
    JLabel firstNum = new JLabel("");
    JLabel connectLabel = new JLabel("+");
    JLabel secondNum = new JLabel("");
    JLabel etcLabel = new JLabel("=");
    JLabel judgeLabel = new JLabel("");


    public finalDialog() {
        this.init();
        this.addComponent();
        this.addListener();
    }

    private void init() {
        this.setTitle("请认真作答!!!");
        this.setSize(600, 400);
        this.setResizable(false);
        GuiTools.setTitleIcon(this, "src/_00_NX_Java/Gui_ExperimentPart2" +
                "/other/picture1.png");
        panel.setSize(600, 400);
        panel.setLayout(null);
        GuiTools.center(this);
        label1.setBounds(170, 0, 100, 40);
        inField.setBounds(220, 0, 50, 40);
        label2.setBounds(270, 0, 200, 40);
        label1.setFont(new Font("幼圆", Font.BOLD, 20));
        label2.setFont(new Font("幼圆", Font.BOLD, 20));
//        inputLabel.setBounds();
        firstNum.setBounds(90, 80, 100, 30);
        Border border = BorderFactory.createLineBorder(Color.black);
        firstNum.setBorder(border);
        connectLabel.setFont(new Font("幼圆", Font.BOLD, 20));
        connectLabel.setBounds(200, 80, 20, 30);
        secondNum.setBounds(230, 80, 100, 30);
        secondNum.setBorder(border);
        etcLabel.setFont(new Font("幼圆", Font.BOLD, 20));
        etcLabel.setBounds(340, 80, 20, 30);
        ansField.setBounds(370, 80, 100, 30);
        judgeLabel.setBounds(480, 80, 60, 30);
        button0.setBounds(150, 160, 40, 40);
        button1.setBounds(200, 160, 40, 40);
        button2.setBounds(250, 160, 40, 40);
        button3.setBounds(300, 160, 40, 40);
        button4.setBounds(350, 160, 40, 40);
        button5.setBounds(150, 210, 40, 40);
        button6.setBounds(200, 210, 40, 40);
        button7.setBounds(250, 210, 40, 40);
        button8.setBounds(300, 210, 40, 40);
        button9.setBounds(350, 210, 40, 40);
        buttonPoint.setBounds(150, 260, 40, 40);
        buttonAsk.setBounds(200, 260, 55, 40);
        buttonJudge.setBounds(268, 260, 55, 40);
        buttonClear.setBounds(336, 260, 55, 40);
        buttonAsk.setFont(new Font("幼圆", Font.BOLD, 10));
        buttonJudge.setFont(new Font("幼圆", Font.BOLD, 10));
        buttonClear.setFont(new Font("幼圆", Font.BOLD, 10));
        buttonStart.setBounds(150, 310, 115, 40);
        buttonReStart.setBounds(275, 310, 115, 40);
    }

    private void addComponent() {
        panel.add(label1);
        panel.add(inField);
        panel.add(label2);
        panel.add(inputLabel);
        panel.add(firstNum);
        panel.add(connectLabel);
        panel.add(secondNum);
        panel.add(etcLabel);
        panel.add(ansField);
        panel.add(judgeLabel);
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonPoint);
        panel.add(buttonAsk);
        panel.add(buttonJudge);
        panel.add(buttonClear);
        panel.add(buttonStart);
        panel.add(buttonReStart);
        panel.setVisible(true);
        this.add(panel);
    }

    private void addListener() {
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonJudge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Border border = BorderFactory.createLineBorder(Color.black);
                judgeLabel.setBorder(border);
            }
        });
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonReStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonAsk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

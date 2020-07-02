package _00_University_Java.Gui_Experiment.src.view;

import _00_JavaGui.FruitStore.src.tools.GuiTools;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractFrame extends JFrame {
    private final JButton button = new JButton("Enter System");
    //左上角图标
    private final JLabel windowLabel = new JLabel(new ImageIcon("src/_00_University_Java/Gui_ExperimentPart2/" +
            "other/icon1.png"));

    public AbstractFrame() {
        this.init();
        this.addComponent();
        this.addListener();
    }

    private void init() {
        this.setSize(600, 400);
        this.setTitle("Welcome to my System");
        GuiTools.center(this);
        GuiTools.setTitleImage(this, "src/_00_University_Java/Gui_ExperimentPart2/" +
                "other/picture1.png");//左上角的图标
        this.setResizable(false);//不可更改窗体大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponent() {
        windowLabel.setSize(300, 150);
        this.add(windowLabel, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setLayout(null);//取消布局管理器
        button.setBounds(240, 20, 120, 50);
        panel.add(button);
        panel.setVisible(true);
        this.add(panel);
    }

    private void addListener() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractFrame.this.dispose();
                showDialog();
            }
        });
    }

    public abstract void showDialog();
}

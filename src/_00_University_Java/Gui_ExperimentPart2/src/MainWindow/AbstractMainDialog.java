package _00_University_Java.Gui_ExperimentPart2.src.MainWindow;

import _00_JavaGui.FruitStore.src.tools.GuiTools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 选择界面
 */
public abstract class AbstractMainDialog extends JDialog {
    JButton addButton = new JButton("加法");
    JButton subButton = new JButton("减法");
    JButton multiButton = new JButton("乘法");
    JButton diviButton = new JButton("除法");
    JButton randomButton = new JButton("随机");
    JLabel titleLabel = new JLabel("请选择要进行的练习");
    JPanel mainPanel = new JPanel();

    public AbstractMainDialog() {
        this.init();
        this.addComponent();
        this.addListener();
    }

    private void init() {
        this.setSize(600, 400);
        this.setResizable(false);
        this.setTitle("请做出选择哦(ˉ▽ˉ；)...");
        this.setModal(true); //模式对话框
        GuiTools.center(this);
        _00_University_Java.Gui_ExperimentPart2.src.Tools.GuiTools.setTitleIcon(this,
                "src/_00_NX_Java/Gui_ExperimentPart2" + "/other/picture1.png");
        mainPanel.setLayout(null);
        mainPanel.setSize(600, 400);
        titleLabel.setBounds(150, 50, 300, 35);
        addButton.setBounds(200, 100, 75, 35);
        subButton.setBounds(300, 100, 75, 35);
        multiButton.setBounds(200, 160, 75, 35);
        diviButton.setBounds(300, 160, 75, 35);
        randomButton.setBounds(200, 220, 175, 35);
        titleLabel.setFont(new Font("幼圆", Font.BOLD, 30));
        randomButton.setForeground(Color.red);
        randomButton.setFont(new Font("方正粗黑宋简体", Font.PLAIN, 15));
    }

    private void addComponent() {
        mainPanel.add(titleLabel);
        mainPanel.add(addButton);
        mainPanel.add(subButton);
        mainPanel.add(multiButton);
        mainPanel.add(diviButton);
        mainPanel.add(randomButton);
        mainPanel.setVisible(true);
        this.add(mainPanel);
    }

    private void addListener() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog();
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog();
            }
        });
        multiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog();
            }
        });
        diviButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog();
            }
        });
        randomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog();
            }
        });
    }

    public abstract void showDialog();
}

package _00_University_Java.Gui_ExperimentPart2.src.MainWindow;


import _00_University_Java.Gui_ExperimentPart2.src.Tools.GuiTools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 初始界面
 */
public abstract class AbstractMainFrame extends JFrame {
    JButton enterButton = new JButton("Enter");
    JLabel iconLabel = new JLabel(new ImageIcon("src/_00_NX_Java/Gui_ExperimentPart2" +
            "/other/icon1.png"));
    JPanel panel = new JPanel();

    public AbstractMainFrame() {
        this.init();
        this.addComponent();
        this.addListener();
    }

    private void init() {
        this.setTitle("Welcome to my System");
        this.setSize(600, 400);
        GuiTools.center(this);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GuiTools.setTitleIcon(this, "src/_00_NX_Java/Gui_ExperimentPart2" +
                "/other/picture1.png");
        iconLabel.setBounds(150, 25, 300, 200);
        enterButton.setBounds(262, 275, 75, 30);
        panel.setSize(600, 400);
        panel.setLayout(null);
    }

    private void addComponent() {
        panel.add(iconLabel);
        panel.add(enterButton);
        panel.setVisible(true);
        this.add(panel);
    }

    private void addListener() {
        enterButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractMainFrame.this.dispose();
                showDialog();
            }
        });
    }

    public abstract void showDialog();
}

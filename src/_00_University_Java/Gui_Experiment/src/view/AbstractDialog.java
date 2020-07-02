package _00_University_Java.Gui_Experiment.src.view;

import _00_JavaGui.FruitStore.src.tools.GuiTools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractDialog extends JDialog {
    JButton submitButton = new JButton("提交");
    JTextField inField = new JTextField(10);
    JLabel result = new JLabel("");

    public AbstractDialog() {
        this(null, true);

    }

    public AbstractDialog(Frame owner, boolean modal) {
        super(owner, modal);
        this.init();
        this.addComponent();
        this.addListener();
//        Border test = BorderFactory.createLineBorder(Color.red);
//        result.setBorder(test);
    }

    private void init() {
        this.setSize(600, 400);
        this.setTitle("倪彬琪答题器");
        GuiTools.center(this);
        this.setLayout(null);
        result.setBounds(150, 80, 500, 25);
        result.setFont(new Font("", Font.BOLD, 34));
        inField.setBounds(150, 160, 300, 25);
        submitButton.setBounds(200, 250, 90, 25);
        GuiTools.setTitleImage(this, "src/_00_University_Java/G" +
                "ui_Experiment/" + "other/icon1.png");//左上角的图标
        randomProblem(result);
    }

    private void addComponent() {
        this.add(result);
        this.add(inField);
        this.add(submitButton);
    }


    private void addListener() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ans = inField.getText();
                if (Integer.parseInt(ans) == solve()) {
                    JOptionPane.showMessageDialog(AbstractDialog.this,
                            "恭喜你回答正确!");
                    inField.setText("");
                    randomProblem(result);
                } else {
                    JOptionPane.showMessageDialog(AbstractDialog.this,
                            "很抱歉, 回答错误,请重新回答");
                }
                inField.setText("");
            }
        });
    }

    public abstract void randomProblem(JLabel label);

    public abstract int solve();
}

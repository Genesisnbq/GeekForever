package _00_JavaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _20_JComboBox extends JFrame {
    public _20_JComboBox() {
        JPanel panel = new JPanel();
        JTextField field = new JTextField(20);
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("请选择城市");
        comboBox.addItem("北京");
        comboBox.addItem("南京");
        comboBox.addItem("杭州");
        comboBox.addItem("上海");
        comboBox.addItem("深圳");
        comboBox.addItem("西安");
        panel.add(comboBox);
        panel.add(field);
        field.setEditable(false);
        ActionListener listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String item = (String) comboBox.getSelectedItem();
                if ("请选择城市".equals(item)) {
                    field.setText("");
                } else {
                    field.setText("您选择的城市是: " + item);
                }
            }
        };
        comboBox.addActionListener(listener);
        field.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                field.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                field.setBackground(Color.WHITE);
            }
        });
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _20_JComboBox();
    }
}

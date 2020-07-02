package _00_University_Java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout extends Frame implements ActionListener {
    CardLayout cardLayout = new CardLayout();
    Panel cardPanel = new Panel();
    Panel controlPanel = new Panel();
    Button nextButton;
    Button preButton;

    public Layout() {
        this.setSize(300, 200);
        this.setLayout(cardLayout);
        cardPanel.add(new Label("Interface1"), Label.CENTER);
        cardPanel.add(new Label("Interface2"), Label.CENTER);
        cardPanel.add(new Label("Interface3"), Label.CENTER);
        nextButton = new Button("next");
        preButton = new Button("return");
        controlPanel.add(preButton);
        controlPanel.add(nextButton);
        this.add(cardPanel, BorderLayout.CENTER);
        this.add(controlPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

public class Attempt2 {
    public static void main(String[] args) {
        Layout layout = new Layout();
    }
}
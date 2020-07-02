package _00_JavaGui;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;

public class _03_GridLayout {
    public static void main(String[] args) {
        // 创建一个名为 GridLayout的窗体
        Frame f = new Frame("GridLayout");
        f.setLayout(new GridLayout(3, 3)); // 设置窗体为3*3的网格
        f.setSize(300, 300);
        f.setLocation(400, 300);
//        Button button1 = new Button("first");
//        Button button2 = new Button("second");
//        Button button3 = new Button("third");
//        Button button4 = new Button("fourth");
//        Button button5 = new Button("fifth");
//        Button button6 = new Button("sixth");
//        Button button7 = new Button("seventh");
//        Button button8 = new Button("eighth");
//        Button button9 = new Button("ninth");
//        f.add(button1);
//        f.add(button2);
//        f.add(button3);
//        f.add(button4);
//        f.add(button5);
//        f.add(button6);
//        f.add(button7);
//        f.add(button8);
//        f.add(button9);

        f.add(new Button("first"));
        f.add(new Button("second"));
        f.add(new Button("third"));
        f.add(new Button("fourth"));
        f.add(new Button("fifth"));
        f.add(new Button("sixth"));
        f.add(new Button("seventh"));
        f.add(new Button("eighth"));
        f.add(new Button("ninth"));
        f.setVisible(true);
    }
}

package _00_JavaGui;

import java.awt.*;
import java.awt.event.*;

// 定义Cardlayout 继承Frame类, 实现ActionListener接口
class Cardlayout extends Frame implements ActionListener {
    Panel cardPanel = new Panel(); // 定义Panel面板卡片
    Panel controlpaPanel = new Panel();//定义Panel 面板放置按钮
    Button nextButton, preButton; //  定义两个按钮
    CardLayout cardLayout = new CardLayout(); //定义卡片布局对象

    //定义构造方法, 设置卡片布局管理器的属性
    public Cardlayout() {
        super("hello");
        //父类Frame的setSize()方法
        this.setSize(400, 300);
        //为窗口添加关闭事件监听器
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Cardlayout.this.setVisible(false);
                Cardlayout.this.dispose(); //释放窗口
            }
        });
        cardPanel.setLayout(cardLayout);
        // 在cardPanel面板对象中添加3 个文本标签
        cardPanel.add(new Label("Interface1", Label.CENTER));
        cardPanel.add(new Label("Interface2", Label.CENTER));
        cardPanel.add(new Label("Interface3", Label.CENTER));
        //创建两个按钮对象
        nextButton = new Button("Next");
        preButton = new Button("Return");
        //为按钮对象注册监听器
        nextButton.addActionListener(this);
        preButton.addActionListener(this);
        //将按钮添加到controlPanel
        controlpaPanel.add(preButton);
        controlpaPanel.add(nextButton);
        //将cardPanel 面板放置在窗口边界布局的中间, 窗口默认为边界布局管理器
        this.add(cardPanel, BorderLayout.CENTER);
        //将controlPanel 面板放置在窗口边界布局的南区
        this.add(controlpaPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    // 下面的代码实现了按钮的监听触发, 并对触发事件做出相应的处理
    @Override
    public void actionPerformed(ActionEvent e) {
        //如果用户单技nextButton, 执行语句
        if (e.getSource() == nextButton) {
            //切换面板中的组件, 若当前组件为最后一个组件, 则显示第一个组件
            cardLayout.next(cardPanel);
        }
        if (e.getSource() == preButton) {
            //切换面板中的组件, 若当前组件为第一个组件, 则显示最后一个组件
            cardLayout.previous(cardPanel);
        }
    }
}

public class _05_CardLayout {
    public static void main(String[] args) {
        Cardlayout cardlayout = new Cardlayout();
    }
}
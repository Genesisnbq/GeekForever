package _00_JavaGui;

import java.awt.GridBagLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;

public class _04_GridBagLayout {
    public static void main(String[] args) {
        new Layout("GridBagLayout");
    }
}

class Layout extends Frame {
    public Layout(String title) {
        GridBagLayout layout = new GridBagLayout();// 网格包布局管理器的实例
        GridBagConstraints c = new GridBagConstraints();//约束对象
        this.setLayout(layout);//设置布局管理器
        // 设置组件横向纵向可以拉伸
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1; // 设置横向权重为1
        c.weighty = 1;//设置纵向权重
        //增加组件
        this.addComponent("button1", layout, c);
        this.addComponent("button2", layout, c);
        this.addComponent("button3", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER; //添加的组件是本行的最后一个组件
        this.addComponent("button4", layout, c);
        c.weightx = 0; // 设置横向权重为1
        c.weighty = 0;//设置纵向权重
        this.addComponent("button5", layout, c);
        c.gridwidth = 1;//设置组件占1个网格
        this.addComponent("button6", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER; //添加的组件是本行的最后一个组件
        this.addComponent("button7", layout, c);
        c.gridwidth = 1;
        c.gridheight = 2;// 设置组件跨两个网格
        c.weightx = 2; // 设置横向权重为2   权重就是拉窗口增加的权重 1 2 3 1倍 2倍 3倍
        c.weighty = 2;//设置纵向权重
        this.addComponent("button8", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER; //添加的组件是本行的最后一个组件
        c.gridheight = 1;
        this.addComponent("button9", layout, c);
        this.addComponent("button10", layout, c);
        c.gridwidth = 1;
        c.gridheight = 2;// 设置组件跨两个网格
        this.addComponent("button11", layout, c);
        c.gridwidth = 1;
        c.gridheight = 1;// 设置组件跨两个网格
        c.gridwidth = GridBagConstraints.REMAINDER; //添加的组件是本行的最后一个组件
        this.addComponent("button12", layout, c);
        this.addComponent("button13", layout, c);

        this.setTitle(title);
        this.pack();// 设置自动窗体大小
        this.setVisible(true); // 显示窗口
    }

    //添加组件方法, 通过指定的约束, 将组件添加到布局管理器中去
    public void addComponent(String name, GridBagLayout layout, GridBagConstraints c) {
        Button button1 = new Button(name);//创建一个名为button1的按钮
        layout.setConstraints(button1, c);//设置约束对象和按钮的关联 (对象, 约束条件)
        this.add(button1);//添加按钮
    }
}


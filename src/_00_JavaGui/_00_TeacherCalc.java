package _00_JavaGui;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

//1.类实现监听器接口   2.覆写接口中的所有的抽象方法
//3.组件注册监听
class _00_TeacherCalc extends JFrame implements ActionListener//框架
{
    public static void main(String[] args) {
        new _00_TeacherCalc();
    }

    JTextField tf1, tf2, tf3, tf4;//成员变量，普通变量，包含在当前界面中的各组件
    JLabel labz, labb, labs, labg;
    JButton b1, b2;
    int n;

    public _00_TeacherCalc()//构造方法，与类同名，没有返回值
    { //当前框架属性的设计
        super("三位数各个位");//调用父类的构造方法，设置框架标题
        this.setLayout(new FlowLayout());
        this.setSize(160, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//框架中组件实例化
        b1 = new JButton("计算");
        b1.addActionListener(this);
        b2 = new JButton("退出");
        b2.addActionListener(this);
        tf1 = new JTextField("123", 10);
        tf2 = new JTextField(10);
        tf3 = new JTextField(10);
        tf4 = new JTextField(10);
        labz = new JLabel("整数", JLabel.LEFT);
        labb = new JLabel("百位", JLabel.LEFT);
        labs = new JLabel("十位", JLabel.LEFT);
        labg = new JLabel("个位", JLabel.LEFT);
//组件添加到框架
        this.add(labz);
        this.add(tf1);
        this.add(labb);
        this.add(tf2);
        this.add(labs);
        this.add(tf3);
        this.add(labg);
        this.add(tf4);
        this.add(b1);
        this.add(b2);
//框架可见
        this.setVisible(true);
    }

    //成员方法
//actionPerformed方法不需要用户调用，
//只要发生ActionEvent，会自动调用该方法
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //System.exit(0);//结束,当发生ActionEvent后，要执行
        if (e.getSource() == b1) {
            String s = tf1.getText();
            n = Integer.parseInt(s);
            tf2.setText("" + n / 100);
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }
}

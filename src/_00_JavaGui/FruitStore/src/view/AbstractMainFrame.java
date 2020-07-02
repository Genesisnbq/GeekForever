package _00_JavaGui.FruitStore.src.view;

import _00_JavaGui.FruitStore.src.tools.GuiTools;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 欢迎界面的抽象类
 */
public abstract class AbstractMainFrame extends JFrame {
    //组件, 写在上面方便查看
    private final JLabel titleLabel1 = new JLabel(new ImageIcon("src/_00_" +
            "JavaGui/FruitStore/image/picture1.png"));
    private final JButton button = new JButton("Enter System");

    //构造方法
    public AbstractMainFrame() {
        //初始化界面的操作(布局, 窗口大小)
        this.init();
        //添加组件
        this.addComponent();
        //添加事件监听器
        this.addListener();
    }

    //初始化操作方法
    private void init() {
        this.setTitle("Welcome to Fruit Mart!");
        this.setSize(600, 400);
        //窗口位置, 屏幕中央
        GuiTools.center(this);
        //设置窗口的左上角图标
        GuiTools.setTitleImage(this,
                "src/_00_JavaGui/FruitStore/image/icon1.png");
        //设置窗口的大小为固定的大小, 不能随意拉伸
        this.setResizable(false);//窗口大小固定
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponent() {
        //窗体使用的是默认的边界布局 BorderLayout
        //北区放入一张图片
        this.add(titleLabel1, BorderLayout.NORTH);
        //添加按钮 不想按钮特别大, 所以可以创建一个面板, 把按钮放面板上
        JPanel buttonPanel = new JPanel();
        //设置面板的布局方式为没有布局管理器
        buttonPanel.setLayout(null);
        //设置按钮的位置与大小
        button.setBounds(240, 20, 120, 50);
        buttonPanel.add(button);
        buttonPanel.setVisible(true);
        this.add(buttonPanel);
    }

    //添加事件监听器
    private void addListener() {
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //展示对应的管理员界面
                AbstractMainFrame.this.dispose(); //让登录界面消失
                showAdminDialog(); //和界面相分离
            }
        });
    }

    //展示管理员界面
    public abstract void showAdminDialog();
}

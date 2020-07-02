package _00_JavaGui.FruitStore.src.view;

import _00_JavaGui.FruitStore.src.tools.GuiTools;

import javax.swing.JTable;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public abstract class AbstractAdminDialog extends JDialog {
    //定义界面使用到的组件,作为成员变量
    private final JLabel tableLabel = new JLabel("水果列表");//水果列表表格的标题
    private final JScrollPane tablePanel = new JScrollPane();//滚动窗口, 可以滑动,里面添加一个label
    protected JTable table = new JTable();//水果列表表格;
    private final JLabel numberLabel = new JLabel("水果编号");
    private final JLabel nameLabel = new JLabel("水果名称");
    private final JLabel priceLabel = new JLabel("水果单价");
    private final JLabel unitLabel = new JLabel("计价单位");
    //添加水果
    protected JTextField addNumberText = new JTextField(6);
    protected JTextField addNameText = new JTextField(6);
    protected JTextField addPriceText = new JTextField(6);
    protected JTextField addUnitText = new JTextField(6);
    private final JButton addButton = new JButton("添加水果");
    //修改水果
    protected JTextField updateNumberText = new JTextField(6);
    protected JTextField updateNameText = new JTextField(6);
    protected JTextField updatePriceText = new JTextField(6);
    protected JTextField updateUnitText = new JTextField(6);
    private final JButton updateButton = new JButton("修改水果");
    //删除水果
    protected JTextField deleteText = new JTextField(6);
    private final JButton deleteButton = new JButton("删除水果");


    public AbstractAdminDialog() {
        // true是模式对话框, 只能操作这个对话框, 不能操作其他的界面
        this(null, true);//为了自动调用下面的构造方法
    }

    public AbstractAdminDialog(Frame owner, boolean modal) {
        super(owner, modal);
        this.init();//初始化操作
        //添加组件
        this.addComponent();
        //添加监听器
        this.addListener();
    }

    private void init() {
        this.setTitle("超市货物管理");//标题
        this.setSize(600, 420);
        GuiTools.center(this);
        this.setResizable(false);//固定窗口大小
    }

    //添加组件
    private void addComponent() {
        //取消布局管理器
        this.setLayout(null);
        //表格标题
        tableLabel.setBounds(265, 20, 70, 25);
        this.add(tableLabel);
        //表格
        table.getTableHeader().setReorderingAllowed(false);//设置表格的列不能左右托拽
        table.getTableHeader().setResizingAllowed(false);//不可拉动表格
        table.setEnabled(false);//不可更改数据(不然双击就可以修改表格的内容了)
        tablePanel.setBounds(50, 50, 500, 200);
        tablePanel.setViewportView(table);//滚动面板显示表格数据
        this.add(tablePanel);
        //字段标题
        numberLabel.setBounds(50, 250, 70, 25);
        nameLabel.setBounds(150, 250, 70, 25);
        priceLabel.setBounds(250, 250, 70, 25);
        unitLabel.setBounds(350, 250, 70, 25);
        this.add(numberLabel);
        this.add(nameLabel);
        this.add(priceLabel);
        this.add(unitLabel);
        //增加组件
        addNumberText.setBounds(50, 280, 80, 25);
        addNameText.setBounds(150, 280, 80, 25);
        addPriceText.setBounds(250, 280, 80, 25);
        addUnitText.setBounds(350, 280, 80, 25);
        addButton.setBounds(460, 280, 90, 25);
        this.add(addNumberText);
        this.add(addNameText);
        this.add(addPriceText);
        this.add(addUnitText);
        this.add(addButton);
        //修改组件
        updateNumberText.setBounds(50, 310, 80, 25);
        updateNameText.setBounds(150, 310, 80, 25);
        updatePriceText.setBounds(250, 310, 80, 25);
        updateUnitText.setBounds(350, 310, 80, 25);
        updateButton.setBounds(460, 310, 90, 25);
        this.add(updateNumberText);
        this.add(updateNameText);
        this.add(updatePriceText);
        this.add(updateUnitText);
        this.add(updateButton);
        //删除组件
        deleteText.setBounds(50, 340, 80, 25);
        deleteButton.setBounds(460, 340, 90, 25);
        this.add(deleteText);
        this.add(deleteButton);
    }

    //添加监听器
    private void addListener() {
        //添加按钮
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //调用添加方法
                addFruitItem();
            }
        });
        //修改按钮
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFruitItem();
            }
        });
        //删除按钮
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteFruitItem();
            }
        });
    }

    //查询方法
    public abstract void queryFruitItem();

    //添加方法
    public abstract void addFruitItem();

    //修改方法
    public abstract void updateFruitItem();

    //删除方法
    public abstract void deleteFruitItem();
}

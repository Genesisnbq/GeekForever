package _00_JavaGui;

import javax.swing.*;

/**
 * 中间容器添加按钮
 */
public class _16_IntermediateContainer extends JFrame {
    public static void main(String[] args) {
        new _16_IntermediateContainer();
    }

    public _16_IntermediateContainer() {
        this.setTitle("PanelDemo");

        //定义一个JPanel面板
        JPanel jPanel = new JPanel();
        jPanel.add(new JButton("按钮1"));
        jPanel.add(new JButton("按钮2"));
        jPanel.add(new JButton("按钮3"));
        jPanel.add(new JButton("按钮4"));
        //创建一个滚动面板
        JScrollPane scrollPane = new JScrollPane();
        // 设置水平滚动条需要时显示
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //设置垂直滚动条一直显示
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //设置jPanel面板在滚动面板中显示
        scrollPane.setViewportView(jPanel);
        //将JPanel 添加到窗体中
        this.add(scrollPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        this.setVisible(true);
    }
}

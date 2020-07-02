package _00_JavaGui;

import java.awt.Frame;

public class _00_createWindow {
    public static void main(String[] args) {
        // 建立新窗体对象
        Frame f = new Frame("我的窗体!");
        //设置窗体的宽和高
        f.setSize(400, 300);
        // 设置窗体在对应的屏幕中所处的位置(参数是窗口左上角的坐标)
        f.setLocation(200, 300);
        //设置窗口可见
        f.setVisible(true);
    }
}

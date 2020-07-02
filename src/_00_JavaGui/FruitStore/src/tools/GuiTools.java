package _00_JavaGui.FruitStore.src.tools;

import java.awt.*;

import javax.swing.*;

/**
 * 工具类
 */
public class GuiTools {
    //Java提供的GUI默认工具类对象
    public static Toolkit kit = Toolkit.getDefaultToolkit();

    //指定组件屏幕居中显示
    public static void center(Component c) {
        int x = (kit.getScreenSize().width - c.getWidth()) / 2;
        int y = (kit.getScreenSize().height - c.getHeight()) / 2;
        c.setLocation(x, y);
    }

    //为指定的窗口设置左上角小图标
    public static void setTitleImage(JFrame frame, String titleIconPath) {
        frame.setIconImage(kit.createImage(titleIconPath));
    }

    public static void setTitleImage(JDialog dialog, String titleIconPath) {
        dialog.setIconImage(kit.createImage(titleIconPath));
    }
}

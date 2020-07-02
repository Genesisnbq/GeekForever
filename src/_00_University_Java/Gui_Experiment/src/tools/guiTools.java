package _00_University_Java.Gui_Experiment.src.tools;


import javax.swing.*;
import java.awt.*;

public class guiTools {
    public static Toolkit kit = Toolkit.getDefaultToolkit();

    //居中
    public static void center(Component c) {
        int x = (kit.getScreenSize().width - c.getWidth()) / 2;
        int y = (kit.getScreenSize().height - c.getHeight()) / 2;
        c.setLocation(x, y);
    }

    //设置窗口左上角图标(最小化图标)
    public static void setTitleImage(JFrame frame, String titleIconPath) {
        frame.setIconImage(kit.createImage(titleIconPath));
    }
}

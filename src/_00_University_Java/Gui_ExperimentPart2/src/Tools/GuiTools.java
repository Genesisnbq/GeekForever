package _00_University_Java.Gui_ExperimentPart2.src.Tools;

import javax.swing.*;
import java.awt.*;

public class GuiTools {
    public static Toolkit kit = Toolkit.getDefaultToolkit();

    public static void center(Component c) {
        int x = (kit.getScreenSize().width - c.getWidth()) / 2;
        int y = (kit.getScreenSize().height - c.getHeight()) / 2;
        c.setLocation(x, y);
    }

    //设置左上角图标(最小化图标)
    public static void setTitleIcon(JFrame f, String titleIconPath) {
        f.setIconImage(kit.createImage(titleIconPath));
    }

    public static void setTitleIcon(JDialog d, String titleIconPath) {
        d.setIconImage(kit.createImage(titleIconPath));
    }

}

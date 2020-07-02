package _00_JavaGui;

import java.awt.*;
import java.util.Random;

public class _13_myAwtGraphics {
    public static void main(String[] args) {
        Frame f = new Frame("验证码");
        Panel panel = new MyPanel1();
        f.add(panel); //添加组件
        f.setSize(200, 100);
        f.setLocationRelativeTo(null); //默认是居中
        f.setVisible(true);
    }
}

class MyPanel1 extends Panel {
    @Override
    public void paint(Graphics g) {
        int width = 200;
        int height = 50;
        g.setColor(Color.LIGHT_GRAY);//设置画笔的颜色为灰色
        //绘制验证码的背景
        g.fillRect(0, 0, width - 1, height - 1);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width - 1, height - 1); //边框黑色
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(width) - 2;
            int y = r.nextInt(height) - 2;
            g.drawOval(x, y, 2, 2);
        }
        char[] chars = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        System.out.println(chars);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char c = chars[r.nextInt(chars.length)];
            str.append(c).append(" ");
        }
        g.setColor(Color.BLUE);
        g.setFont(new Font("黑体", Font.BOLD, 30));
        g.drawString(str.toString(), 25, 30);
    }
}
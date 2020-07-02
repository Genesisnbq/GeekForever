package _00_JavaGui;

import java.awt.*;
import java.util.Random;

/**
 * AWT 绘图
 */
public class _13_awtGraphics {
    public static void main(String[] args) {
        Frame f = new Frame("验证码");
        Panel panel = new MyPanel();
        f.add(panel);
        f.setSize(200, 100);
        //将Frame窗口居中
        f.setLocationRelativeTo(null); // null相当于居中
        f.setVisible(true);
    }
}

class MyPanel extends Panel {
    @Override
    public void paint(Graphics g) {
        int width = 200;//定义验证码图片的宽度
        int height = 50;//定义验证码图片的高度
        g.setColor(Color.LIGHT_GRAY);//设置画笔颜色为灰色
        //绘制验证码的背景
        g.fillRect(0, 0, width - 1, height - 1);
        //设置画笔的颜色
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width, height);//绘制验证码边框
        //绘制干扰点
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(width) - 2;
            int y = r.nextInt(height) - 2;
            g.drawOval(x, y, 2, 2); //画点
        }
        //设置验证码的字体
        g.setFont(new Font("黑体", Font.BOLD, 30));
        //设置验证码颜色
        g.setColor(Color.BLUE);
        //产生随机的验证码
        char[] chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            int pos = r.nextInt(chars.length);
            char c = chars[pos];
            sb.append(c + " ");
        }
        //绘制文字
        g.drawString(sb.toString(), 20, 30);
    }
}
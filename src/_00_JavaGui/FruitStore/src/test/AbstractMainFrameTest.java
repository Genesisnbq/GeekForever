package _00_JavaGui.FruitStore.src.test;

import _00_JavaGui.FruitStore.src.view.AbstractMainFrame;

/**
 * 主界面的测试类
 */
public class AbstractMainFrameTest extends AbstractMainFrame {
    public static void main(String[] args) {
        new AbstractMainFrameTest().setVisible(true);
    }

    @Override
    public void showAdminDialog() {
        System.out.println("进入到管理员界面");
    }
}

package _00_JavaGui.FruitStore.src.application;

import _00_JavaGui.FruitStore.src.controller.MainFrameController;

/**
 * 项目运行入口
 */
public class MainApp {
    public static void main(String[] args) {
        //进入欢迎界面
        new MainFrameController().setVisible(true);
    }
}

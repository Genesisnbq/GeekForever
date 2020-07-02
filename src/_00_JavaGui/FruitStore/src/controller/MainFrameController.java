package _00_JavaGui.FruitStore.src.controller;

import _00_JavaGui.FruitStore.src.view.AbstractMainFrame;

public class MainFrameController extends AbstractMainFrame {
    @Override
    public void showAdminDialog() {
        //进入管理员界面, 并进行显示
        new AdminDialogController(this, true).setVisible(true);
    }
}

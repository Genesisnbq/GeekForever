package _00_JavaGui.FruitStore.src.controller;

import _00_JavaGui.FruitStore.src.doMain.FruitItem;
import _00_JavaGui.FruitStore.src.service.AdminService;
import _00_JavaGui.FruitStore.src.view.AbstractAdminDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * 管理员界面按钮操作类(界面抽象类的具体的实现类)
 */
public class AdminDialogController extends AbstractAdminDialog {

    public AdminDialogController() {
    }

    public AdminDialogController(Frame owner, boolean modal) {
        super(owner, modal);
        //调用查询方法
        queryFruitItem();
    }

    @Override
    public void queryFruitItem() {
        //定义表格头显示的数据
        String[] thead = {"水果编号", "水果名称", "水果单价(/元)", "计价单位"};
        //调用查询服务的方法
        //定义要查询的在表格中显示的水果信息
        ArrayList<FruitItem> data = AdminService.queryFruitItem();
        //把查询查询到的结果放入表格中
        //将集合转换为二维数组
        String[][] tbody = listToArray(data);
        TableModel dataModel = new DefaultTableModel(tbody, thead);
        table.setModel(dataModel);
    }

    @Override
    public void addFruitItem() {
        //获取界面文本框中输入的数据
        String addNumber = addNumberText.getText();
        String addName = addNameText.getText();
        String addPrice = addPriceText.getText();
        String addUnit = addUnitText.getText();
        //调用adminService 提供的添加服务方法
        boolean addResult = AdminService.addFruitItem(addNumber, addName, addPrice, addUnit);
        if (addResult) {
            queryFruitItem();
        } else {
            //弹出窗口
            JOptionPane.showMessageDialog(this, "水果" +
                    "编号不能重复,请检查数据!");
        }
        addNumberText.setText("");
        addNameText.setText("");
        addPriceText.setText("");
        addUnitText.setText("");
        //根据添加是否成功 成功则刷新, 失败则弹出窗口(进行友好提示update
    }

    @Override
    public void updateFruitItem() {
        String updateNumber = updateNumberText.getText();
        String updateName = updateNameText.getText();
        String updatePrice = updatePriceText.getText();
        String updateUnit = updateUnitText.getText();
        boolean updateResult = AdminService.updateFruitItem(updateNumber, updateName, updatePrice, updateUnit);
        if (updateResult) {
            queryFruitItem();
        } else {
            //修改失败
            JOptionPane.showMessageDialog(this, "修改失败, 该编号不存在");
        }
        updateNumberText.setText("");
        updateNameText.setText("");
        updatePriceText.setText("");
        updateUnitText.setText("");
    }

    @Override
    public void deleteFruitItem() {
        String deleteNumber = deleteText.getText();
        boolean deleteResult = AdminService.deleteFruitItem(deleteNumber);
        if (deleteResult) {
            queryFruitItem();
        } else {
            //删除失败
            JOptionPane.showMessageDialog(this, "删除失败, 该编号不存在!");
        }
        deleteText.setText("");
    }

    //集合数据转换为二维数组
    public String[][] listToArray(ArrayList<FruitItem> list) {
        //根据FruitItem的model与集合数据定义JTable数据二维数组
        String[][] tbody = new String[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            tbody[i][0] = list.get(i).getNumber();
            tbody[i][1] = list.get(i).getName();
            tbody[i][2] = list.get(i).getPrice() + "";
            tbody[i][3] = list.get(i).getUnit();
        }
        return tbody;
    }
}

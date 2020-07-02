package _00_JavaGui.FruitStore.src.test;

import _00_JavaGui.FruitStore.src.view.AbstractAdminDialog;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * 管理界面的测试类
 */
public class AbstractMainDialogTest extends AbstractAdminDialog {
    public static void main(String[] args) {
        new AbstractMainDialogTest().setVisible(true);
    }

    //构造方法
    public AbstractMainDialogTest() {
        queryFruitItem();//测试数据
    }

    @Override
    public void queryFruitItem() {
        Object[] thead = {"水果编号", "水果名称", "水果单价(/元)", "计价单位"};
        Object[][] tbody = {
                {"1", "苹果", "5.0", "kg"},
                {"2", "葡萄", "3.2", "斤"},
                {"3", "雪梨", "3,8", "斤"},
                {"4", "泰国大榴莲", "120", "个"}
        };
        TableModel dataModel = new DefaultTableModel(tbody, thead);
        table.setModel(dataModel);
    }

    @Override
    public void addFruitItem() {

    }

    @Override
    public void updateFruitItem() {

    }

    @Override
    public void deleteFruitItem() {

    }
}

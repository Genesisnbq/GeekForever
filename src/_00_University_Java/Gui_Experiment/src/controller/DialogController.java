package _00_University_Java.Gui_Experiment.src.controller;

import _00_University_Java.Gui_Experiment.src.view.AbstractDialog;

import javax.swing.*;
import java.awt.*;

public class DialogController extends AbstractDialog {
    public static int answer = 0;

    public DialogController(Frame owner, boolean modal) {
        super(owner, modal);
    }


    @Override
    public void randomProblem(JLabel label) {
        int a = (int) (Math.random() * 10000);
        int b = (int) (Math.random() * 10000);
        String operator = "+-*/";
        String c = "" + operator.charAt((int) (Math.random() * 4));
        int ans = 0;
        switch (c) {
            case "+":
                ans = a + b;
                break;
            case "-":
                ans = a - b;
                break;
            case "*":
                ans = a * b;
                break;
            default:
                ans = a / b;
                break;
        }
        label.setText(a + c + b + "=?");
        answer = ans;
    }

    @Override
    public int solve() {
        return answer;
    }
}

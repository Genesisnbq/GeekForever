package _00_University_Java.Gui_Experiment.src.controller;

import _00_University_Java.Gui_Experiment.src.view.AbstractFrame;

public class FrameController extends AbstractFrame {
    @Override
    public void showDialog() {
        new DialogController(this, true).setVisible(true);
    }
}

package com.herdeybayor;

import com.herdeybayor.state.BrushTool;
import com.herdeybayor.state.Canvas;
import com.herdeybayor.state.EraserTool;
import com.herdeybayor.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
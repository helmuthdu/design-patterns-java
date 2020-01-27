package com.helmuthdu.state;

public class BrushTool implements Tool {
    @Override
    public void onMouseUp() {
        System.out.println("Brush blur");
    }

    @Override
    public void onMouseDown() {
        System.out.println("Brush press");
    }
}

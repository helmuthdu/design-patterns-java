package com.helmuthdu.state;

public class EraserTool implements Tool {
    @Override
    public void onMouseUp() {
        System.out.println("Eraser blur");
    }

    @Override
    public void onMouseDown() {
        System.out.println("Eraser press");
    }
}

package com.helmuthdu.state;

public class SelectionTool implements Tool {
    @Override
    public void onMouseUp() {
        System.out.println("Selection blur");
    }

    @Override
    public void onMouseDown() {
        System.out.println("Selection press");
    }
}

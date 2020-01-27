package com.helmuthdu.state;

public class Canvas {
    private Tool currentTool;

    public void onMouseUp() {
        currentTool.onMouseUp();
    }

    public void onMouseDown() {
        currentTool.onMouseDown();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}

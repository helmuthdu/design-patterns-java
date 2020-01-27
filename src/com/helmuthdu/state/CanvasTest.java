package com.helmuthdu.state;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanvasTest {
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @BeforeEach
    void redirectSystemOutStream() {
        originalSystemOut = System.out;

        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
    }

    @AfterEach
    void restoreSystemOutStream() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void shouldUseTheSelectedTool() {
        var canvas = new Canvas();

        canvas.setCurrentTool(new SelectionTool());
        canvas.onMouseDown();
        assertTrue(systemOutContent.toString().contains("Selection press"));
        canvas.onMouseUp();
        assertTrue(systemOutContent.toString().contains("Selection blur"));

        canvas.setCurrentTool(new EraserTool());
        canvas.onMouseDown();
        assertTrue(systemOutContent.toString().contains("Eraser press"));
        canvas.onMouseUp();
        assertTrue(systemOutContent.toString().contains("Eraser blur"));
    }
}

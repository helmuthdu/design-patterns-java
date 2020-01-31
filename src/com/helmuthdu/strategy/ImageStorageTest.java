package com.helmuthdu.strategy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImageStorageTest {
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
        var imageStorage = new ImageStorage(new JPGCompressor(), new BeautifyFilter());

        imageStorage.store("test");
        assertTrue(systemOutContent.toString().contains("Compressing using JPG"));
        assertTrue(systemOutContent.toString().contains("Applying beautify filter"));
    }
}

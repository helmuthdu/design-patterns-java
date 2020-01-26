package com.helmuthdu.memento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EditorTest {

    @Test
    public void shouldSaveAndRestoreStateHistory() {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("foo");
        history.push(editor.createState());

        // assert statements
        assertEquals("foo", editor.getContent(), "current state should be equals 'foo'");

        editor.setContent("bar");
        history.push(editor.createState());


        assertEquals("bar", editor.getContent(), "current state should be equals 'bar'");

        editor.setContent("baz");
        editor.restore(history.pop());

        assertEquals("bar", editor.getContent(), "current state should be equals 'bar'");
    }
}
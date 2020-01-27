package com.helmuthdu.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {
    @Test
    public void shouldTestListIterator() {
        var history = new History();

        List<String> historyState = new ArrayList<>();

        historyState.add("a");
        historyState.add("b");
        historyState.add("c");

        history.push(historyState.get(0));
        history.push(historyState.get(1));
        history.push(historyState.get(2));

        Iterator<String> iterator = history.toList();

        var i = 0;
        while (iterator.hasNext()) {
            assertEquals(iterator.current(), historyState.get(i++));
            iterator.next();
        }
    }
}

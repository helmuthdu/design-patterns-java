package com.helmuthdu.iterator;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<String> history = new ArrayList<>();

    public void push(String state) {
        history.add(state);
    }

    public String pop() {
        var lastIndex = history.size() - 1;
        var lastState = history.get(lastIndex);
        history.remove(lastState);

        return lastState;
    }

    public List<String> getHistory() {
        return history;
    }

    public Iterator<String> toList() {
        return new ListIterator(this);
    }
}


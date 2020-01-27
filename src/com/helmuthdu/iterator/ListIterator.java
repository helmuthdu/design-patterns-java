package com.helmuthdu.iterator;

public class ListIterator implements Iterator<String> {
    private History history;
    private int index;

    public ListIterator(History history) {
        this.history = history;
    }

    @Override
    public boolean hasNext() {
        return index < history.getHistory().size();
    }

    @Override
    public String current() {
        return history.getHistory().get(index);
    }

    @Override
    public void next() {
        index++;
    }
}

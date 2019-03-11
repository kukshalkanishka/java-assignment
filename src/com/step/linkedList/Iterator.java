package com.step.linkedList;

import java.util.List;
import java.util.NoSuchElementException;

public class Iterator {
    private List list;
    private int currentIndex;

    public Iterator(List list) {
        this.list = list;
        this.currentIndex = -1;
    }

    public boolean hasNext() {
        return this.list.size() > this.currentIndex + 1;
    }

    public Integer next() {
        if (this.hasNext()) {
            this.currentIndex++;
            return (Integer) this.list.get(this.currentIndex);
        }
        throw new NoSuchElementException();
    }
}

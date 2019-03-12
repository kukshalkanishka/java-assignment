package com.step.range;

import java.util.ArrayList;

public abstract class Range<T> {
    ArrayList<T> list = new ArrayList<>();
    T start;
    T end;

    public Range(T start, T end) {
        this.start = start;
        this.end = end;
    }

    ArrayList<T> getAll() {
        return this.list;
    }

    boolean containsElement(T element) {
        return this.list.contains(element);
    }

    abstract void createList();

}

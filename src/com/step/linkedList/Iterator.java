package com.step.linkedList;

import java.util.List;
import java.util.NoSuchElementException;

public class Iterator {
    private List list;
    private int currentIndex;

    public Iterator(List list) {
        this.list = list;
        this.currentIndex =0;
    }

    public boolean hasNext(){
        return this.list.size() -1 >= this.currentIndex;
    }

    public Integer next(){
        if(this.hasNext()){
            Integer currentElement = (Integer) this.list.get(this.currentIndex);
            this.currentIndex++;
            return currentElement;
        }
        throw new NoSuchElementException();
    }
}

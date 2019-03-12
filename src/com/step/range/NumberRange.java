package com.step.range;

public class NumberRange extends Range<Integer> {

    public NumberRange(Integer start, Integer end) {
        super(start, end);
        this.createList();
    }

    @Override
    void createList(){
        for (Integer i = this.start; i <= this.end; i++) {
            this.list.add(i);
        }

    }
}

package com.step.range;


public class AlphabetRange extends Range<Character> {

    public AlphabetRange(Character start, Character end) {
        super(start, end);
        this.createList();
    }

    @Override
    void createList() {
        for (Character i = this.start; i <= this.end; i++) {
            this.list.add(i);
        }
    }
}

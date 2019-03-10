package com.step.arrayList;

import java.util.ArrayList;


public class Contact {
    private String name;
    private Long number;

    public Contact(String name, Long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public long getPhoneNumber() {
        return this.number;
    }
}

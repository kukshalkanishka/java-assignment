package com.step.parking_lot;

class Attendent {
    private final String name;

    Attendent(String name) {
        this.name = name;
    }

    void update(){
        System.out.println("Parking lot is Full!");
    }
}

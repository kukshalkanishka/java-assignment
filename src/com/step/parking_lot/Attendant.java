package com.step.parking_lot;

import java.util.ArrayList;
import java.util.List;

class Attendant implements Observer {
    private final String name;
    private List<ParkingLot> parkingLots;

    Attendant(String name) {
        this.name = name;
        parkingLots = new ArrayList<>();
    }

    void addParkingLot(ParkingLot parkingLot) {
        this.parkingLots.add(parkingLot);
    }

    @Override
    public void update(int parkingLotId) {
        System.out.println("Got notified by " + parkingLotId);
    }
}

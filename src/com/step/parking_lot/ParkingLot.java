package com.step.parking_lot;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {

    private List<Car> parkingLot;
    private int size;
    private Attendent attendent;

    ParkingLot(int size, Attendent attendent) {
        this.parkingLot = new ArrayList<>(size);
        this.size = size;
        this.attendent = attendent;
    }

    private boolean isFull(){
        return parkingLot.size() == this.size;
    }

    void park(Car car) throws ParkingLotSizeExceed {
        if (isFull()) {
            throw new ParkingLotSizeExceed();
        }
        this.parkingLot.add(car);
        if(isFull()) attendent.update();
    }
}

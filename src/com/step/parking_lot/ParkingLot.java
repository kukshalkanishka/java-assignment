package com.step.parking_lot;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {

    private List<Car> parkingLot;
    private int size;
    private Observer attendant;
    private int id;

    ParkingLot(int size, Observer attendant, int id) {
        this.parkingLot = new ArrayList<>(size);
        this.size = size;
        this.attendant = attendant;
        this.id = id;
    }

    private boolean isFull() {
        return parkingLot.size() == this.size;
    }

    void park(Car car) throws ParkingLotSizeExceed {
        if (this.parkingLot.contains(car)) {
            return;
        }
        if (isFull()) {
            throw new ParkingLotSizeExceed();
        }
        this.parkingLot.add(car);
        if (isFull()) attendant.notifyLotIsFull(id);
    }

    boolean unPark(Car car) {
        if (!this.parkingLot.contains(car)) {
            return false;
        }
        if (isFull()) attendant.notifyLotIsFree(id);
        this.parkingLot.remove(car);
        return true;
    }
}

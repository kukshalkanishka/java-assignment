package com.step.parking_lot;

interface Observer {
    void notifyLotIsFull(int observableId);

    void notifyLotIsFree(int observableId);
}

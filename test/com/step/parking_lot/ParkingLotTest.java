package com.step.parking_lot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void shouldNotThrowExceptionWhenACarIsAddedToTheParkingLotThatHasSpace() {
        Attendant attendant = new Attendant("Kannu");
        Car car = new Car(1234);
        ParkingLot parkingLot = new ParkingLot(20, attendant, 1);

        assertDoesNotThrow(() -> parkingLot.park(car));
    }

    @Test
    void shouldThrowExceptionWhenACarIsAddedToTheParkingLotThatHasNoSpace() throws ParkingLotSizeExceed {
        Car car = new Car(1234);
        Car car2 = new Car(123);

        Attendant attendant = new Attendant("Kannu");
        ParkingLot parkingLot = new ParkingLot(1, attendant, 2);
        attendant.addParkingLot(parkingLot);
        parkingLot.park(car);
        assertThrows(ParkingLotSizeExceed.class, () -> parkingLot.park(car2));
    }

    @Test
    void shouldNotifyAttendantWhenParkingLotIsFull() throws ParkingLotSizeExceed {
        Car car = new Car(1234);
        MockAttendant attendant = new MockAttendant("Kannu");
        ParkingLot parkingLot = new ParkingLot(1, attendant, 1);
        parkingLot.park(car);
        assertTrue(attendant.hasNotifiedWhenLotIsFull);
    }

    @Test
    void shouldReturnTrueWhenCarIsUnParkedIfItIsAlreadyParked() throws ParkingLotSizeExceed {
        Car car = new Car(1234);
        Attendant attendant = new Attendant("Kannu");
        ParkingLot parkingLot = new ParkingLot(10, attendant, 1);
        parkingLot.park(car);
        assertTrue(parkingLot.unPark(car));
    }

    @Test
    void shouldReturnFalseWhenCarIsUnParkedIfItIsNotParked() {
        Car car = new Car(1234);
        Attendant attendant = new Attendant("Kannu");
        ParkingLot parkingLot = new ParkingLot(10, attendant, 1);
        assertFalse(parkingLot.unPark(car));
    }

    @Test
    void shouldNotifyAttendantWhenTheParkingLotIsFree() throws ParkingLotSizeExceed {
        Car car = new Car(1234);
        MockAttendant attendant = new MockAttendant("Kannu");
        ParkingLot parkingLot = new ParkingLot(1, attendant, 1);
        parkingLot.park(car);
        parkingLot.unPark(car);
        assertTrue(attendant.hasNotifiedWhenLotIsFree);
    }
}

class MockAttendant extends Attendant {

    boolean hasNotifiedWhenLotIsFull;
    boolean hasNotifiedWhenLotIsFree;

    MockAttendant(String name) {
        super(name);
        hasNotifiedWhenLotIsFull = false;
    }

    @Override
    public void notifyLotIsFull(int parkingLotId) {
        hasNotifiedWhenLotIsFull = true;
    }

    @Override
    public void notifyLotIsFree(int parkingLotId) {
        hasNotifiedWhenLotIsFree = true;
    }
}
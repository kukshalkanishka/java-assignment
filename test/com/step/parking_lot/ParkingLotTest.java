package com.step.parking_lot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ParkingLotTest {

    @Test
    void shouldNotThrowExceptionWhenACarIsAddedToTheParkingLotThatHasSpace() {
        Attendant attendant = new Attendant("Kannu");
        Car car = new Car("Kannu");
        ParkingLot parkingLot = new ParkingLot(20, attendant, 1);

        assertDoesNotThrow(() -> parkingLot.park(car));
    }

    @Test
    void shouldThrowExceptionWhenACarIsAddedToTheParkingLotThatHasNoSpace() throws ParkingLotSizeExceed {
        Car car = new Car("Kannu");
        Attendant attendant = new Attendant("Kannu");
        ParkingLot parkingLot = new ParkingLot(1,attendant, 2);
        attendant.addParkingLot(parkingLot);
        parkingLot.park(car);
        assertThrows(ParkingLotSizeExceed.class, () -> parkingLot.park(car));
    }
}
package com.step.parking_lot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ParkingLotTest {

    @Test
    void shouldNotThrowExceptionWhenACarIsAddedToTheParkingLotThatHasSpace() {
        Attendent attendent = new Attendent("Kannu");
        Car car = new Car("Kannu");
        ParkingLot parkingLot = new ParkingLot(20, attendent);

        assertDoesNotThrow(() -> parkingLot.park(car));
    }

    @Test
    void shouldThrowExceptionWhenACarIsAddedToTheParkingLotThatHasNoSpace() throws ParkingLotSizeExceed {
        Car car = new Car("Kannu");
        Attendent attendent = new Attendent("Kannu");
        ParkingLot parkingLot = new ParkingLot(1,attendent);
        parkingLot.park(car);
        assertThrows(ParkingLotSizeExceed.class, () -> parkingLot.park(car));
    }
}
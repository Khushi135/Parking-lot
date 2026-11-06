package org.example.strategy;

import org.example.ParkingLot;
import org.example.ParkingSpot;
import org.example.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot findAvailableSpot(Vehicle vehicle, ParkingLot parkingLot);
}

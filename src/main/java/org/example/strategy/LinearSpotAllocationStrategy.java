package org.example.strategy;

import org.example.ParkingLot;
import org.example.ParkingSpot;
import org.example.Vehicle;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    private Vehicle vehicle;
    private ParkingLot parkingLot;

    public LinearSpotAllocationStrategy(ParkingLot parkingLot, Vehicle vehicle) {
        this.vehicle = vehicle;
        this.parkingLot = parkingLot;
    }

    @Override
    public ParkingSpot findAvailableSpot(Vehicle vehicle, ParkingLot parkingLot) {
        return null;
    }
}

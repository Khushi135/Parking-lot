package org.example.strategy;

import org.example.ParkingLot;
import org.example.ParkingSpot;
import org.example.Vehicle;

public class NearestSpotToTheGate implements SpotAllocationStrategy{
    private ParkingLot parkingLot;
    private Vehicle vehicle;
    public NearestSpotToTheGate(ParkingLot parkingLot, Vehicle vehicle) {
        this.parkingLot = parkingLot;
        this.vehicle = vehicle;
    }
    @Override
    public ParkingSpot findAvailableSpot(Vehicle vehicle, ParkingLot parkingLot) {
        return null;
    }
}

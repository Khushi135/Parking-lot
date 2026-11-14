package org.example.strategy.SpotAllocation;

import org.example.model.EntryGate;
import org.example.model.ParkingLot;
import org.example.model.ParkingSpot;
import org.example.model.Vehicle;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    private Vehicle vehicle;
    private ParkingLot parkingLot;

    public LinearSpotAllocationStrategy(ParkingLot parkingLot, Vehicle vehicle) {
        this.vehicle = vehicle;
        this.parkingLot = parkingLot;
    }

    @Override
    public ParkingSpot findAvailableSpot(Vehicle vehicle, ParkingLot parkingLot, EntryGate entryGate) {
        return null;
    }
}

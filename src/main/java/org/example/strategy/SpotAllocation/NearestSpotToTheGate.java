package org.example.strategy.SpotAllocation;

import org.example.model.EntryGate;
import org.example.model.ParkingLot;
import org.example.model.ParkingSpot;
import org.example.model.Vehicle;

public class NearestSpotToTheGate implements SpotAllocationStrategy{
    private ParkingLot parkingLot;
    private Vehicle vehicle;
    public NearestSpotToTheGate(ParkingLot parkingLot, Vehicle vehicle) {
        this.parkingLot = parkingLot;
        this.vehicle = vehicle;
    }

    @Override
    public ParkingSpot findAvailableSpot(Vehicle vehicle, ParkingLot parkingLot, EntryGate entryGate) {
        return null;
    }
}

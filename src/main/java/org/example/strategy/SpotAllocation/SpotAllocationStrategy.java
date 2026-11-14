package org.example.strategy.SpotAllocation;

import org.example.model.EntryGate;
import org.example.model.ParkingLot;
import org.example.model.ParkingSpot;
import org.example.model.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot findAvailableSpot(Vehicle vehicle, ParkingLot parkingLot, EntryGate entryGate);
}

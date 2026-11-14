package org.example.strategy.SpotAllocation;

import org.example.model.ParkingLot;
import org.example.model.Vehicle;

public class SpotAllocationFactory {

    public static SpotAllocationStrategy getSpotAllocationStrategy(ParkingLot parkingLot, Vehicle vehicle, SpotAllocationStrategyEnum spotAllocationStrategyEnum) {
        switch (spotAllocationStrategyEnum){
            case NEAREST_TO_ENTRY_GATE -> {
                return new NearestSpotToTheGate(parkingLot, vehicle);
            }
            case NEAREST_TO_EXIT_GATE -> {
                return new NearestToExitGateSpotAllocationStrategy(parkingLot, vehicle);
            }

            default -> {
                return new LinearSpotAllocationStrategy(parkingLot, vehicle);
            }
        }

    }
    }

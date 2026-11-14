package org.example.model;

import java.util.List;

public class ParkingFloor {
    public ParkingFloor(int parkingFloor, List<ParkingSpot> parkingSpots) {
        this.parkingFloor = parkingFloor;
        this.parkingSpots = parkingSpots;
    }

    public int getParkingFloor() {
        return parkingFloor;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    private int parkingFloor;
    private List<ParkingSpot> parkingSpots;
}

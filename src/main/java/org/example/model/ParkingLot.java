package org.example.model;

import org.example.model.ParkingFloor;

import java.util.List;

public class ParkingLot {
    public ParkingLot(int parkingLotId, List<ParkingFloor> parkingFloors) {
        this.parkingLotId = parkingLotId;
        this.parkingFloors = parkingFloors;
    }

    private int parkingLotId;
    private List<ParkingFloor> parkingFloors;

    public ParkingLot(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}

package org.example.model;

import org.example.service.ParkingService;

public class EntryGate{
    private int gateNumber;
    private ParkingService parkingService = new ParkingService();
    private ParkingLot parkingLot;

    public EntryGate(int gateNumber, ParkingLot parkingLot) {
        this.gateNumber = gateNumber;
//        this.parkingService = parkingService;
        this.parkingLot = parkingLot;
    }

    public Ticket enter(int gateNumber, Vehicle vehicle, ParkingLot parkingLot){
        return parkingService.parkVehicle(parkingLot, vehicle,this);
    }
}

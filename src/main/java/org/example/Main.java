package org.example;

import org.example.enums.ParkingSpotStatus;
import org.example.enums.VehicleType;
import org.example.model.EntryGate;
import org.example.model.ParkingFloor;
import org.example.model.ParkingLot;
import org.example.model.ParkingSpot;
import org.example.model.Ticket;
import org.example.model.Vehicle;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        int parkingLotId = 0;
        int parkingFloorId = 0;
        int parkingSpotId = 0;

        ParkingSpot parkingSpot11 = new ParkingSpot(parkingSpotId, List.of(VehicleType.Car, VehicleType.Bike), ParkingSpotStatus.Empty, null);
        ParkingSpot parkingSpot12 = new ParkingSpot(parkingSpotId+1, List.of(VehicleType.Bike), ParkingSpotStatus.Empty, null);
        ParkingSpot parkingSpot13 = new ParkingSpot(parkingSpotId+2, List.of(VehicleType.Car), ParkingSpotStatus.Empty, null);
        ParkingSpot parkingSpot14 = new ParkingSpot(parkingSpotId+3, List.of(VehicleType.Bike), ParkingSpotStatus.Empty, null);


        ParkingSpot parkingSpot21 = new ParkingSpot(parkingSpotId, List.of(VehicleType.Car, VehicleType.Bike), ParkingSpotStatus.Empty, null);
        ParkingSpot parkingSpot22 = new ParkingSpot(parkingSpotId+4, List.of(VehicleType.Bike), ParkingSpotStatus.Empty, null);
        ParkingSpot parkingSpot23 = new ParkingSpot(parkingSpotId+5, List.of(VehicleType.Car), ParkingSpotStatus.Empty, null);
        ParkingSpot parkingSpot24 = new ParkingSpot(parkingSpotId+6, List.of(VehicleType.Bike), ParkingSpotStatus.Empty, null);

        ParkingFloor parkingFloor1 = new ParkingFloor(parkingFloorId, List.of(parkingSpot11, parkingSpot12, parkingSpot13, parkingSpot14));
        ParkingFloor parkingFloor2 = new ParkingFloor(parkingFloorId+1, List.of(parkingSpot21, parkingSpot22, parkingSpot23, parkingSpot24));

        ParkingLot parkingLot = new ParkingLot(parkingLotId+1 , List.of(parkingFloor1, parkingFloor2));

        EntryGate entryGate = new EntryGate(1, parkingLot);

        Vehicle vehicle = new Vehicle("qwqewqe", VehicleType.Bike);

        Ticket ticket = entryGate.enter(1, vehicle, parkingLot);
    }
}
package org.example.model;

import org.example.enums.ParkingSpotStatus;
import org.example.enums.VehicleType;

import java.util.List;
import java.util.Objects;

public class ParkingSpot {
    public ParkingSpot(int id, List<VehicleType> vehicleTypeAllowed, ParkingSpotStatus status, Vehicle vehicle) {
        this.id = id;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.status = status;
        this.vehicle = vehicle;
    }

    private int id;
    private List<VehicleType> vehicleTypeAllowed;
    private ParkingSpotStatus status;
    private Vehicle vehicle;

    public List<VehicleType> getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    public ParkingSpotStatus getStatus() {
        return status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public synchronized boolean placeVehicle(Vehicle vehicle) {

        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }

        if (this.status.equals(ParkingSpotStatus.OCCUPIED)) {
            System.out.println("parkingSpot is not Empty");
            return false;
        }

        if (!vehicleTypeAllowed.contains(vehicle.getVehicleType())) {
            System.out.println("Vehicle not allowed at this spot");
            return false;
        }

        System.out.println("placed vehicle: " + vehicle.getVehicleNumber() + "to parkingSpot" + this.id);
        this.status = ParkingSpotStatus.OCCUPIED;
        this.vehicle = vehicle;

        return true;
    }

    public synchronized void removeVehicle(Vehicle vehicle){
        if (status.equals(ParkingSpotStatus.AVAILABLE) || Objects.isNull(vehicle)) {
            System.out.println("parkingSpot is already Empty");
            return;
        }

        System.out.println("placed vehicle: " + vehicle.getVehicleNumber() + "to parkingSpot" + this.id);
        this.status = ParkingSpotStatus.AVAILABLE;
        this.vehicle = null;
    }
}

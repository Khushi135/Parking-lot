package org.example;

import org.example.enums.Status;
import org.example.enums.VehicleType;

import java.util.List;
import java.util.Objects;

public class ParkingSpot {
    private int id;
    private List<VehicleType> vehicleTypeAllowed;
    private Status status;
    private Vehicle vehicle;

    public List<VehicleType> getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    public Status getStatus() {
        return status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void placeVehicle(Vehicle vehicle) {

        if (status.equals(Status.Occupied) || !Objects.isNull(vehicle)) {
            System.out.println("parkingSpot is not Empty");
            return;
        }

        if (!vehicleTypeAllowed.contains(vehicle.getVehicleType())) {
            System.out.println("Vehicle not allowed at this spot");
            return;
        }

        System.out.println("placed vehicle: " + vehicle.getVehicleNumber() + "to parkingSpot" + this.id);
        status = Status.Occupied;
    }

    public void removeVehicle(Vehicle vehicle){
        if (status.equals(Status.Empty) || Objects.isNull(vehicle)) {
            System.out.println("parkingSpot is already Empty");
            return;
        }

        System.out.println("placed vehicle: " + vehicle.getVehicleNumber() + "to parkingSpot" + this.id);
        status = Status.Empty;
    }
}

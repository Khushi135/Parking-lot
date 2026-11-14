package org.example.service;

import org.example.enums.BillStrategyEnum;
import org.example.model.Bill;
import org.example.model.EntryGate;
import org.example.model.ExitGate;
import org.example.model.ParkingLot;
import org.example.model.ParkingSpot;
import org.example.model.Ticket;
import org.example.model.Vehicle;
import org.example.strategy.BillCalculation.BillCalculationFactoryStrategy;
import org.example.strategy.BillCalculation.BillCalculationStrategy;
import org.example.strategy.SpotAllocation.SpotAllocationFactory;
import org.example.strategy.SpotAllocation.SpotAllocationStrategy;
import org.example.strategy.SpotAllocation.SpotAllocationStrategyEnum;

import java.time.LocalDateTime;

public class ParkingService {
    private ParkingLot parkingLot;
    private static int ticketId;
    private static int billNumber;
    private Ticket ticket;
    public Ticket parkVehicle(ParkingLot parkingLot, Vehicle vehicle, EntryGate gate) {
        // 1. Find suitable spot
        // 2. Reserve spot
        // 3. Create ticket
        // 4. Save ticket
        // 5. Return ticket

        SpotAllocationStrategy spotAllocationStrategy = SpotAllocationFactory.getSpotAllocationStrategy(parkingLot, vehicle, SpotAllocationStrategyEnum.NEAREST_TO_EXIT_GATE);
        ParkingSpot parkingSpot = spotAllocationStrategy.findAvailableSpot(vehicle, parkingLot, gate);
        boolean vehiclePlaced = parkingSpot.placeVehicle(vehicle);
        try {
            if(vehiclePlaced) {
                Ticket ticket1 = new Ticket(ticketId + 1, vehicle, parkingSpot, LocalDateTime.now(), gate);
                ticket1.saveTicket(ticket1);
                return ticket1;
            }else return null;
        }catch (Exception e){
            parkingSpot.removeVehicle(vehicle);
            return null;
        }
    }

    public Bill exitVehicle(Ticket ticket, ExitGate gate) {

        // 1. Validate ticket
        // 2. Calculate parking fee
        // 3. Process payment
        // 4. Close ticket
        // 5. Release spot
        boolean isValid = ticket.checkTicket(ticket);
        if(!isValid){
            System.out.println("ticket is not valid" + ticket);
        }
        BillCalculationStrategy billCalculationStrategy = BillCalculationFactoryStrategy.getBillCalculationStrategy(BillStrategyEnum.WEEKEND);
        double amount = billCalculationStrategy.calculateBill(BillStrategyEnum.WEEKDAYS, ticket);
        Bill bill = new Bill(billNumber+1, amount, LocalDateTime.now(), ticket, gate);
//        ticket.closeTicket();
        ticket.getParkingSpot().removeVehicle(ticket.getVehicle());
        return bill;
    }
}

package org.example.model;

import org.example.repository.TicketRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public class Ticket {
    private TicketRepository ticketRepository;
    private int ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private EntryGate entryGate;

    public boolean checkTicket(Ticket ticket) {
        Optional<Ticket> ticket1 = ticketRepository.findById(ticket.getTicketId());
        if(ticket1.isEmpty())
            return false;
        return true;
    }

    public Ticket(int ticketId, Vehicle vehicle, ParkingSpot parkingSpot, LocalDateTime entryTime, EntryGate entryGate) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.entryGate = entryGate;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public void saveTicket(Ticket ticket){
        ticketRepository.save(ticket);
    }
}


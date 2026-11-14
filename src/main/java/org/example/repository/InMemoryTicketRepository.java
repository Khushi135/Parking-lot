package org.example.repository;

import org.example.model.Ticket;

import java.util.HashMap;
import java.util.Locale;
import java.util.Optional;

public class InMemoryTicketRepository implements TicketRepository{
    HashMap<Integer, Ticket> ticketHashMap = new HashMap<>();
    @Override
    public void save(Ticket ticket) {
        ticketHashMap.put(ticket.getTicketId(), ticket);
    }

    @Override
    public Optional<Ticket> findById(Integer ticketId) {
        return Optional.ofNullable(ticketHashMap.getOrDefault(ticketId, null));
    }

    @Override
    public Optional<Ticket> findActiveTicketByVehicle(String vehicleNumber) {
        return Optional.empty();
    }
}

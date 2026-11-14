package org.example.repository;

import org.example.model.Ticket;

import java.util.Optional;

public interface TicketRepository {
    void save(Ticket ticket);

    Optional<Ticket> findById(Integer ticketId);

    Optional<Ticket> findActiveTicketByVehicle(String vehicleNumber);
}

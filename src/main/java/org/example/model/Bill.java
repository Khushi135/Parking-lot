package org.example.model;

import org.example.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill {
    private int billNumber;
    private double amount;
    private BillStatus billStatus = BillStatus.In_Progress;
    private LocalDateTime exitTime;
    private Ticket ticket;
    private ExitGate exitGate;

    public Bill(int billNumber, double amount, LocalDateTime exitTime, Ticket ticket, ExitGate exitGate) {
        this.billNumber = billNumber;
        this.amount = amount;
        this.exitTime = exitTime;
        this.ticket = ticket;
        this.exitGate = exitGate;
    }
}

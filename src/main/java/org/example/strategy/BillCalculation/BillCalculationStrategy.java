package org.example.strategy.BillCalculation;

import org.example.enums.BillStrategyEnum;
import org.example.model.Ticket;
import org.example.model.Vehicle;

public interface BillCalculationStrategy {
    double calculateBill(BillStrategyEnum billStrategyEnum, Ticket ticket);
}

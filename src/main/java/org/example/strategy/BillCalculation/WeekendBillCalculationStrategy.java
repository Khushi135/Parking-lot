package org.example.strategy.BillCalculation;

import org.example.enums.BillStrategyEnum;
import org.example.model.Ticket;

public class WeekendBillCalculationStrategy implements BillCalculationStrategy{
    @Override
    public double calculateBill(BillStrategyEnum billStrategyEnum, Ticket ticket) {
        return 0;
    }
}

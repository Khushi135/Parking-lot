package org.example.strategy.BillCalculation;

import org.example.enums.BillStrategyEnum;

public class BillCalculationFactoryStrategy {
    public static BillCalculationStrategy getBillCalculationStrategy(BillStrategyEnum billStrategyEnum){
        switch (billStrategyEnum){
            case WEEKDAYS -> {
                return new WeekDaysBillCalculationStrategy();
            }
            case WEEKEND -> {
                return new WeekendBillCalculationStrategy();
            }
            default -> {
                return null;
            }
        }
    }
}

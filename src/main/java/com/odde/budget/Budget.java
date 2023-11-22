package com.odde.budget;

import java.time.YearMonth;

public class Budget {

    private YearMonth yearMonth;
    private int amount;

    public Budget(YearMonth yearMonth, int amount) {
        this.yearMonth = yearMonth;
        this.amount = amount;
    }

    public YearMonth getYearMonth() {
        return yearMonth;
    }

    public int getAmount() {
        return amount;
    }
}

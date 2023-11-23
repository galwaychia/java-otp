package com.odde.budget;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public TimePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public LocalDate getOverlapStartIndex(TimePeriod budgetTimePeriod) {
        LocalDate startIndex = null;
        if (getStart().isBefore(budgetTimePeriod.getStart())) {
            startIndex = budgetTimePeriod.getStart();
        } else if (!getStart().isAfter(budgetTimePeriod.getEnd())) {
            startIndex = getStart();
        }
        return startIndex;
    }

    public int getDays() {
        return Period.between(getStart(), getEnd()).getDays() + 1;
    }

    LocalDate getOverlapEndIndex(TimePeriod budgetTimePeriod) {
        LocalDate endIndex = null;
        if (getEnd().isAfter(budgetTimePeriod.getEnd())) {
            endIndex = budgetTimePeriod.getEnd();
        } else if (!getEnd().isBefore(budgetTimePeriod.getStart())) {
            endIndex = getEnd();
        }
        return endIndex;
    }
}

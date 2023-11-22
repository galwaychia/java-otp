package com.odde.budget;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class BudgetService {

    private BudgetRepo budgetRepo;

    public BudgetService(BudgetRepo budgetRepo) {
        this.budgetRepo = budgetRepo;
    }

    public int queryBudget(LocalDate start, LocalDate end) {
        List<Budget> allBudget = budgetRepo.findAll();
        int amount = 0;
        for (int i = 0; i < allBudget.size(); i++) {
            Budget temBudget = allBudget.get(i);
            LocalDate startDateOfBudget = temBudget.getYearMonth().atDay(1);
            System.out.println("startDateOfBudget: " + startDateOfBudget);
            LocalDate endDateOfBudget = temBudget.getYearMonth().atEndOfMonth();
            System.out.println("endDateOfBudget: " + endDateOfBudget);
            int totalDays = Period.between(startDateOfBudget, endDateOfBudget).getDays() + 1;

            // get startIndex
            LocalDate startIndex = null;
            if (start.isBefore(startDateOfBudget)) {
                startIndex = startDateOfBudget;
            } else if (!start.isAfter(endDateOfBudget)) {
                startIndex = start;
            }
            if (startIndex == null) continue;

            // get endIndex
            LocalDate endIndex = null;
            if (end.isAfter(endDateOfBudget)) {
                endIndex = endDateOfBudget;
            } else if (!end.isBefore(startDateOfBudget)) {
                endIndex = end;
            }
            if (endIndex == null) continue;
            if (endIndex.isBefore(startIndex)) continue;

            int days = Period.between(startIndex, endIndex).getDays() + 1;
            amount += temBudget.getAmount() / totalDays * days;
        }
        return amount;
    }


}

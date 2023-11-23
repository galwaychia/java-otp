package com.odde.budget;

import java.time.LocalDate;
import java.util.List;

public class BudgetService {

    private BudgetRepo budgetRepo;

    public BudgetService(BudgetRepo budgetRepo) {
        this.budgetRepo = budgetRepo;
    }

    public int queryBudget(TimePeriod timePeriod) {
        List<Budget> allBudget = budgetRepo.findAll();
        int amount = 0;
        for (int i = 0; i < allBudget.size(); i++) {
            Budget temBudget = allBudget.get(i);

            TimePeriod budgetTimePeriod = temBudget.getBudgetTimePeriod();

            // get startIndex
            LocalDate startIndex = timePeriod.getOverlapStartIndex(budgetTimePeriod);
            if (startIndex == null) continue;

            // get endIndex
            LocalDate endIndex = timePeriod.getOverlapEndIndex(budgetTimePeriod);
            if (endIndex == null) continue;

            if (endIndex.isBefore(startIndex)) continue;

            int days = new TimePeriod(startIndex, endIndex).getDays();
            int totalDays = budgetTimePeriod.getDays();
            amount += temBudget.getAmount() / totalDays * days;
        }
        return amount;
    }

}

package com.odde.budget;

import java.util.List;

public class BudgetRepoImpl implements BudgetRepo {
    private final List<Budget> allBudget;

    public BudgetRepoImpl(List<Budget> allBudget) {
        this.allBudget = allBudget;
    }

    @Override
    public List<Budget> findAll() {
        return allBudget;
    }
}

package com.odde.budget;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetServiceTest {

    @Test
    public void budgetTest01() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231001-231230
        LocalDate startQueryDate = LocalDate.of(2023, 10, 1);
        LocalDate endQueryDate = LocalDate.of(2023, 12, 30);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 30
        assertTrue(budgetAmount == 30);
    }

    @Test
    public void budgetTest02() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231101-231102
        LocalDate startQueryDate = LocalDate.of(2023, 11, 1);
        LocalDate endQueryDate = LocalDate.of(2023, 11, 2);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 2
        assertTrue(budgetAmount == 2);
    }

    @Test
    public void budgetTest03() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231102-231103
        LocalDate startQueryDate = LocalDate.of(2023, 11, 2);
        LocalDate endQueryDate = LocalDate.of(2023, 11, 3);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 2
        assertTrue(budgetAmount == 2);
    }

    @Test
    public void budgetTest04() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231129-231203
        LocalDate startQueryDate = LocalDate.of(2023, 11, 29);
        LocalDate endQueryDate = LocalDate.of(2023, 12, 3);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 2
        assertTrue(budgetAmount == 2);
    }

    @Test
    public void budgetTest05() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231001-231003
        LocalDate startQueryDate = LocalDate.of(2023, 10, 1);
        LocalDate endQueryDate = LocalDate.of(2023, 10, 3);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 0
        assertTrue(budgetAmount == 0);
    }

    @Test
    public void budgetTest06() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231201-231203
        LocalDate startQueryDate = LocalDate.of(2023, 12, 1);
        LocalDate endQueryDate = LocalDate.of(2023, 12, 3);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 0
        assertTrue(budgetAmount == 0);
    }

    @Test
    public void budgetTest07() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231130-231203
        LocalDate startQueryDate = LocalDate.of(2023, 11, 30);
        LocalDate endQueryDate = LocalDate.of(2023, 12, 3);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 1
        assertTrue(budgetAmount == 1);
    }

    @Test
    public void budgetTest08() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231002-231101
        LocalDate startQueryDate = LocalDate.of(2023, 10, 2);
        LocalDate endQueryDate = LocalDate.of(2023, 11, 1);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 1
        assertTrue(budgetAmount == 1);
    }

    @Test
    public void budgetTest09() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231106-231106
        LocalDate startQueryDate = LocalDate.of(2023, 11, 6);
        LocalDate endQueryDate = LocalDate.of(2023, 11, 6);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 1
        assertTrue(budgetAmount == 1);
    }

    @Test
    public void budgetTest10() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);

        // When query 231106-231105
        LocalDate startQueryDate = LocalDate.of(2023, 11, 6);
        LocalDate endQueryDate = LocalDate.of(2023, 11, 5);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 0
        assertTrue(budgetAmount == 0);
    }

    @Test
    public void budgetTest11() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);
        // Given 2309 budget 30
        YearMonth yearMonth9 = YearMonth.of(2023, 9);
        Budget budget9 = new Budget(yearMonth9, 30);
        allBudget.add(budget9);

        // When query 23901-231230
        LocalDate startQueryDate = LocalDate.of(2023, 9, 1);
        LocalDate endQueryDate = LocalDate.of(2023, 12, 30);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 60
        assertTrue(budgetAmount == 60);
    }

    @Test
    public void budgetTest12() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);
        // Given 2309 budget 30
        YearMonth yearMonth9 = YearMonth.of(2023, 9);
        Budget budget9 = new Budget(yearMonth9, 30);
        allBudget.add(budget9);

        // When query 23916-231230
        LocalDate startQueryDate = LocalDate.of(2023, 9, 16);
        LocalDate endQueryDate = LocalDate.of(2023, 12, 30);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 45
        assertTrue(budgetAmount == 45);
    }

    @Test
    public void budgetTest13() {
        // Given 2311 budget 30
        YearMonth yearMonth = YearMonth.of(2023, 11);
        System.out.println(yearMonth);
        Budget budget = new Budget(yearMonth, 30);
        List<Budget> allBudget = new ArrayList<>();
        allBudget.add(budget);
        // Given 2309 budget 30
        YearMonth yearMonth9 = YearMonth.of(2023, 9);
        Budget budget9 = new Budget(yearMonth9, 30);
        allBudget.add(budget9);

        // When query 23916-231115
        LocalDate startQueryDate = LocalDate.of(2023, 9, 16);
        LocalDate endQueryDate = LocalDate.of(2023, 11, 15);

        BudgetRepo budgetRepo = new BudgetRepoImpl(allBudget);
        BudgetService budgetService = new BudgetService(budgetRepo);
        System.out.println(startQueryDate);
        int budgetAmount = budgetService.queryBudget(startQueryDate, endQueryDate);
        System.out.println(budgetAmount);

        // Then return 30
        assertTrue(budgetAmount == 30);
    }

}
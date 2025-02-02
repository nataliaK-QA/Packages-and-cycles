package ru.netology.javaqa.Packages_and_loops.services;

public class FreelanceService {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                // Отдых
                count++;
                money -= expenses;
                money /= 3;
            } else {
                // Работа
                money += income;
                money -= expenses;
            }
        }

        return count;
    }
}
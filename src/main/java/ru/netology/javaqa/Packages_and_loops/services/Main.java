package ru.netology.javaqa.Packages_and_loops.services;

public class Main {

    public static void main(String[] args) {
        int income = 50000;
        int expenses = 30000;
        int threshold = 100000;

        FreelanceService freelanceService = new FreelanceService();
        int vacationMonths = freelanceService.calculateVacationMonths(income, expenses, threshold);
        System.out.println("Количество месяцев на отпуск: " + vacationMonths);
    }

}
//50000,30000,100000,2
//0,10000,-3000,1
//7000,10000,-3000,1
//14000,10000,-3000,6
//21000,-3000,-12000,12
//6000,10000,-3000,1
//13000,10000,-3000,6
//20000,-3000,-11334,12
//5666,10000,-3000,1
//12666,10000,-3000,6
//19666,10000,-3000,8
//26666,-3000,-15778,12
//7888,10000,-3000,1
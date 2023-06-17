package ru.netology.Money.services;

public class Vacationmoney {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) - expenses-expenses-expenses;
            } else {
                money = money + income;
            }
        }
        return count;


    }
}

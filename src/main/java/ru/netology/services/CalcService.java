package ru.netology.services;

public class CalcService {

    public int calcVacation(int income, int expenses, int threshold) {
        int vacationMonths = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                vacationMonths++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money =  (money + income) - expenses;
            }
        }
        return vacationMonths;

    }
}

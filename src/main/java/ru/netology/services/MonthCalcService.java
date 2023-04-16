package ru.netology.services;

public class MonthCalcService {
      public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int restPay = 0; //затраты на отдых
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // достаточно-ли на счету для отдыха?
                restPay = (money - expenses) - ((money - expenses) / 3);
                System.out.println("Месяц " + (month) + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + restPay);
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;

            } else {
                System.out.println("Месяц " + (month) + ". Денег " + money + ". Придётся поработать. Заработал +" + income +", потратил -" + expenses );
                money = money - expenses + income;

            }
        }
        return count;
    }
}

package ru.netology.services;
import ru.netology.services.MonthCalcService;

public class Main {
    public static void main(String[] args) {
        MonthCalcService service = new MonthCalcService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int count = service.calculate(income, expenses, threshold );
        System.out.println("Итого, за год, можно отдохнуть " + count + " раза (месяца)");


    }
}
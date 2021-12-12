package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double newPercent = percent * 0.01;
            while (amount > 0) {
                amount += amount * newPercent - salary;
                year++;
            }
            return year;
    }
}

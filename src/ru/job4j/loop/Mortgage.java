package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double balance = amount;

        while (balance + balance * percent * 0.01 - salary > 0) {
            balance = balance + balance * percent * 0.01 - salary;
            year++;
        }

        return year;
    }
}

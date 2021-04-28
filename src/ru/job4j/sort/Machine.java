package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int diff = money - price;
        int size = 0;

        for (int i = 0; i < coins.length; i++) {
            while (diff - coins[i] >= 0) {
                rsl[size] = coins[i];
                diff -= coins[i];
                size++;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}

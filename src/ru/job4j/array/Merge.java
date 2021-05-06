package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int m = 0;
        int n = 0;
        int index = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (m < left.length && (n >= right.length || left[m] < right[n])) {
                rsl[i] = left[m];
                m++;
            } else {
                rsl[i] = right[n];
                n++;
            }
        }
        return rsl;
    }
}

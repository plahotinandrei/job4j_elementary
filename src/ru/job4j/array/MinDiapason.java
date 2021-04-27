package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        int end = finish > array.length - 1 ? array.length - 1 : finish;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
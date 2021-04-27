package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort1() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {0, 7, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {5, 2, 1, 9, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 5, 9};
        Assert.assertArrayEquals(expected, result);
    }
}
package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas4Then1() {
        int[] data = {2, 4, 0, 6, 8};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7ThenMinus1() {
        int[] data = {2, 4, 0, 6, 8};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOfInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind8() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 8;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOfInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind4() {
        int[] data = new int[] {5, 2, 10, 2, 4, 9};
        int el = 4;
        int start = 4;
        int finish = 15;
        int result = FindLoop.indexOfInRange(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}
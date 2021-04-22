package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {

    @Test
    public void when4isEvenThenTrue() {
        int in = 4;
        boolean expected = true;
        boolean out = LogicNot.isEven(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when5notEvenThenTrue() {
        int in = 5;
        boolean expected = true;
        boolean out = LogicNot.notEven(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when5isPositiveThenTrue() {
        int in = 5;
        boolean expected = true;
        boolean out = LogicNot.isPositive(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMinus5notPositiveThenTrue() {
        int in = -5;
        boolean expected = true;
        boolean out = LogicNot.notPositive(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when5notEvenAndPositiveThenTrue() {
        int in = 5;
        boolean expected = true;
        boolean out = LogicNot.notEvenAndPositive(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMinus6evenOrNotPositiveThenTrue() {
        int in = -6;
        boolean expected = true;
        boolean out = LogicNot.evenOrNotPositive(in);
        Assert.assertEquals(expected, out);
    }
}
package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert0RblThen0Euro() {
        int in = 0;
        int expected = 0;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert0RblThen0Dollar() {
        int in = 0;
        int expected = 0;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert50EuThen3500Ruble() {
        int in = 50;
        int expected = 3500;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert0EuThen0Ruble() {
        int in = 0;
        int expected = 0;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert150DolThen9000Ruble() {
        int in = 150;
        int expected = 9000;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert0DolThen0Ruble() {
        int in = 0;
        int expected = 0;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}
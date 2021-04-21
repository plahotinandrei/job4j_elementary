package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");

        int ruble = Converter.euroToRuble(50);
        System.out.println("50 euro are " + ruble + " rubles.");

        ruble = Converter.dollarToRuble(150);
        System.out.println("150 dollars are " + ruble + " rubles.");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);

        in = 50;
        expected = 3500;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("50 euro are 3500. Test result : " + passed);

        in = 150;
        expected = 9000;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("150 dollar are 9000. Test result : " + passed);

    }
}

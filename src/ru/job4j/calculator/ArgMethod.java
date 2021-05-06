package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void myAge(int age) {
        System.out.println("My age is " + age + " years old");
    }

    public static void main(String[] args) {
        String name = "Andrey Plahotin";
        int age = 26;
        ArgMethod.hello(name);
        ArgMethod.myAge(age);
    }
}

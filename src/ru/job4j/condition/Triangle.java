package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
    }

    public static void main(String[] args) {
        boolean isTriangle = exist(2, 3, 1);
        System.out.println("is Triangle? " + isTriangle);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        MojKalkulator mojKalkulator = new MojKalkulator();

        System.out.println( mojKalkulator.dodaj(10, 20) );
        System.out.println( mojKalkulator.odejmij(10, 20) );
        System.out.println( mojKalkulator.sinus(90) );

        Kalkulator nowyKalkulator = new MojKalkulator();

        System.out.println( nowyKalkulator.dodaj(10, 20) );
        System.out.println( nowyKalkulator.odejmij(10, 20) );

    }
}

interface Kalkulator{
    double PI = 3.14159;

    double dodaj(double a, double b);
    double odejmij(double a, double b);

}

class MojKalkulator implements Kalkulator {
    public double dodaj(double a, double b) {
        return a + b;
    }

    public double odejmij(double a, double b) {
        return a - b;
    }

    public double sinus(double deg) {
        double radians = deg * 3.14159 / 180;
        return Math.sin(radians);
    }
}
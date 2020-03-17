package com.company;

public class Main {

    public static void main(String[] args) {
        zadanie10 Pierwszy = new zadanie10();
        zadanie10 Drugi = new zadanie10(12);
        zadanie10 Trzeci = new zadanie10(12, 10);

        Pierwszy.wykonajOperacjeMatematycznaDodawanie();
        Drugi.wykonajOperacjeMatematycznaDodawanie(1);
        Trzeci.wykonajOperacjeMatematycznaDodawanie();
        Pierwszy.wykonajOperacjeMatematycznaMnozenie(10,24);
        Drugi.wykonajOperacjeMatematycznaMnozenie(55, 24);
        Trzeci.wykonajOperacjeMatematycznaMnozenie(1,1);

    }
}

class zadanie10
{
    int a;
    int b;

    zadanie10()
    {
        a = 0;
        b = 0;
    }

    zadanie10(int x, int y)
    {
        a = x;
        b = y;
    }

    zadanie10(int x)
    {
        a = x;
        b = 0;
    }

    void wykonajOperacjeMatematycznaDodawanie()
    {
        System.out.println(a + b);
    }

    void wykonajOperacjeMatematycznaDodawanie(int a)
    {
        System.out.println(a + b);
    }

    void wykonajOperacjeMatematycznaMnozenie(int a, int b)
    {
        System.out.println(a * b);
    }

}
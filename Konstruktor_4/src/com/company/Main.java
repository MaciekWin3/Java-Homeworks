package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladPrzeciazanie Jeden = new PrzykladPrzeciazanie ();
        PrzykladPrzeciazanie Dwa = new PrzykladPrzeciazanie ();
        PrzykladPrzeciazanie Trzy = new PrzykladPrzeciazanie ();
        Jeden.wypisz(5);
        Dwa.wypisz(5.7);
        Trzy.wypisz("Abc");

    }
}

class PrzykladPrzeciazanie
{

    void wypisz(int a)
    {
        System.out.println("int: " + a);
    }

    void wypisz(double a)
    {
        System.out.println("double: " + a);
    }

    void wypisz(String a)
    {
        System.out.println("string: " + a);
    }
}
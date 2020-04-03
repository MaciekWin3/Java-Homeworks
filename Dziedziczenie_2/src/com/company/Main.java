package com.company;

public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator(10,10);
        kalkulator.dodaj();
        kalkulator.odejmij();
        KalkulatorStatyczny kalkulatorStatyczny = new KalkulatorStatyczny(10,10,30);
        kalkulatorStatyczny.dodaj();
        kalkulatorStatyczny.odejmij();
        kalkulatorStatyczny.sinus();
    }
}

class Kalkulator
{
    int x;
    int y;

    Kalkulator(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    void dodaj()
    {
        System.out.println(x+y);
    }
    void odejmij()
    {
        System.out.println(x-y);
    }
}

class KalkulatorStatyczny extends Kalkulator
{
    int z;
    KalkulatorStatyczny(int x, int y, int z)
    {
        super(x,y);
        this.z = z;
    }

    void sinus()
    {
        System.out.println(Math.sin(z));
    }
}
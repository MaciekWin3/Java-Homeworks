package com.company;

public class Main {

    public static void main(String[] args) {
        przykladDwa Pierwszy = new przykladDwa();
        przykladDwa Drugi = new przykladDwa(12);
        przykladDwa Trzeci = new przykladDwa(12, 10);
        Pierwszy.wypisz();
        Drugi.wypisz();
        Trzeci.wypisz();

    }
}

class przykladDwa
{
    double prawdziwy;
    double wyimaginowany;

    przykladDwa()
    {
        prawdziwy = 0;
        wyimaginowany = 0;
    }

    przykladDwa(int a)
    {
        prawdziwy = a;
        wyimaginowany = 0;
    }

    przykladDwa(int x, int y)
    {
        prawdziwy = x;
        wyimaginowany = y;
    }

    void wypisz()
    {
        System.out.println(prawdziwy + " i " + wyimaginowany );
    }
}
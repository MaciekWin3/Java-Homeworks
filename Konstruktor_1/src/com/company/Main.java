package com.company;

public class Main {

    public static void main(String[] args) {
        Przyklad Pierwszy = new Przyklad();
        Przyklad Drugi = new Przyklad(12);
        Pierwszy.wypisz();
        Drugi.wypisz();
    }
}

class Przyklad
{
    int pole;


    public Przyklad() {
        pole = 10;
    }

    public Przyklad(int a) {
        pole = a;
    }


    void wypisz()
    {
        System.out.println("Pole wynosi : " + pole);
    }
}

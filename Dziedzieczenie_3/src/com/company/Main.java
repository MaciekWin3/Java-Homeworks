package com.company;

public class Main {

    public static void main(String[] args) {

        Podstawowa b1 = new Podstawowa();
        b1.wypisz();

        Pochodna d1 = new Pochodna();
        d1.wypisz();

    }
}

class Podstawowa
{
    public void wypisz()
    {
        System.out.println("Hello");
    }
}

class Pochodna extends Podstawowa
{
    public void wypisz(){
        super.wypisz();
        {
            System.out.println("World");
        }

    }
}

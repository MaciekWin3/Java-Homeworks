package com.company;

public class Main {

    public static void main(String[] args) {

        Podstawowa b1 = new Podstawowa();
        b1.f(); // w Podstawowa
        b1.g(); // w Podstawowa

        System.out.println();

        Pochodna d1 = new Pochodna();
        d1.f(); // w Podstawowa
        d1.g(); // w Pochodna
        d1.h(); // w Pochodna

        Podstawowa b2 = new Pochodna();
        b2.f(); // w Podstawowa
        b2.g(); // w Pochodna
    }

}

class Podstawowa {
    public void f() {
        System.out.println("f() w Podstawowa");
    }

    public void g() {
        System.out.println("g() w Podstawowa");
    }
}

class Pochodna extends Podstawowa {
    public void g() {
        System.out.println("g() w Pochodna");
    }

    public void h() {
        System.out.println("h() w Pochodna");
    }
}
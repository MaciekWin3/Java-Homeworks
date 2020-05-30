package com.company;

public class Main {

    public static void main(String[] args) {
        Samochod samochodPierwszy = new Samochod();
        Samochod samochodDrugi = new Samochod();

        samochodPierwszy.przyspiesz(80);
        samochodPierwszy.jedz(20);
        samochodPierwszy.wyswietlStan();

        samochodDrugi.przyspiesz(90);
        samochodDrugi.jedz(30);
        samochodDrugi.wyswietlStan();
    }
}

class Samochod{
    int predkosc;
    int dystans;


    public void jedz(int dystans) {
        this.dystans = dystans;
    }

    public void przyspiesz(int predkosc) {
        this.predkosc = predkosc;
    }


    public void wyswietlStan() {
        System.out.println("Obecny stan");
        System.out.println("Predkosc wynosi: " + predkosc);
        System.out.println("Samochod pokonał dystans? " + dystans);
    }
}

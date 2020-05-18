package com.company;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        Rower rowerPierwszy = new Rower();
        Rower rowerDrugi = new Rower();

        rowerPierwszy.start();
        rowerDrugi.start();

        rowerDrugi.przyspiesz(50);

        rowerPierwszy.wyswietlStan();
        rowerDrugi.wyswietlStan();

        rowerDrugi.stop();

        rowerDrugi.wyswietlStan();

        KontoBankowe rachunek = new KontoBankowe();

        rachunek.pokazSaldo();
        rachunek.kredyt(100);
        rachunek.pokazSaldo();
        rachunek.debet(20);
        rachunek.pokazSaldo();


        KoszykProduktow koszyk = new KoszykProduktow();

        koszyk.dodajProduktDoKoszyka("maslo");
        koszyk.dodajProduktDoKoszyka("chleb");
        koszyk.dodajProduktDoKoszyka("woda");

        koszyk.pokazZamowienie();
    }
}

class Rower{
    boolean wRuchu;
    int predkosc;

    public void start(){
        wRuchu = true;
        predkosc = 0;
    }

    public void stop(){
        wRuchu = false;
        predkosc = 0;
    }

    public void przyspiesz(int nowaPredkosc) {
        predkosc = nowaPredkosc;
    }

    public void wyswietlStan() {
        System.out.println("Obecny stan");
        System.out.println("Predkosc wynosi: " + predkosc);
        System.out.println(
                "Czy rower jest w ruchu? " + (wRuchu ? "Tak" : "Nie")
        );
    }
}

class KontoBankowe{
    private float saldo;

    public void pokazSaldo(){
        System.out.println("Saldo wynosi: " + saldo);
    }

    public void kredyt(int ilosc){
        saldo += ilosc;
    }

    public void debet(int ilosc) {
        saldo -= ilosc;
    }
}

class KoszykProduktow{
    private LinkedList produkty = new LinkedList();

    public void dodajProduktDoKoszyka(String produkt) {
        produkty.add(produkt);
    }

    public void pokazZamowienie(){
        System.out.println("Zamówione produkty:");
        System.out.println(produkty); //important
    }



}

//bardziej złożony przykład zadanie 3 na dole w kursie

//zad 4 in zad_1 folder
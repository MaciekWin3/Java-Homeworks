package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Main {

    public static void main(String[] args) {



        Telefon iPhone = new Telefon();
        iPhone.dodaj_tel_kom(69381032);

        Recepcjonista Tomek = new Recepcjonista(32434, "Tomek", "Kowalski");

        Planista Jakub = new Planista("Jakub", "Nowak", 1);

        Pracownik Piotr = new Pracownik("Piotr", "Nowak", 123);



        //jakub.podejrzyj_rejestr_zlecen();

        Tomek.dodaj_zlecenie(1,"01.04.2020","Oczekiwanie");
        Tomek.dodaj_zlecenie(2,"02.04.2020","Oczekiwanie");
        Tomek.dodaj_zlecenie(3,"03.04.2020","Oczekiwanie");
        Tomek.dodaj_zlecenie(4,"04.04.2020","Oczekiwanie");
        Tomek.dodaj_zlecenie(5,"05.04.2020","Oczekiwanie");
        Tomek.dodaj_zlecenie(6,"06.04.2020","Oczekiwanie");


        Piotr.zmien_status_zlecenia(2, "Zamknięte");

       // Jakub.podejrzyj_rejestr_zlecen();

        Rejestr_zlecen.usun_zlecenie(5);



        Rejestr_zlecen.modyfikuj_zlecenie(4, 10, "04.04.2018", "Otwarte");
        Rejestr_zlecen.modyfikuj_zlecenie(3, 2, "04.04.2018", "Otwarte");
        //Jakub.podejrzyj_rejestr_zlecen();
        Rejestr_zlecen.sortuj_zlecenia_FIFO();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        Rejestr_zlecen.sortuj_zlecenia_LIFO();
        Jakub.podejrzyj_rejestr_zlecen();


    }
}

class Telefon{
    protected int tel_kom;
    protected int tel_stac;

    public void dodaj_tel_kom(int tel_kom){
        this.tel_kom = tel_kom;
    }

    public void dodaj_tel_stac(int tel_stac){
        this.tel_stac = tel_stac;
    }


}

class Recepcjonista{

    Recepcjonista(int nip, String imie, String nazwisko){
        this.nip = nip;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    protected int nip;
    protected String imie;
    private String nazwisko;

    public void dodaj_zlecenie(int id_zlecenia, String data_utworzenia, String status){
        Zlecenie zleconko = new Zlecenie(id_zlecenia, data_utworzenia, status);
        Rejestr_zlecen.zlecenia.add(zleconko);
    };
}

class Zlecenie{


    Zlecenie(int id_zlecenia, String data_utworzenia,  String status) {
        this.data_utworzenia = data_utworzenia;
        this.id_zlecenia = id_zlecenia;
        this.status = status;
    }


    protected String data_utworzenia;
    protected int id_zlecenia;
    protected String status;

}

class Pracownik{
    protected String imie;
    private String nazwisko;
    protected int id_pracownika;

    Pracownik(String imie, String nazwisko, int id_pracownika){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id_pracownika = id_pracownika;
    }

    public void zmien_status_zlecenia(int id_zlecenia, String status){
        Rejestr_zlecen.zlecenia.get(id_zlecenia + 1).status = status;
    }

}

class Planista{
    protected String imie;
    private String nazwisko;
    protected int id_planista;

    Planista(String imie, String nazwisko, int id_planista){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id_planista = id_planista;
    }

    public void podejrzyj_rejestr_zlecen(){

        for(int i = 0; i < Rejestr_zlecen.zlecenia.size();i++){
            if(i == 0)
            {
                System.out.println("======================");
            }
            //System.out.println("======================");
            System.out.println("Zlecenie o id: " + Rejestr_zlecen.zlecenia.get(i).id_zlecenia);
            System.out.println("Data utworzenia: " + Rejestr_zlecen.zlecenia.get(i).data_utworzenia);
            System.out.println("Status: " + Rejestr_zlecen.zlecenia.get(i).status);
            System.out.println("======================");
        }
    }

    public void przydziel_zlecenia_pracownikowi(){

    }

}

class Rejestr_zlecen{
    public static ArrayList<Zlecenie> zlecenia = new ArrayList<Zlecenie>();

    public static void usun_zlecenie(int id_zlecenia){
        zlecenia.remove(id_zlecenia - 1);
    }

    public static void modyfikuj_zlecenie(int id_zlecenia_do_zmiany, int id_zlecenia, String data_utworzenia, String status){

        boolean czy = true;

        for(int i = 0; i < Rejestr_zlecen.zlecenia.size();i++){
            if(id_zlecenia == Rejestr_zlecen.zlecenia.get(i).id_zlecenia)
            {
               czy = false;
            }
        }

        if(czy){
            Rejestr_zlecen.zlecenia.get(id_zlecenia_do_zmiany - 1).data_utworzenia = data_utworzenia;
            Rejestr_zlecen.zlecenia.get(id_zlecenia_do_zmiany - 1).status = status;
            Rejestr_zlecen.zlecenia.get(id_zlecenia_do_zmiany - 1).id_zlecenia = id_zlecenia;
        }else{
            System.out.println("Error! Zlecenie o takim numerze ID (" + id_zlecenia+ ") już istnieje! Nie dokonano zmian!");
        }

    }

    public static void sortuj_zlecenia_FIFO (){
        //w arrayList są automatycznie posortowane FIFO

    }

    public static void sortuj_zlecenia_LIFO(){
        Collections.reverse(zlecenia);
    }


}
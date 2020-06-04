package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Recepcjonista Tomek = new Recepcjonista(32434, "Tomek", "Kowalski");

        Planista Jakub = new Planista("Jakub", "Nowak", 1);


        Pracownik Piotr = new Pracownik("Piotr", "Nowak", 123);
        Pracownik Damian = new Pracownik("Damian", "Ptach", 124);

        Tomek.dodaj_zlecenie(1,"01.04.2020","Oczekiwanie");
        Tomek.dodaj_zlecenie(2,"02.04.2020","Oczekiwanie");
        Tomek.dodaj_zlecenie(3,"03.04.2020","W trakcie");
        Tomek.dodaj_zlecenie(4,"04.04.2020","W trakacie");
        Tomek.dodaj_zlecenie(5,"05.04.2020","W trakcie");
        Tomek.dodaj_zlecenie(6,"06.04.2020","W trakcie");
        Tomek.dodaj_zlecenie(7,"06.04.2020","Zakonczony");

        Piotr.zmien_status_zlecenia(2, "Zamknięte");
        Damian.zmien_status_zlecenia(1,"W trakcie");

        Rejestr_zlecen.usun_zlecenie(3);

        Rejestr_zlecen.modyfikuj_zlecenie(4, 10, "04.04.2018", "Otwarte");
        //Rejestr_zlecen.modyfikuj_zlecenie(3, 2, "04.04.2018", "Otwarte");
        //Jakub.podejrzyj_rejestr_zlecen();

        //Rejestr_zlecen.sortuj_zlecenia_FIFO();

        //Rejestr_zlecen.sortuj_zlecenia_LIFO();

        Jakub.przydziel_zlecenia_pracownikowi("Nowak",1);
        Jakub.przydziel_zlecenia_pracownikowi("Ptach",3);
        Jakub.przydziel_zlecenia_pracownikowi("Nowak",4);

        Jakub.podejrzyj_rejestr_zlecen();

        //Jakub.pokaz_zadania();

        Telefon iPhone = new Telefon();
        iPhone.dodaj_tel_kom(69381032, "Nowak");

        Telefon Android = new Telefon();
        iPhone.dodaj_tel_kom(69381692, "Kowalski");

        Telefon Stacjonarny = new Telefon();
        iPhone.dodaj_tel_stac(69381692, "Kowalski");


        //System.out.println(iPhone.tel_kom);

        Telefon.ksiazka_telefoniczna();

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

    public static List zadania = new ArrayList();

    Pracownik(String imie, String nazwisko, int id_pracownika){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id_pracownika = id_pracownika;
    }

    public void zmien_status_zlecenia(int id_zlecenia, String status){
        Rejestr_zlecen.zlecenia.get(id_zlecenia - 1).status = status;
    }

}

class Planista{
    protected String imie;
    private String nazwisko;
    protected int id_planista;
    public static Map<String, String> zadania = new HashMap<String, String>();

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

    public void przydziel_zlecenia_pracownikowi( String nazwisko, int id_zlecenia){
        String zadanie = Integer.toString(id_zlecenia);
        zadania.put(zadanie, nazwisko);

    }

    public void pokaz_zadania(){

        System.out.println(Arrays.asList(zadania));

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

class Telefon{
    protected int tel_kom;
    protected int tel_stac;
    public static Map<String, String> numery_tel = new HashMap<String, String>();

    public void dodaj_tel_kom(int tel_kom, String nazwisko){
        String zadanie = Integer.toString(tel_kom);
        numery_tel.put(zadanie, nazwisko);
    }

    public void dodaj_tel_stac(int tel_stac, String nazwisko ){
        String zadanie = Integer.toString(tel_stac);
        numery_tel.put(zadanie, nazwisko);
    }

    public static void ksiazka_telefoniczna(){

        System.out.println(Arrays.asList(numery_tel));

    }

}
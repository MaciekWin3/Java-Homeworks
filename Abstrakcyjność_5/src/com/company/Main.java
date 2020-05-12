package com.company;

public class Main {

    public static void main(String[] args) {
	    int [] tablica = {10, 20, 30, 10, 20};
	    int szukany = 30;
	    WyszukiwanieRownych search = new WyszukiwanieRownych();
	    if(search.szukaj(tablica, szukany) == -1){
            System.out.println("Nie znaleziono");
        }
	    else if(search.szukaj(tablica, szukany) != -1){
            int index = search.szukaj(tablica, szukany);
            System.out.println("Znaleziono w indeksie numer: " + index);
        }
    }
}

abstract class Wyszukiwanie{
    public boolean porownaj(int a, int b) {
      return false;
    }

    public int szukaj(int a[], int ele){
        for(int i=0; i < a.length; i++) { if ( porownaj(a[i], ele) ) { return i; } } return -1;

    }
}

class WyszukiwanieRownych extends Wyszukiwanie{

    public boolean porownaj(int a, int b) {
        if(a == b)
        {
            return true;
        }
        return false;
    }
}

class WyszukiwanieNierownych extends Wyszukiwanie{
    public boolean porownaj(int a, int b) {
        if(a != b)
        {
            return true;
        }
        return false;
    }
}
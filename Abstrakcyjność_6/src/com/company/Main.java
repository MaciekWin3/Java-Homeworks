package com.company;

public class Main {

    public static void main(String[] args) {
	    PrzykladowaKlasa przykladowaKlasa = new PrzykladowaKlasa();
	    przykladowaKlasa.przykladowaMetoda();
        przykladowaKlasa.innaMetoda();

    }
}

interface PrzykladowyInterfejs{
    void przykladowaMetoda();

}

interface InnyInterface{
    void innaMetoda();
}

class PrzykladowaKlasa implements PrzykladowyInterfejs, InnyInterface{
    @Override
    public void przykladowaMetoda() {
        System.out.println("Implementacja przykladowejMetody");
    }

    @Override
    public void innaMetoda() {
        System.out.println("Implementacja innejMetody");
    }
}
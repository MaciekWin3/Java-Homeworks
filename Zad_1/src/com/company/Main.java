package com.company;

public class Main {

    public static void main(String[] args)
    {
        Punkt Pierwszy = new Punkt(10,20);
        Punkt Drugi = new Punkt(2,4);
        Pierwszy.wyswietlWspolrzedne();
        Drugi.wyswietlWspolrzedne();
        Linia Pierwsza = new Linia(Pierwszy,Drugi);
        Pierwsza.toString();
    }
}

class Punkt
{
    int x;
    int y;


    Punkt(int wspX,int wspY)
    {
        x = wspX;
        y = wspY;
    }


    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void wyswietlWspolrzedne() {
        System.out.println("Punkt: (" + x +","+ y + ")");

    }


}

class Linia
{
    int q, w, e, r;
    Punkt poczatek;
    Punkt koniec;
    Linia(Punkt start, Punkt end)
    {
        poczatek = start;
        koniec = end;
    }
    Linia(int q, int w, int e, int r)
    {
        this.q = q;
        this.w = w;
        this.e = e;
        this.r = r;
    }
}



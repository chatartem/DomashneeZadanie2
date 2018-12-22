package com.company;

public class Tovar {
    String name;
    int kol;
    double cena;
    double stoim;

    public Tovar(String name, int kol, double cena, double stoim){
        this.name = name;
        this.kol = kol;
        this.cena=cena;
        this.stoim=cena*kol;

    }


}

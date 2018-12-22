package com.company;


import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

    Tovar t = new Tovar("OnePlus 5",1,32000.0,32000.0);
    Pokupki p = new Pokupki("21.12.2018", "SPB,Voskresenskaya Naberezhnaya, 30",true);
    Pokupatel pl = new Pokupatel("dvcweb","Kirkorov Filipp Bedrosovich");
    Gson gpl = new Gson();
    String jsonPL = gpl.toJson(pl);
        Gson gp = new Gson();
        String jsonP = gpl.toJson(p);
        Gson gt = new Gson();
        String jsonT = gpl.toJson(t);
        System.out.println("________СЕРИАЛИЗАЦИЯ:_________________________________________"); //razriv
    System.out.println("Tovar:" + jsonT);
        System.out.println("Pokupki:" + jsonP);
        System.out.println("Pokupatel:" + jsonPL);
System.out.println("________ДЕСЕРИАЛИЗАЦИЯ:_________________________________________"); //razriv
System.out.println("");
        String jsonT2 = "{\"name\":\"OnePlus 5\",\"kol\":1,\"cena\":32000.0,\"stoim\":32000.0}";
        System.out.println("Tovar [From JSON]: " + jsonT2);
        String jsonP2 = "{\"data\":\"21.12.2018\",\"adres\":\"SPB,Voskresenskaya Naberezhnaya, 30\",\"oplach\":true}";
        System.out.println("Pokupki [From JSON]: " + jsonP2);
        String jsonPL2 = "{\"login\":\"dvcweb\",\"imia\":\"Kirkorov Filipp Bedrosovich\"}";
        System.out.println("Pokupatel [From JSON]: " + jsonPL2);
        Tovar t2 = gp.fromJson(jsonT2, Tovar.class);
        System.out.println("_________________________________________________"); //razriv
        System.out.println("");
        System.out.println(t2.name);

    }
}

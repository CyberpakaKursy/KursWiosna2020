package gry;

import rankingi.Gracz;
import rankingi.WynikGry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Wojna implements Gra {
    private Gracz gracz;
    private String nazwaGry = "Wojna";
    private int wynik;
    private Integer wartosc;
    private String nazwa;

    /*  List ListaKart = new ArrayList(); */

    /*   public static void(){
           System.out.println("Jak się nazywasz? :)");
           Gracz nowyGracz = new Gracz(skaner.next());
           System.out.println("Witaj" + nickGracza.pobierzNick() + "w grze w wojne");
       }
   */
    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        gracz = nowyGracz;
        System.out.println("Witaj w grze w wojne" + nowyGracz);
        HashSet<Karta> listaKart = new HashSet<>();
        /*2*/
        listaKart.add(new Karta("2Pik",2));
        listaKart.add(new Karta("2Trefl",2));
        listaKart.add(new Karta("2Karo",2));
        listaKart.add(new Karta("2Kier",2));
        /*3*/
        listaKart.add(new Karta("3Pik",3));
        listaKart.add(new Karta("3Trefl",3));
        listaKart.add(new Karta("3Karo",3));
        listaKart.add(new Karta("3Kier",3));
        /*4*/
        listaKart.add(new Karta("4Pik",4));
        listaKart.add(new Karta("4Trefl",4));
        listaKart.add(new Karta("4Karo",4));
        listaKart.add(new Karta("4Kier",4));
        /*5*/
        listaKart.add(new Karta("5Pik",5));
        listaKart.add(new Karta("5Trefl",5));
        listaKart.add(new Karta("5Karo",5));
        listaKart.add(new Karta("5Kier",5));
        /*6*/
        listaKart.add(new Karta("6Pik",6));
        listaKart.add(new Karta("6Trefl",6));
        listaKart.add(new Karta("6Karo",6));
        listaKart.add(new Karta("6Kier",6));
        /*7*/
        listaKart.add(new Karta("7Pik",7));
        listaKart.add(new Karta("7Trefl",7));
        listaKart.add(new Karta("7Karo",7));
        listaKart.add(new Karta("7Kier",7));
        /*8*/
        listaKart.add(new Karta("8Pik",7));
        listaKart.add(new Karta("8Trefl",7));
        listaKart.add(new Karta("8Karo",7));
        listaKart.add(new Karta("8Kier",7));
        /*9*/
        listaKart.add(new Karta("9Pik",7));
        listaKart.add(new Karta("9Trefl",7));
        listaKart.add(new Karta("9Karo",7));
        listaKart.add(new Karta("9Kier",7));
        /*10*/
        listaKart.add(new Karta("10Pik",7));
        listaKart.add(new Karta("10Trefl",7));
        listaKart.add(new Karta("10Karo",7));
        listaKart.add(new Karta("10Kier",7));
        /*jupek*/
        listaKart.add(new Karta("JupekPik",11));
        listaKart.add(new Karta("JupekTrefl",11));
        listaKart.add(new Karta("JupekKaro",11));
        listaKart.add(new Karta("JupekKier",11));
        /*dama*/
        listaKart.add(new Karta("DamaPik",12));
        listaKart.add(new Karta("DamaTrefl",12));
        listaKart.add(new Karta("DamaKaro",12));
        listaKart.add(new Karta("DamaKier",12));
        /*krol*/
        listaKart.add(new Karta("KrolPik",13));
        listaKart.add(new Karta("KrolTrefl",13));
        listaKart.add(new Karta("KrolKaro",13));
        listaKart.add(new Karta("KrolKier",13));
        /*AS*/
        listaKart.add(new Karta("ASPik",14));
        listaKart.add(new Karta("ASTrefl",14));
        listaKart.add(new Karta("ASKaro",14));
        listaKart.add(new Karta("ASKier",14));
        /*Jocker*/
        listaKart.add(new Karta("JockerCzerwony",15));
        listaKart.add(new Karta("JockerCzarny",15));

    }

    @Override
    public void ustawPoczatkoweWartosci() {
        wynik = 0;
        
    }

    @Override
    public void rozpocznijGre() {

    }

    @Override
    public WynikGry pobierzWynik() {
        return null;
    }

    @Override
    public void zakonczGre() {

    }

    @Override
    public String podajNazwe() {
        return null;
    }
}

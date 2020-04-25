package gry.makao;

import gry.Gra;
import gry.Karta;
import rankingi.Gracz;
import rankingi.WynikGry;

import java.util.HashSet;
import java.util.Set;

public class Makao implements Gra {
    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        System.out.println("Cześć " + nowyGracz.pobierzNick() + ", witaj w grze " + "Makao");
    }

    @Override
    public void ustawPoczatkoweWartosci() {
        HashSet<Karta> taliaKart = new HashSet<>();
        taliaKart.add(new Karta("2_pik", 2));
        taliaKart.add(new Karta("2_kier", 2));
        taliaKart.add(new Karta("2_trefl", 2));
        taliaKart.add(new Karta("2_karo", 2));
        //3//
        taliaKart.add(new Karta("3_pik", 3));
        taliaKart.add(new Karta("3_kier", 3));
        taliaKart.add(new Karta("3_trefl", 3));
        taliaKart.add(new Karta("3_karo", 3));
        //4//
        taliaKart.add(new Karta("4_pik", 4));
        taliaKart.add(new Karta("4_kier", 4));
        taliaKart.add(new Karta("4_trefl", 4));
        taliaKart.add(new Karta("4_karo", 4));
        //5//
        taliaKart.add(new Karta("5_pik", 5));
        taliaKart.add(new Karta("5_kier", 5));
        taliaKart.add(new Karta("5_tefl", 5));
        taliaKart.add(new Karta("5_karo", 5));
        //6//
        taliaKart.add(new Karta("6_pik", 6));
        taliaKart.add(new Karta("6_kier", 6));
        taliaKart.add(new Karta("6_trefl", 6));
        taliaKart.add(new Karta("6_karo", 6));
        //7//
        taliaKart.add(new Karta("7_pik", 7));
        taliaKart.add(new Karta("7_kier", 7));
        taliaKart.add(new Karta("7_trefl", 7));
        taliaKart.add(new Karta("7_karo", 7));
        //8//
        taliaKart.add(new Karta("8_pik", 8));
        taliaKart.add(new Karta("8_kier", 8));
        taliaKart.add(new Karta("8_trefl", 8));
        taliaKart.add(new Karta("8_karo", 8));
        //9//
        taliaKart.add(new Karta("9_pik", 9));
        taliaKart.add(new Karta("9_kier", 9));
        taliaKart.add(new Karta("9_trefl", 9));
        taliaKart.add(new Karta("9_karo", 9));
        //10//
        taliaKart.add(new Karta("10_pik", 10));
        taliaKart.add(new Karta("10_kier", 10));
        taliaKart.add(new Karta("10_trefl", 10));
        taliaKart.add(new Karta("10_karo", 10));
        //w//
        taliaKart.add(new Karta("Walet_pik", 11));
        taliaKart.add(new Karta("Walet_kier", 11));
        taliaKart.add(new Karta("Walet_trefl", 11));
        taliaKart.add(new Karta("Walet_karo", 11));
        //d//
        taliaKart.add(new Karta("Dama_pik", 12));
        taliaKart.add(new Karta("Dama_kier", 12));
        taliaKart.add(new Karta("Dama_trefl", 12));
        taliaKart.add(new Karta("Dama_karo", 12));
        //k//
        taliaKart.add(new Karta("Król_pik", 13));
        taliaKart.add(new Karta("Król_kier", 13));
        taliaKart.add(new Karta("Król_trefl", 13));
        taliaKart.add(new Karta("Król_karo", 13));
        //a//
        taliaKart.add(new Karta("As_pik", 14));
        taliaKart.add(new Karta("As_kier", 14));
        taliaKart.add(new Karta("As_trefl", 14));
        taliaKart.add(new Karta("As_karo", 14));



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

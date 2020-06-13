package gry.BlackJack;

import gry.Gra;
import gry.Karta;
import rankingi.Gracz;
import rankingi.WynikGry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class BlackJack implements Gra {

    private Gracz gracz;
    private ArrayList<Karta> talia;
    private int wartosc;

    public int getWartosc() {
        return wartosc;
    }

    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        System.out.println("Witaj w Black Jack-u");
        gracz = nowyGracz;
    }

    @Override
    public void ustawPoczatkoweWartosci() {
        Random rand = new Random();
        talia = new ArrayList<>();
        /*2*/
        talia.add(new Karta("2Pik", 2));
        talia.add(new Karta("2Trefl", 2));
        talia.add(new Karta("2Karo", 2));
        talia.add(new Karta("2Kier", 2));
        /*3*/
        talia.add(new Karta("3Pik", 3));
        talia.add(new Karta("3Trefl", 3));
        talia.add(new Karta("3Karo", 3));
        talia.add(new Karta("3Kier", 3));
        /*4*/
        talia.add(new Karta("4Pik", 4));
        talia.add(new Karta("4Trefl", 4));
        talia.add(new Karta("4Karo", 4));
        talia.add(new Karta("4Kier", 4));
        /*5*/
        talia.add(new Karta("5Pik", 5));
        talia.add(new Karta("5Trefl", 5));
        talia.add(new Karta("5Karo", 5));
        talia.add(new Karta("5Kier", 5));
        /*6*/
        talia.add(new Karta("6Pik", 6));
        talia.add(new Karta("6Trefl", 6));
        talia.add(new Karta("6Karo", 6));
        talia.add(new Karta("6Kier", 6));
        /*7*/
        talia.add(new Karta("7Pik", 7));
        talia.add(new Karta("7Trefl", 7));
        talia.add(new Karta("7Karo", 7));
        talia.add(new Karta("7Kier", 7));
        /*8*/
        talia.add(new Karta("8Pik", 8));
        talia.add(new Karta("8Trefl", 8));
        talia.add(new Karta("8Karo", 8));
        talia.add(new Karta("8Kier", 8));
        /*9*/
        talia.add(new Karta("9Pik", 9));
        talia.add(new Karta("9Trefl", 9));
        talia.add(new Karta("9Karo", 9));
        talia.add(new Karta("9Kier", 9));
        /*10*/
        talia.add(new Karta("10Pik", 10));
        talia.add(new Karta("10Trefl", 10));
        talia.add(new Karta("10Karo", 10));
        talia.add(new Karta("10Kier", 10));
        /*jupek*/
        talia.add(new Karta("JupekPik", 2));
        talia.add(new Karta("JupekTrefl", 2));
        talia.add(new Karta("JupekKaro", 2));
        talia.add(new Karta("JupekKier", 2));
        /*dama*/
        talia.add(new Karta("DamaPik", 3));
        talia.add(new Karta("DamaTrefl", 3));
        talia.add(new Karta("DamaKaro", 3));
        talia.add(new Karta("DamaKier", 3));
        /*krol*/
        talia.add(new Karta("KrolPik", 4));
        talia.add(new Karta("KrolTrefl", 4));
        talia.add(new Karta("KrolKaro", 4));
        talia.add(new Karta("KrolKier", 4));
        /*AS*/
        talia.add(new Karta("ASPik", 11));
        talia.add(new Karta("ASTrefl", 11));
        talia.add(new Karta("ASKaro", 11));
        talia.add(new Karta("ASKier", 11));
/*
        talia = tasowanie(talia);
    }

    private ArrayList tasowanie(ArrayList<Karta> talia) {
        Random random = new Random();
        int iloscPrzetasowan = 40 + random.nextInt(30);
        for (int i = 0; i < iloscPrzetasowan; i++) {
            int miejscaPierwsze = random.nextInt(talia.size());
            Karta kartaZJakiegosRandomowegoMiejsca = talia.get(miejscaPierwsze);
            talia.remove(miejscaPierwsze);
            int miejsceDrugie = random.nextInt(talia.size());
            Karta kartaZJakiegosDrugiegoRandomowegoMiejsca = talia.get(miejsceDrugie);
            talia.remove(miejsceDrugie);

            talia.add(miejsceDrugie, kartaZJakiegosRandomowegoMiejsca);
            talia.add(miejscaPierwsze, kartaZJakiegosDrugiegoRandomowegoMiejsca);

        }
        return talia;
    }

    @Override
    public boolean rozpocznijGre() {
        boolean koniecGry = false;
        boolean czyKolejkaGracza = true;
        boolean czyKolejkaKomputera = true;
        ArrayList<Karta> taliaGracza = new ArrayList<>();
        ArrayList<Karta> taliaKomputera = new ArrayList<>();
        while (!koniecGry) {
            if (czyKolejkaGracza) {
                System.out.println("Zaczyna gracz!");
                if (taliaGracza.size() > 0) {
                    if (czyTaliaMa2Asy(taliaGracza)) {
                        System.out.println("Wygrana!");
                        break;
                    } else if (podajWartoscTali(taliaGracza) == 21) {
                        System.out.println("Wygrana!");
                        break;
                    } else if (podajWartoscTali(taliaGracza) > 21) {
                        System.out.println("Przegrana!");
                        break;
                    } else {
                        System.out.println("Gracz jeszcze nie skonczyl gry.");
                        taliaGracza.add(talia.get(0));
                        talia.remove(0);
                    }
                    for (Karta kartaGracza : taliaGracza) {
                        System.out.println("W tali gracza jest: " + kartaGracza.pobierzNazweKarty());
                    }
                    System.out.println("Zaczyna komputer!");
                } else {
                    taliaGracza.add(talia.get(0));
                    talia.remove(0);
                }
                czyKolejkaGracza = !czyKolejkaGracza;
            } else {
                // ToDO kolejka komputera
                if (czyKolejkaKomputera) {
                    System.out.println("Zaczyna Komputer!");
                    if (taliaKomputera.size() > 0) {
                        if (czyTaliaMa2Asy(taliaKomputera)) {
                            System.out.println("Wygrana komputera!");
                            break;
                        } else if (podajWartoscTali(taliaKomputera) == 21) {
                            System.out.println("Wygrana komputera!");
                            break;
                        } else if (podajWartoscTali(taliaKomputera) > 21) {
                            System.out.println("Przegrana komputera!");
                            break;
                        } else {
                            System.out.println("Komputer jeszcze nie skonczyl gry.");
                            taliaKomputera.add(talia.get(0));
                         talia.remove(0);

                for (Karta kartaKomputera : taliaKomputera) {
                    System.out.println("W tali komputera jest: " + taliaKomputera);

                }
                czyKolejkaGracza = !czyKolejkaGracza;
            }
        }
        return false;
    }


    private boolean czyTaliaMa2Asy(ArrayList<Karta> talia) {
        Integer licznik = 0;
        for (Karta karta : talia) {
            if (karta.pobierzNazweKarty().contains("AS")) {
                licznik++;
            }
        }
        if (licznik >= 2) {
            return true;
        } else {
            return false;
        }
    }


    public Integer podajWartoscTali(ArrayList<Karta> talia) {
        Integer suma = 0;
        for (Karta karta : talia) {
            suma = suma + karta.pobierzWartoscKarty();
        }
        return suma;
    }


    @Override
    public WynikGry pobierzWynik() {
        return null;
    }

    @Override
    public void zakonczGre() {
        System.out.println("Dzięki za grę!");
    }

    @Override
    public String podajNazwe() {
        return "Black Jack";
    }
}

 */
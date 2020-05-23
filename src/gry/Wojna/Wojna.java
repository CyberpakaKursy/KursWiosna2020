package gry.Wojna;

import gry.Gra;
import gry.Karta;
import rankingi.Gracz;
import rankingi.WynikGry;

import java.util.*;

public class Wojna implements Gra {
    private Gracz gracz;
    private String nazwaGry = "Wojna";
    private int wynik;
    private Integer wartosc;
    private String nazwa;
    private ArrayList<Karta> taliaGracza;
    private ArrayList<Karta> taliaKomputera;
    private ArrayList<Karta> taliaKartPodczasWojny;
    String wygrany;

    ArrayList<Karta> listaKart = new ArrayList<>();

    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        gracz = nowyGracz;
        System.out.println("Witaj w grze w wojne" + nowyGracz);
        /*2*/
        listaKart.add(new Karta("2Pik", 2));
        listaKart.add(new Karta("2Trefl", 2));
        listaKart.add(new Karta("2Karo", 2));
        listaKart.add(new Karta("2Kier", 2));
        /*3*/
        listaKart.add(new Karta("3Pik", 3));
        listaKart.add(new Karta("3Trefl", 3));
        listaKart.add(new Karta("3Karo", 3));
        listaKart.add(new Karta("3Kier", 3));
        /*4*/
        listaKart.add(new Karta("4Pik", 4));
        listaKart.add(new Karta("4Trefl", 4));
        listaKart.add(new Karta("4Karo", 4));
        listaKart.add(new Karta("4Kier", 4));
        /*5*/
        listaKart.add(new Karta("5Pik", 5));
        listaKart.add(new Karta("5Trefl", 5));
        listaKart.add(new Karta("5Karo", 5));
        listaKart.add(new Karta("5Kier", 5));
        /*6*/
        listaKart.add(new Karta("6Pik", 6));
        listaKart.add(new Karta("6Trefl", 6));
        listaKart.add(new Karta("6Karo", 6));
        listaKart.add(new Karta("6Kier", 6));
        /*7*/
        listaKart.add(new Karta("7Pik", 7));
        listaKart.add(new Karta("7Trefl", 7));
        listaKart.add(new Karta("7Karo", 7));
        listaKart.add(new Karta("7Kier", 7));
        /*8*/
        listaKart.add(new Karta("8Pik", 8));
        listaKart.add(new Karta("8Trefl", 8));
        listaKart.add(new Karta("8Karo", 8));
        listaKart.add(new Karta("8Kier", 8));
        /*9*/
        listaKart.add(new Karta("9Pik", 9));
        listaKart.add(new Karta("9Trefl", 9));
        listaKart.add(new Karta("9Karo", 9));
        listaKart.add(new Karta("9Kier", 9));
        /*10*/
        listaKart.add(new Karta("10Pik", 10));
        listaKart.add(new Karta("10Trefl", 10));
        listaKart.add(new Karta("10Karo", 10));
        listaKart.add(new Karta("10Kier", 10));
        /*jupek*/
        listaKart.add(new Karta("JupekPik", 11));
        listaKart.add(new Karta("JupekTrefl", 11));
        listaKart.add(new Karta("JupekKaro", 11));
        listaKart.add(new Karta("JupekKier", 11));
        /*dama*/
        listaKart.add(new Karta("DamaPik", 12));
        listaKart.add(new Karta("DamaTrefl", 12));
        listaKart.add(new Karta("DamaKaro", 12));
        listaKart.add(new Karta("DamaKier", 12));
        /*krol*/
        listaKart.add(new Karta("KrolPik", 13));
        listaKart.add(new Karta("KrolTrefl", 13));
        listaKart.add(new Karta("KrolKaro", 13));
        listaKart.add(new Karta("KrolKier", 13));
        /*AS*/
        listaKart.add(new Karta("ASPik", 14));
        listaKart.add(new Karta("ASTrefl", 14));
        listaKart.add(new Karta("ASKaro", 14));
        listaKart.add(new Karta("ASKier", 14));
        /*Jocker*/
        listaKart.add(new Karta("JockerCzerwony", 15));
        listaKart.add(new Karta("JockerCzarny", 15));

    }

    @Override
    public void ustawPoczatkoweWartosci() {
        wynik = 0;
        ArrayList<Karta> talia = new ArrayList<>();
        talia = tasowanie(listaKart);
        rozdzilenieKart(talia);

    }

    private void rozdzilenieKart(ArrayList<Karta> talia) {
        taliaGracza = new ArrayList<>();
        taliaKomputera = new ArrayList<>();
        boolean czyDoKomputera = true;
        for (Karta karta : talia) {
            if (czyDoKomputera) {
                taliaKomputera.add(karta);
            } else {
                taliaGracza.add(karta);
            }
            czyDoKomputera = !czyDoKomputera;
        }
    }

    @Override
    public void rozpocznijGre() {

        while (taliaGracza.size() > 0 && taliaKomputera.size() > 0) {
            /*wyświetleniePierwszejKartyGracza*/
            Karta kartaGracza = taliaGracza.get(0);
            taliaGracza.remove(0);
            System.out.println("Twoja Karta to : " + kartaGracza.pobierzNazweKarty());

            /*wyświetleniePierwszejKartyKomputera*/
            Karta kartaKomputera = taliaKomputera.get(0);
            taliaKomputera.remove(0);
            System.out.println("  Karta Komputera to: " + kartaKomputera.pobierzNazweKarty());
            if (kartaGracza.pobierzWartoscKarty() > kartaKomputera.pobierzWartoscKarty()) {
                taliaKomputera.remove(kartaKomputera);
                taliaGracza.add(kartaKomputera);
                System.out.println("W tej turze lepszą kartę miałeś ty");
            } else if (kartaGracza.pobierzWartoscKarty() < kartaKomputera.pobierzWartoscKarty()) {
                taliaGracza.remove(kartaGracza);
                taliaKomputera.add(kartaGracza);
                System.out.println("W tej turze lepszą kartę miał komputer");
            } else {
                /*wojna*/
                System.out.println("W tej turze mieliście równe karty");
                System.out.println("teraz rospoczyna się wojna");

                ArrayList<Karta> kartyPodczasWojny = new ArrayList<>();
                kartyPodczasWojny.add(kartaGracza);
                kartyPodczasWojny.add(kartaKomputera);

                taliaGracza.remove(kartaGracza);
                taliaKomputera.remove(kartaKomputera);

                /*losowanie karty1*/
                Karta kartaGraczaPodczasWojny = taliaGracza.get(0);
                taliaGracza.remove(0);
                System.out.println("Twoja Karta to : " + kartaGracza.pobierzNazweKarty());

                Karta kartaKomputeraPodczasWojny = taliaKomputera.get(0);
                taliaKomputera.remove(0);
                System.out.println("  Karta Komputera to: " + kartaKomputera.pobierzNazweKarty());

                kartyPodczasWojny.add(kartaGraczaPodczasWojny);
                kartyPodczasWojny.add(kartaKomputeraPodczasWojny);
                taliaGracza.remove(kartaGraczaPodczasWojny);
                taliaKomputera.remove(kartaKomputeraPodczasWojny);

                /*losowanie karty2 finalne*/
                Karta karta2GraczaPodczasWojny = taliaGracza.get(0);
                taliaGracza.remove(0);
                System.out.println("Twoja Karta to : " + kartaGracza.pobierzNazweKarty());

                Karta karta2KomputeraPodczasWojny = taliaKomputera.get(0);
                taliaKomputera.remove(0);
                System.out.println("  Karta Komputera to: " + kartaKomputera.pobierzNazweKarty());

                kartyPodczasWojny.add(karta2GraczaPodczasWojny);
                kartyPodczasWojny.add(karta2KomputeraPodczasWojny);
                taliaGracza.remove(karta2GraczaPodczasWojny);
                taliaKomputera.remove(karta2KomputeraPodczasWojny);

                if (kartaGracza.pobierzWartoscKarty() > kartaKomputera.pobierzWartoscKarty()) {
                    for (Karta karta: kartyPodczasWojny) {
                        taliaGracza.add(karta);
                    }

                    System.out.println("W wojnie wygrałeś ty");
                }
                if (kartaGracza.pobierzWartoscKarty() < kartaKomputera.pobierzWartoscKarty()) {
                    for (Karta karta: kartyPodczasWojny) {
                        taliaKomputera.add(karta);
                    }
                    System.out.println("W wojnie wygrał komputer");
                }
            }

        }
    }

    @Override
    public WynikGry pobierzWynik() {
        return null;
    }

    @Override
    public void zakonczGre() {

        if (taliaGracza.size() == 0) {
            wygrany = "Komputer";
        } else {
            wygrany = "TY";
        }
        System.out.println("Dziękujemy za udział w grze Wojna. Wygrał/eś/aś" + wygrany);
    }

    @Override
    public String podajNazwe() {
        return nazwaGry;
    }

    private ArrayList tasowanie(ArrayList<Karta> talia) {
        Random random = new Random();
        int iloscPrzetasowan = 40 + random.nextInt(30);
        for (int i = 0; i < iloscPrzetasowan; i++)
        {
            int miejscaPierwsze = random.nextInt(talia.size());
            Karta kartaZJakiegosRandomowegoMiejsca = talia.get(miejscaPierwsze);
            int miejsceDrugie = random.nextInt(talia.size());
            Karta kartaZJakiegosDrugiegoRandomowegoMiejsca = talia.get(miejsceDrugie);

            talia.remove(miejscaPierwsze);
            talia.add(miejsceDrugie, kartaZJakiegosRandomowegoMiejsca);
            talia.remove(miejsceDrugie);
            talia.add(miejscaPierwsze, kartaZJakiegosDrugiegoRandomowegoMiejsca);

        }
        return talia;
    }
}

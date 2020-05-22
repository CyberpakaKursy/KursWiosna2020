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
        HashSet<Karta> listaKart = new HashSet<>();
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
        listaKart.add(new Karta("JupekPik", 2));
        listaKart.add(new Karta("JupekTrefl", 2));
        listaKart.add(new Karta("JupekKaro", 2));
        listaKart.add(new Karta("JupekKier", 2));
        /*dama*/
        listaKart.add(new Karta("DamaPik", 3));
        listaKart.add(new Karta("DamaTrefl", 3));
        listaKart.add(new Karta("DamaKaro", 3));
        listaKart.add(new Karta("DamaKier", 3));
        /*krol*/
        listaKart.add(new Karta("KrolPik", 4));
        listaKart.add(new Karta("KrolTrefl", 4));
        listaKart.add(new Karta("KrolKaro", 4));
        listaKart.add(new Karta("KrolKier", 4));
        /*AS*/
        listaKart.add(new Karta("ASPik", 11));
        listaKart.add(new Karta("ASTrefl", 11));
        listaKart.add(new Karta("ASKaro", 11));
        listaKart.add(new Karta("ASKier", 11));

        ArrayList<Karta> talia = new ArrayList<>();
        Random random = new Random();
        int iloscPrzetasowan = 30 + random.nextInt(30);

        for (int i = 0; i < iloscPrzetasowan; i++) ;
        {
            int miejscePierwsze = random.nextInt(talia.size());
            Karta kartaZJakiegoMiejsca = talia.get(miejscePierwsze);
            int miejsceDrugie = random.nextInt(talia.size());
            Karta kartaZJakiegoDrugiegoMiejsca = talia.get((miejsceDrugie));

            talia.remove(miejscePierwsze);
            talia.remove(miejsceDrugie - 1);

            talia.add(miejsceDrugie, kartaZJakiegoMiejsca);
            talia.add(miejscePierwsze, kartaZJakiegoDrugiegoMiejsca);

        }

    }

    @Override
    public boolean rozpocznijGre() {
        boolean koniecGry = false;
        boolean czyKolejkaGracza = true;
        ArrayList<Karta> taliaGracza = new ArrayList<>();
        ArrayList<Karta> taliaKomputera = new ArrayList<>();
        while (koniecGry) {
            if (czyKolejkaGracza) {
                taliaGracza.size();
                if (taliaGracza.size() > 0) {
                    podajWartoscTali(taliaGracza);
                    if (podajWartoscTali(taliaGracza) > 21) {
                        System.out.println("Przegrana");
                    } else if (podajWartoscTali(taliaGracza) == 21) {
                        System.out.println("Wygrana!");
                    } else if (czyKolejkaGracza){
                        if (Karta.pobierzNazweKarty().contains("ASPik")){
                            return true;
                        }else if{
                            if (Karta.pobierzNazweKarty().contains("ASTrefl")){
                                return  true;
                            }

                            }
                        }

                    }

                    }
                System.out.println("Zaczyna gracz!");
            } else {
                System.out.println("Zaczyna komputer!");

            }

        }
    }



    public Integer podajWartoscTali(ArrayList<Karta> talia){
        Integer suma = 0;
        for (Karta karta:talia){
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

    }

    @Override
    public String podajNazwe() {
        return null;
    }
}

package gry.makao;

import gry.Gra;
import gry.Karta;
import rankingi.Gracz;
import rankingi.WynikGry;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;


public class Makao implements Gra {
    private ArrayList<Karta> taliaKart = new ArrayList<>();
    private ArrayList<Karta> taliaGracza = new ArrayList<>();
    private ArrayList<Karta> taliaKomputera = new ArrayList<>();
    private ArrayList<Karta> kartyNaStole = new ArrayList<>();

    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        System.out.println("Cześć " + nowyGracz.pobierzNick() + ", witaj w grze " + "Makao");
    }

    @Override
    public void ustawPoczatkoweWartosci() {
        taliaKart.add(new Karta("2_pik ", 2));
        taliaKart.add(new Karta("2_kier ", 2));
        taliaKart.add(new Karta("2_trefl ", 2));
        taliaKart.add(new Karta("2_karo ", 2));
        //3//
        taliaKart.add(new Karta("3_pik ", 3));
        taliaKart.add(new Karta("3_kier ", 3));
        taliaKart.add(new Karta("3_trefl ", 3));
        taliaKart.add(new Karta("3_karo ", 3));
        //4//
        taliaKart.add(new Karta("4_pik ", 4));
        taliaKart.add(new Karta("4_kier ", 4));
        taliaKart.add(new Karta("4_trefl ", 4));
        taliaKart.add(new Karta("4_karo ", 4));
        //5//
        taliaKart.add(new Karta("5_pik ", 5));
        taliaKart.add(new Karta("5_kier ", 5));
        taliaKart.add(new Karta("5_tefl ", 5));
        taliaKart.add(new Karta("5_karo ", 5));
        //6//
        taliaKart.add(new Karta("6_pik ", 6));
        taliaKart.add(new Karta("6_kier ", 6));
        taliaKart.add(new Karta("6_trefl ", 6));
        taliaKart.add(new Karta("6_karo ", 6));
        //7//
        taliaKart.add(new Karta("7_pik ", 7));
        taliaKart.add(new Karta("7_kier ", 7));
        taliaKart.add(new Karta("7_trefl ", 7));
        taliaKart.add(new Karta("7_karo ", 7));
        //8//
        taliaKart.add(new Karta("8_pik ", 8));
        taliaKart.add(new Karta("8_kier ", 8));
        taliaKart.add(new Karta("8_trefl ", 8));
        taliaKart.add(new Karta("8_karo ", 8));
        //9//
        taliaKart.add(new Karta("9_pik ", 9));
        taliaKart.add(new Karta("9_kier ", 9));
        taliaKart.add(new Karta("9_trefl ", 9));
        taliaKart.add(new Karta("9_karo ", 9));
        //10//
        taliaKart.add(new Karta("10_pik ", 10));
        taliaKart.add(new Karta("10_kier ", 10));
        taliaKart.add(new Karta("10_trefl ", 10));
        taliaKart.add(new Karta("10_karo ", 10));
        //w//
        taliaKart.add(new Karta("Walet_pik ", 11));
        taliaKart.add(new Karta("Walet_kier ", 11));
        taliaKart.add(new Karta("Walet_trefl ", 11));
        taliaKart.add(new Karta("Walet_karo ", 11));
        //d//
        taliaKart.add(new Karta("Dama_pik ", 12));
        taliaKart.add(new Karta("Dama_kier ", 12));
        taliaKart.add(new Karta("Dama_trefl ", 12));
        taliaKart.add(new Karta("Dama_karo ", 12));
        //k//
        taliaKart.add(new Karta("Król_pik ", 13));
        taliaKart.add(new Karta("Król_kier ", 13));
        taliaKart.add(new Karta("Król_trefl ", 13));
        taliaKart.add(new Karta("Król_karo ", 13));
        //a//
        taliaKart.add(new Karta("As_pik ", 14));
        taliaKart.add(new Karta("As_kier ", 14));
        taliaKart.add(new Karta("As_trefl ", 14));
        taliaKart.add(new Karta("As_karo ", 14));
        taliaKart = tasowanie(taliaKart);
        rozdzielenieKart();

    }

    private void rozdzielenieKart() {

        boolean czyDoKomputera = true;
        for (int i = 0; i < 10; i++) {
            if (czyDoKomputera) {
                taliaKomputera.add(taliaKart.get(i));
            } else {
                taliaGracza.add(taliaKart.get(i));
            }
            czyDoKomputera = !czyDoKomputera;
            taliaKart.remove(i);
        }
        System.out.println(taliaGracza);

    }

    public boolean czyGraczMaPasujacaKarte(Karta kartaPodana, boolean czyTuraGracza) {
        String[] daneKarty = kartaPodana.pobierzNazweKarty().split("_");
        if (czyTuraGracza) {
            for (Karta karta : taliaGracza) {
                if (karta.pobierzWartoscKarty() == kartaPodana.pobierzWartoscKarty()) {
                    return true;
                } else if (karta.pobierzNazweKarty().contains(daneKarty[1])) {
                    return true;
                }

            }
            return false;
        } else {
            for (Karta karta : taliaKomputera) {
                if (karta.pobierzWartoscKarty() == kartaPodana.pobierzWartoscKarty()) {
                    return true;
                } else if (karta.pobierzNazweKarty().contains(daneKarty[1])) {
                    return true;
                }
                return false;
            }

        }
        return false;
    }

    public boolean czyKomputerMaPasujacaKarte(Karta kartaPodana, boolean czyTuraGracza) {
        String[] daneKarty = kartaPodana.pobierzNazweKarty().split("_");
        if (!czyTuraGracza) {
            for (Karta karta : taliaKomputera) {
                if (karta.pobierzWartoscKarty() == kartaPodana.pobierzWartoscKarty()) {
                    return true;
                } else if (karta.pobierzNazweKarty().contains(daneKarty[1])) {
                    return true;
                }
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean rozpocznijGre() {
        Random random = new Random();
        Scanner skanerKart = new Scanner(System.in);
        //tworzenie karty na stole//
        Karta kartaPierwsza = taliaKart.get(random.nextInt(taliaKart.size()));
        KartyFunkcyjne.czyFunkcyjna(kartaPierwsza);
        while (KartyFunkcyjne.czyFunkcyjna(kartaPierwsza)) {
            kartaPierwsza = taliaKart.get(random.nextInt(taliaKart.size()));
        }
        System.out.println(kartaPierwsza.pobierzNazweKarty);
        taliaKart.remove(kartaPierwsza);
        kartyNaStole.add(kartaPierwsza);
        boolean czyTuraGracza = true;
        while (true) {
            if (czyTuraGracza) {
                while (true) {
                    if (czyGraczMaPasujacaKarte(kartaPierwsza, czyTuraGracza)) {
                        for (Karta karta : taliaGracza) {
                            System.out.println(karta.pobierzNazweKarty());
                        }
                        int nmrRzuconaKarta = skanerKart.nextInt();
                        Karta rzuconaKarta = taliaGracza.get(nmrRzuconaKarta);

                        if (kartaPierwsza.pobierzWartoscKarty() == nmrRzuconaKarta || kartaPierwsza.pobierzNazweKarty().equals(nmrRzuconaKarta)) {
                            taliaGracza.remove(rzuconaKarta);
                            kartyNaStole.add(rzuconaKarta);
                            System.out.println(rzuconaKarta.pobierzNazweKarty);
                            if (KartyFunkcyjne.czyFunkcyjna(rzuconaKarta)) {
                                if (KartyFunkcyjne.czyPobracKarte(rzuconaKarta)) {
                                    if (rzuconaKarta.pobierzNazweKarty().contains("2")) {
                                        int i = 2;
                                        taliaKomputera.add(taliaKart.get(i));
                                        taliaKart.remove(i);
                                    } else if (rzuconaKarta.pobierzNazweKarty().contains("3")) {
                                        int i = 3;
                                        taliaKomputera.add(taliaKart.get(i));
                                        taliaKart.remove(i);
                                    } else if (rzuconaKarta.pobierzNazweKarty().contains("Król_kier")) {
                                        int i = 5;
                                        taliaKomputera.add(taliaKart.get(i));
                                        taliaKart.remove(i);
                                    } else if (rzuconaKarta.pobierzNazweKarty().contains("Król_pik")) {
                                        int i = 5;
                                        taliaKomputera.add(taliaKart.get(i));
                                        taliaKart.remove(i);
                                    } else {
                                        return false;
                                    }
                                } else if (KartyFunkcyjne.czyPominacKolejke(rzuconaKarta)) {
                                    czyTuraGracza=true;
                                }
                            } else {
                                return false;
                            }

                        } else {
                            System.out.println("Podales/as zla karte.");
                        }
                    } else {
                        System.out.println("Nie masz karty, zeby wykonac ruch");
                        taliaGracza.add(taliaKart.get(0));
                        taliaKart.remove(0);
                    }
                    break;

                }
            } else {
                Random randomKomputera = new Random();
                if (!czyTuraGracza) {
                    while (true) {
                        if (czyKomputerMaPasujacaKarte(kartaPierwsza, !czyTuraGracza)) {
                            for (Karta karta : taliaKomputera) {
                            }
                            int nmrRzuconaKarta = random.nextInt(taliaKomputera.size());
                            Karta rzuconaKarta = taliaKomputera.get(nmrRzuconaKarta);

                            if (kartaPierwsza.pobierzWartoscKarty() == nmrRzuconaKarta || kartaPierwsza.pobierzNazweKarty().equals(nmrRzuconaKarta)) {
                                taliaKomputera.remove(rzuconaKarta);
                                kartyNaStole.add(rzuconaKarta);
                                System.out.println(kartyNaStole);
                                if (KartyFunkcyjne.czyFunkcyjna(rzuconaKarta)) {
                                    if (KartyFunkcyjne.czyPobracKarte(rzuconaKarta)) {
                                        if (rzuconaKarta.pobierzNazweKarty().contains("2")) {
                                            int i = 2;
                                            taliaGracza.add(taliaKart.get(i));
                                            taliaKart.remove(i);
                                        } else if (rzuconaKarta.pobierzNazweKarty().contains("3")) {
                                            int i = 3;
                                            taliaGracza.add(taliaKart.get(i));
                                            taliaKart.remove(i);
                                        } else if (rzuconaKarta.pobierzNazweKarty().contains("Król_kier")) {
                                            int i = 5;
                                            taliaGracza.add(taliaKart.get(i));
                                            taliaKart.remove(i);
                                        } else if (rzuconaKarta.pobierzNazweKarty().contains("Król_pik")) {
                                            int i = 5;
                                            taliaGracza.add(taliaKart.get(i));
                                            taliaKart.remove(i);
                                        } else {
                                            return false;
                                        }
                                    } else if (KartyFunkcyjne.czyPominacKolejke(rzuconaKarta)) {
                                        czyTuraGracza=false;
                                    }
                                } else {
                                    return false;
                                }
                            }
                        } else {
                            System.out.println("Komputer nie ma karty dla ruchu");
                            taliaKomputera.add(taliaKart.get(0));
                            taliaKart.remove(0);
                        }
                        break;
                    }
                }
            }
            if (taliaGracza.size() <= 0 || taliaKomputera.size() <= 0) {
                break;
            }
            if (taliaKart.size() == 0) {
                taliaKart.add(kartyNaStole.remove(kartyNaStole.size()));
                taliaKart = tasowanie(taliaKart);
            }
        }
        czyTuraGracza = !czyTuraGracza;

        return false;
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
        return "Makao";
    }


    private ArrayList tasowanie(ArrayList<Karta> talia) {
        Random random = new Random();
        int iloscPrzetasowan = 40 + random.nextInt(30);
        for (int i = 0; i < iloscPrzetasowan; i++) {
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


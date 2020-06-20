package gry.Remik;

import gry.Gra;
import gry.Karta;
import rankingi.Gracz;
import rankingi.WynikGry;

import java.util.*;

public class Remik implements Gra {
    private Gracz graczRemika;
    private ArrayList<Karta> taliaKart = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Integer iloscGraczy;
    Integer punktyMaksymalne;
    Random random = new Random();
    
    private ArrayList<Karta> taliaGracza = new ArrayList<>();
    private ArrayList<Karta> taliaKomputera1 = new ArrayList<>();
    private ArrayList<Karta> taliaKomputera2 = new ArrayList<>();
    private ArrayList<Karta> taliaKomputera3 = new ArrayList<>();
    private ArrayList<Karta> kartyNaStole = new ArrayList<>();

    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        System.out.println("Witam w Remiku!");
        graczRemika = nowyGracz;
    }

    @Override
    public void ustawPoczatkoweWartosci() {

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
        //j//
        taliaKart.add(new Karta("Joker_1", 0));
        taliaKart.add(new Karta("Joker_2", 0));
        taliaKart = tasowanie(taliaKart);

        while (true) {
            System.out.println("Ile graczy? (2-4)");
            iloscGraczy = scanner.nextInt();
            if (iloscGraczy <= 4 && iloscGraczy >= 2) {
                break;
            }
        }
        System.out.println("Ile punktów maksymalnych?");
        punktyMaksymalne = scanner.nextInt();
    }

    @Override
    public boolean rozpocznijGre() {
        if (iloscGraczy ==2) {
            Integer kolej = random.nextInt(1);
            int i;
            for (i = 0; i < 26; i++) {
                if (i % 2 == 0) {
                    taliaKomputera1.add(taliaKart.get(i));
                } else {
                    taliaGracza.add(taliaKart.get(i));
                }
            }
            while (true) {
                while (kolej == 0) {
                    if (sprawdzSeta(taliaGracza)) {
                        for (Karta karta:taliaGracza) {
                            System.out.println("Karta gracza "+karta.pobierzNazweKarty());
                        }
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        for (Karta karta:taliaGracza) {
                            System.out.println("Karta gracza "+karta.pobierzNazweKarty());
                        }
                        i++;
                        taliaGracza.add(taliaKart.get(i));
                        kolej++;
                    }
                }
                while (kolej == 1) {
                    if (sprawdzSeta(taliaKomputera1)) {
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        i++;
                        taliaKomputera1.add(taliaKart.get(i));
                        kolej--;
                    }
                }
            }
        }
        else if (iloscGraczy == 3){
            Integer kolej = random.nextInt(2);
            int j=0;
            int i;
            for (i = 0; i < 39; i++) {
                if (j==0) {
                    taliaGracza.add(taliaKart.get(i));
                    j++;
                } else if (j==1){
                    taliaKomputera1.add(taliaKart.get(i));
                    j++;
                } else if (j==2){
                    taliaKomputera2.add(taliaKart.get(i));
                    j=0;
                }
            }
            while (true) {
                while (kolej == 0) {
                    if (sprawdzSeta(taliaGracza)) {
                        for (Karta karta:taliaGracza) {
                            System.out.println("Karta gracza "+karta.pobierzNazweKarty());
                        }
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        for (Karta karta:taliaGracza) {
                            System.out.println("Karta gracza "+karta.pobierzNazweKarty());
                        }
                        i++;
                        taliaGracza.add(taliaKart.get(i));
                        kolej++;
                    }
                }
                while (kolej == 1) {
                    if (sprawdzSeta(taliaKomputera1)) {
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        i++;
                        taliaKomputera1.add(taliaKart.get(i));
                        kolej++;
                    }
                }
                while (kolej == 2) {
                    if (sprawdzSeta(taliaKomputera2)) {
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        i++;
                        taliaKomputera2.add(taliaKart.get(i));
                        kolej = kolej - 2;
                    }
                }
            }
        }
        else {
            Integer kolej = random.nextInt(3);
            int i=0;
            int j=0;
            for (i = 0; i < 52; i++) {
                if (j == 0) {
                    taliaGracza.add(taliaKart.get(i));
                    j++;
                } else if (j == 1){
                    taliaKomputera1.add(taliaKart.get(i));
                    j++;
                } else if (j == 2){
                    taliaKomputera2.add(taliaKart.get(i));
                    j++;
                } else if (j == 3){
                    taliaKomputera3.add(taliaKart.get(i));
                    j=0;
                }
            }
            while (true) {
                while (kolej == 0) {
                    if (sprawdzSeta(taliaGracza)) {
                        for (Karta karta:taliaGracza) {
                            System.out.println("Karta gracza "+karta.pobierzNazweKarty());
                        }
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        for (Karta karta:taliaGracza) {
                            System.out.println("Karta gracza "+karta.pobierzNazweKarty());
                        }
                        i++;
                        taliaGracza.add(taliaKart.get(i));
                        kolej++;
                    }
                }
                while (kolej == 1) {
                    if (sprawdzSeta(taliaKomputera1)) {
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        i++;
                        taliaKomputera1.add(taliaKart.get(i));
                        kolej++;
                    }
                }
                while (kolej == 2) {
                    if (sprawdzSeta(taliaKomputera2)) {
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        i++;
                        taliaKomputera2.add(taliaKart.get(i));
                        kolej++;
                    }
                }
                while (kolej == 3) {
                    if (sprawdzSeta(taliaKomputera3)) {
                        //jeśli ma seta podaj opcję
                        //zabierz karty ze seta i dodaj do talii kart
                    } else {
                        i++;
                        taliaKomputera2.add(taliaKart.get(i));
                        kolej = kolej - 3;
                    }
                }

                //fixme psulo program
                break;
            }
        }
        return false;
    }
    private boolean sprawdzSeta(ArrayList<Karta> talia){
        HashMap<Integer, Integer> mapaKart = new HashMap<>();
        for (Karta element:talia) {
            if (mapaKart.containsKey(element.pobierzWartoscKarty())){
                mapaKart.put(element.pobierzWartoscKarty(), mapaKart.get(element.pobierzWartoscKarty())+1);
            }else {
                mapaKart.put(element.pobierzWartoscKarty(), 1);
            }
        }

        if (mapaKart.containsValue(3)){
            return true;
        }

        ArrayList<Integer> posortowaneWartosci = new ArrayList<>(mapaKart.keySet());
        Collections.sort(posortowaneWartosci);
        Integer poprzedniElement=0;
        Integer licznik=0;
        for (Integer element:posortowaneWartosci) {
            if (element==poprzedniElement+1){
                licznik+=1;
            }else {
                licznik=0;
            }
            if (licznik>=3){
                return true;
            }
        }
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
        return null;
    }

    private ArrayList<Karta> tasowanie(ArrayList<Karta> taliaKart) {
        Random random = new Random();
        int iloscPrzetasowan = 30 + random.nextInt(30);
        for (int i = 0; i < iloscPrzetasowan; i++) {
            int miejscePierwsze = random.nextInt(taliaKart.size());
            Karta kartaZJakiegoMiejsca = taliaKart.get(miejscePierwsze);
            int miejsceDrugie = random.nextInt(taliaKart.size());
            Karta kartaZJakiegosDrugiegoMiejsca = taliaKart.get(miejsceDrugie);

            taliaKart.remove(miejscePierwsze);
            taliaKart.remove(miejsceDrugie - 1);

            taliaKart.add(miejsceDrugie, kartaZJakiegoMiejsca);
            taliaKart.add(miejscePierwsze, kartaZJakiegosDrugiegoMiejsca);
        }
        return taliaKart;
    }
    

}

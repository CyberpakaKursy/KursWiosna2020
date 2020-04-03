package gry;

import rankingi.Gracz;
import rankingi.WynikGry;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class KolkoIKrzyzyk implements Gra {

    private Gracz gracz;
    private String nazwaGry = "Kółko i Krzyżyk";
    private Character[][] plansza = new Character[3][3];
    private WynikGry wynik;

    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        gracz = nowyGracz;
        System.out.println("Cześć " + nowyGracz.pobierzNick() + ", witaj w grze " + nazwaGry);
    }

    @Override
    public void ustawPoczatkoweWartosci() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                plansza[i][j] = ' ';
            }
        }
    }

    @Override
    public void rozpocznijGre() {
        Scanner skaner = new Scanner(System.in);
        Random generatorLosowosci = new Random();

        boolean czyKolejGracza = generatorLosowosci.nextBoolean();
        System.out.println("Wybierz swój znak - X albo O:");
        Character znakGracza = skaner.next().charAt(0);
        Character znakPrzeciwnika;
        if (znakGracza == 'X') {
            znakPrzeciwnika = 'O';
        } else {
            znakPrzeciwnika = 'X';
        }

        if (czyKolejGracza) {
            System.out.println("Zaczyna gracz!");
        } else {
            System.out.println("Zaczyna komputer!");
        }

        while (!wygrana() && !zapelnionaMapa()) {
            System.out.println();
            System.out.println("========================================================");
            System.out.println();
            wyswietlPlansze();
            if (czyKolejGracza) {
                while (true) {
                    System.out.println("Podaj w ktorym wierszu chcesz wstawic znak:");
                    int x = skaner.nextInt() - 1;
                    System.out.println("Podaj w ktorej kolumnie chcesz wstawic znak:");
                    int y = skaner.nextInt() - 1;
                    if (plansza[x][y] == ' ') {
                        plansza[x][y] = znakGracza;
                        break;
                    } else {
                        System.out.println("Niestety to miejsce jest niedostępne - wypróbuj inne.");
                    }
                }
                czyKolejGracza = false;
            } else {
                while (true) {
                    int x = generatorLosowosci.nextInt(3);
                    int y = generatorLosowosci.nextInt(3);
                    if (plansza[x][y] == ' ') {
                        plansza[x][y] = znakPrzeciwnika;
                        czyKolejGracza = true;
                        break;
                    }
                }
            }
        }

        if (wygrana()) {
            System.out.println("Wygrał " + (czyKolejGracza ? "komputer!" : gracz.pobierzNick() + "!"));
        } else {
            System.out.println("Skończyło się miejsce na planszy - remis!");
        }

        wynik = new WynikGry(this, gracz, czyKolejGracza ? 0 : 1);
    }

    private boolean wygrana() {
        //pionowo
        for (int i = 0; i < 3; i++) {
            if (plansza[i][0] != ' ' && plansza[i][0] == plansza[i][1] && plansza[i][1] == plansza[i][2]) {
                return true;
            }
        }
        //poziomo
        for (int i = 0; i < 3; i++) {
            if (plansza[0][i] != ' ' && plansza[0][i] == plansza[1][i] && plansza[1][i] == plansza[2][i]) {
                return true;
            }
        }

        //sprawdz ukos /
        if (plansza[0][0] != ' ' && plansza[0][0] == plansza[1][1] && plansza[1][1] == plansza[2][2]) {
            return true;
        }

        //sprawdz ukos /
        if (plansza[0][2] != ' ' && plansza[0][2] == plansza[1][1] && plansza[1][1] == plansza[2][0]) {
            return true;
        }

        return false;
    }

    private boolean zapelnionaMapa() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (plansza[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private void wyswietlPlansze() {
        System.out.println("---------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + plansza[i][j] + " |");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }

    @Override
    public WynikGry pobierzWynik() {
        return wynik;
    }

    @Override
    public void zakonczGre() {
        System.out.println("Dzięki za grę!");
    }

    @Override
    public String podajNazwe() {
        return nazwaGry;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Gra){
            return ((Gra) o).podajNazwe().equals(this.podajNazwe());
        }
        return false;
    }
}

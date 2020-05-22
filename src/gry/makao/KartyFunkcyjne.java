package gry.makao;

import gry.Karta;

public class KartyFunkcyjne {
    public static boolean czyFunkcyjna(Karta karta) {
        if (karta.pobierzNazweKarty().contains("2")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("3")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("4")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("Walet")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("Dama")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("Król_kier")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("Król_pik")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("As")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean czyPominacKolejke(Karta karta) {
        if (karta.pobierzNazweKarty().contains("4")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean czyPolozycZadanaKarte(Karta karta) {
        if (karta.pobierzNazweKarty().contains("Walet")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean czyPobracKarte(Karta karta) {
        if (karta.pobierzNazweKarty().contains("2")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("3")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("Król_kier")) {
            return true;
        } else if (karta.pobierzNazweKarty().contains("Król_pik")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean czyZmianiaKolor(Karta karta) {
        if (karta.pobierzNazweKarty().contains("As")) {
            return true;
        } else {
            return false;
        }
    }


}


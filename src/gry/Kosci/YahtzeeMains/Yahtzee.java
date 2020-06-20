package gry.Kosci.YahtzeeMains;

import gry.Gra;
import rankingi.Gracz;
import rankingi.WynikGry;


public class Yahtzee implements Gra {

    String gameName = "Yahtzee";
    Game game = new Game();

    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        System.out.println("Welcome " + nowyGracz.pobierzNick() + "!");
        System.out.println("Let's play " + podajNazwe() + "!");
    }

    @Override
    public void ustawPoczatkoweWartosci() {
        game.clearLabel();
    }

    @Override
    public boolean rozpocznijGre() {
        game.gameMechanism();
        return false;
    }

    @Override
    public WynikGry pobierzWynik() {
        return null;
    }

    @Override
    public void zakonczGre() {
        game.ending();
    }

    @Override
    public String podajNazwe() {
        return gameName;
    }
}

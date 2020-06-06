package gry.Kosci.YahtzeeMains;

import gry.Gra;
import rankingi.Gracz;
import rankingi.WynikGry;


public class Yahtzee implements Gra {

    static Integer scoreInteger;
    String gameName = "Yahtzee";
    Game game = new Game();
    public  WynikGry score;

    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        System.out.println("Welcome" + nowyGracz.pobierzNick()+"!");
        System.out.println("Let's play "+podajNazwe()+"!");
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
        return score;
    }

    @Override
    public void zakonczGre() {
        scoreInteger = game.ending();
    }

    @Override
    public String podajNazwe() {
        return gameName;
    }
}
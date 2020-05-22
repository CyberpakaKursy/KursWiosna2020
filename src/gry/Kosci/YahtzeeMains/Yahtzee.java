package gry.Kosci.YahtzeeMains;

import gry.Gra;
import rankingi.Gracz;
import rankingi.WynikGry;


public class Yahtzee implements Gra {

    private String gameName = "Yahtzee";
    public static Integer scoreInteger;
    Game game = new Game();;
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
        game.ending();
    }

    @Override
    public String podajNazwe() {
        return gameName;
    }
}

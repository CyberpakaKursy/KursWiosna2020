package gry.Kosci.YahtzeeMains;

import gry.Gra;
import rankingi.Gracz;
import rankingi.WynikGry;


public class Yahtzee implements Gra {

    private String gameName = "Yahtzee";
    public static Integer scoreInteger;
    public  WynikGry score;

    @Override
    public void przywitajGracza(Gracz nowyGracz) {
        System.out.println("Welcome" + nowyGracz.pobierzNick()+"!");
        System.out.println("Let's play "+podajNazwe()+"!");
        ustawPoczatkoweWartosci();
        rozpocznijGre();
        zakonczGre();
    }

    @Override
    public void ustawPoczatkoweWartosci() {
        StartNSetup startNSetup = new StartNSetup();
        startNSetup.clearVariables();
        startNSetup.clearLabel();
    }

    @Override
    public void rozpocznijGre() {
        Game game = new Game();
        game.gameMechanism();
    }

    @Override
    public WynikGry pobierzWynik() {
        return score;
    }

    @Override
    public void zakonczGre() {
        Ending ending = new Ending();
        ending.finalCounting();
        ending.ending();
    }

    @Override
    public String podajNazwe() {
        return gameName;
    }
}

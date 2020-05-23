package gry;

import rankingi.Gracz;
import rankingi.WynikGry;

public interface Gra {
    void przywitajGracza(Gracz nowyGracz);

    void ustawPoczatkoweWartosci();

    boolean rozpocznijGre();

    WynikGry pobierzWynik();

    void zakonczGre();

    String podajNazwe();
}

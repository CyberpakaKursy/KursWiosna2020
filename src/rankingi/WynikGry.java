package rankingi;

import gry.Gra;

public class WynikGry {

    private Gra gra;
    private Gracz gracz;
    private Integer punktyZGry;

    private WynikGry() {
    }

    public WynikGry(Gra gra, Gracz graczZKtorejPochodziWynik, Integer punktyZGry) {
        this.gra = gra;
        this.gracz = graczZKtorejPochodziWynik;
        this.punktyZGry = punktyZGry;
    }

    public Gra pobierzGreTegoWyniku() {
        return this.gra;
    }

    public Gracz pobierzGracza() {
        return this.gracz;
    }

    public Integer pobierzPunktyZGry(){
        return this.punktyZGry;
    }
}

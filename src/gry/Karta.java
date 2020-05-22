package gry;

public class Karta {

    public static boolean pobierzNazweKarty;
    private Integer wartosc;
    private String nazwa;

    private Karta(Karta karta){}

    public Karta(String nazwa, Integer wartosc){
        this.wartosc = wartosc;
        this.nazwa = nazwa;
    }


    public static String pobierzNazweKarty(){
        return nazwa;
    }

    public Integer pobierzWartoscKarty(){
        return wartosc;
    }

}

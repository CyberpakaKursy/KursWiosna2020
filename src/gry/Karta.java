package gry;

public class Karta {

    private Integer wartosc;
    private String nazwa;

    private Karta(Karta karta){}

    public Karta(String nazwa, Integer wartosc){
        this.wartosc = wartosc;
        this.nazwa = nazwa;
    }


    public String pobierzNazweKarty(){
        return nazwa;
    }

    public Integer pobierzWartoscKarty(){
        return wartosc;
    }

}

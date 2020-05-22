package gry.BlackJack;

public class SandBox {
    Integer glosnosc = 100;
    Integer przezroczystosc = 100;
    String tytul;
    public void zmniejszPrzezroczystosc(){
        przezroczystosc = przezroczystosc -1;
    }
    public  void zmnijszGlosnosc(){
        glosnosc = glosnosc -1;
    }
    public Integer zmienPrzezroczystosc(Integer nowaWartosc){
        przezroczystosc = nowaWartosc;
        return przezroczystosc;
    }
    public void lubiePlacki(String wnoszonyString){
        System.out.println(wnoszonyString);
    }
    public Integer lubiePlacki2(){
        return przezroczystosc + glosnosc;
    }
}

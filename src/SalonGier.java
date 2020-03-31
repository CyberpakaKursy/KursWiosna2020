import gry.Gra;
import rankingi.Gracz;
import rankingi.RankingGraczy;
import rankingi.WynikGry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SalonGier {

    public List<Gra> listaGierWSalonie = new ArrayList<>();
    public String nazwaSalonuGier;
    public RankingGraczy ranking;

    private SalonGier(){}

    public SalonGier(String nazwa, Gra... gryDoDodania) {
        this.nazwaSalonuGier = nazwa;
        this.ranking = new RankingGraczy();
        listaGierWSalonie.addAll(Arrays.asList(gryDoDodania));
    }



    public void zagrajWLosoweGre(Gracz gracz){
        Random generatorLiczbLosowych = new Random();
        if(listaGierWSalonie.isEmpty()){
            System.out.println("Niestety, w naszym salonie nie ma obecnie żadnej gry :(");
            return;
        }
        Gra losowaGra = listaGierWSalonie.get(
                generatorLiczbLosowych.nextInt(listaGierWSalonie.size()));

        zagrajWGre(losowaGra, gracz);

    }

    private void zagrajWGre(Gra gra, Gracz gracz) {
        gra.przywitajGracza(gracz);
        gra.ustawPoczatkoweWartosci();
        gra.rozpocznijGre();

        WynikGry wynikTejGry = gra.pobierzWynik();
        ranking.doliczNowyWynik(wynikTejGry);
        gra.zakonczGre();

        ranking.wyswietlTop3(gra);
    }
}

package rankingi;

import gry.Gra;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RankingGraczy {

    private Map<Gra, RankingGry> gryWRankingu = new HashMap<>();

    public void doliczNowyWynik(WynikGry wynikTejGry) {
        Gra graZWyniku = wynikTejGry.pobierzGreTegoWyniku();
        if(gryWRankingu.containsKey(graZWyniku)){
            RankingGry rankingGry = gryWRankingu.get(graZWyniku);
            rankingGry.dodajNowyWynik(wynikTejGry);
        } else {
            gryWRankingu.put(graZWyniku, new RankingGry(wynikTejGry));
        }
    }

    public void wyswietlTop3(Gra gra) {
        if (gryWRankingu.containsKey(gra)){
            RankingGry rankingGry = gryWRankingu.get(gra);
            List<String> wynikTop3 = rankingGry.podajNajlepszychGraczy(3);
            if (wynikTop3.isEmpty()){
                System.out.println("Jeszcze nie ma wyników dla tej gry...");
            } else {
                System.out.println("Top 3 gry " + gra.podajNazwe() + " to:");
                for (String wynik : wynikTop3) {
                    System.out.println(wynik);
                }
            }
        }
    }
}

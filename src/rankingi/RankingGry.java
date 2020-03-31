package rankingi;

import java.util.*;

public class RankingGry {

    public SortedSet<WynikGry> rankingTejGry = new TreeSet<>((o1, o2) -> o2.pobierzPunktyZGry().compareTo(o1.pobierzPunktyZGry()));
    public Gra graTegoRankingu;

    private RankingGry(){}

    public RankingGry(WynikGry wynikTejGry) {
        this.graTegoRankingu = wynikTejGry.pobierzGreTegoWyniku();
    }

    public void dodajNowyWynik(WynikGry wynikTejGry) {
        rankingTejGry.add(wynikTejGry);
    }

    public List<String> podajNajlepszychGraczy(int iloscTopowychGraczyDoPodania) {
        List<String> najlepszeWyniki = new ArrayList<>();
        Iterator<WynikGry> iterator = rankingTejGry.iterator();

        while (iterator.hasNext() && iloscTopowychGraczyDoPodania > 0){
            WynikGry wynik = iterator.next();
            najlepszeWyniki.add((najlepszeWyniki.size() + 1) + ". " + wynik.pobierzGracza().pobierzNick() + ": " + wynik.pobierzPunktyZGry());
            iloscTopowychGraczyDoPodania--;
        }
        return najlepszeWyniki;
    }
}

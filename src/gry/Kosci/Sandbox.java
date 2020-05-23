package gry.Kosci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {

    public static void main(String[] args) {
        Integer[] toList = {1, 4, 3, 2, 4, 6, 5, 4, 2};
        List<Integer> jakasTablica = Arrays.asList(toList);
        jakasTablica.sort(Integer::compareTo);
        czyTablicaZawiera3TakieSameElementy(jakasTablica);
        czyTablicaZawiera3i2TakieSameElementy(jakasTablica);
    }

    private static boolean czyTablicaZawiera3i2TakieSameElementy(List<Integer> jakasTablica) {
        Map<Integer, Integer> mapa = new HashMap<>();
        for (Integer element : jakasTablica) {
            if(mapa.containsKey(element)){
                mapa.put(element, mapa.get(element) + 1);
            } else {
                mapa.put(element, 1);
            }
        }
        if(mapa.containsValue(2) && mapa.containsValue(3)){
            return true;
        }
        return false;
    }

    private static boolean czyTablicaZawiera3TakieSameElementy(List jakasTablica) {
        Integer poprzedniElement = null;
        Integer licznik = 0;
        for (Object elementO : jakasTablica) {
            Integer element = (Integer) elementO;
            if (element == poprzedniElement) {
                licznik++;
            } else {
                licznik = 0;
            }
            if (licznik >= 3) {
                return true;
            }
        }
        return false;
    }
}

import gry.Gra;
import gry.KolkoIKrzyzyk;
import rankingi.Gracz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        SalonGier testowyTalonGier = new SalonGier("Wspaniale Testowy Salon Gier", new KolkoIKrzyzyk());
        System.out.println("Witaj w salonie gier " + testowyTalonGier.nazwaSalonuGier + "!");

        System.out.println("Powiedz, kim jesteś?");
        Gracz nowyGracz = new Gracz(skaner.next());

        while (true) {
            System.out.println("\n" + nowyGracz.pobierzNick() + ", mamy dziś takie gry w salonie:");

            int numerGry = 1;
            for (Gra graWSalonie : testowyTalonGier.listaGierWSalonie) {
                System.out.println(numerGry++ + ". " + graWSalonie.podajNazwe());
            }

            System.out.println("Jeśli chcesz zagrać w losową grę wpisz 0, jeśli chcesz zagrać w konkretną grę, \n" +
                    "wybierz odpowiadającą jej liczbę, jeśli chcesz wyjść, to wpisz \"X\", a następnie kliknij enter:");
            String wybor = skaner.next();

            if (wybor.toUpperCase().equals("X")) {
                System.out.println("Do zobaczenia!");
                break;
            }

            switch (Integer.valueOf(wybor)) {
                case (0):
                default:
                    System.out.println("Zagrajmy zatem w losową grę...");
                    testowyTalonGier.zagrajWLosoweGre(nowyGracz);
                    break;
            }
        }
    }
}

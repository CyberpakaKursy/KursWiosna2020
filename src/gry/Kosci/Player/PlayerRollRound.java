package gry.Kosci.Player;

import gry.Kosci.PreClasses.RollRound;

import java.util.Scanner;

public class PlayerRollRound extends RollRound {

    @Override
    public Boolean[] whichDices() {
        Scanner scanner = new Scanner(System.in);
        String answer;

        System.out.println("Which dices you want to re-roll?");
        for (int i = 0; i < getWhichD6().length; i++) {
            try {
                System.out.println("Do you want to re-roll dice no. " + (i + 1) + "? (yes / no; default: no)");
                answer = scanner.next();
            } catch (Exception e) {
                answer = "no";
            }
            if (!answer.equals("no") && !answer.equals("yes")) answer = "no";

            if (answer.equals("yes")) {
                getWhichD6()[i] = true;
            } else {
                getWhichD6()[i] = false;
            }
        }
        return getWhichD6();
    }

    @Override
    public void reRolls() {
        System.out.print("Dices which you've thrown: ");
        for (int j = 0; j < getDices().size(); j++) System.out.print(getDices().get(j) + " ");
        System.out.println();
        boolean ifReRoll;
        int i = 0;
        String answer;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Do you want to re-roll? (yes / no; default: no)");
            try {
                answer = scanner.next();
            } catch (Exception e) {
                answer = "no";
            }
            if (!answer.equals("no") && !answer.equals("yes")) answer = "no";

            if (answer.equals("yes")) {
                ifReRoll = true;
                roll(whichDices());
                System.out.print("Dices which you've thrown: ");
                for (int j = 0; j < getDices().size(); j++) System.out.print(getDices().get(j) + " ");
                System.out.println();
                i++;
            } else {
                ifReRoll = false;
            }
        } while (i <= 2 && ifReRoll);
    }
}

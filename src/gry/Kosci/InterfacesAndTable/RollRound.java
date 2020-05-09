package gry.Kosci.InterfacesAndTable;

import java.util.Scanner;

public class RollRound {
    public void roll(){}
    public void reRolls(){
        boolean ifReRoll;
        Integer i = 0;
        String answer;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Do you want to re-roll? (0 - no, 1 - yes; default: no)");
            try {
                answer = scanner.next();
            } catch (Exception e) {
                answer = "no";
            }
            if(!answer.equals("no") && !answer.equals("yes")) answer = "no";

            if(answer.equals("yes")) {
                ifReRoll = true;
                roll();
                i++;
            } else {
                ifReRoll = false;
            }
        } while (i<2 && ifReRoll);
    }

    public void rollMechanism(){
        roll();
        reRolls();
    }
}

package gry.Kosci.Player;

import gry.Kosci.PreClasses.Cell;
import gry.Kosci.PreClasses.Table;


import java.util.Scanner;

public class PlayerCell extends Cell {
    @Override
    public Integer chooseCell(Table table) {
        Scanner scanner = new Scanner(System.in);
        Integer chosenCell = null;
        int choice;
        System.out.println("Choices:\n  0 - Aces\n1 - Twos\n2 - Threes\n3 - Fours\n4 - Fives\n5 - Sixes\n6 - three of kind\n7 - four of kind\n8 - full house\n9 - low straight\n10 - high straight\n11 - Yahtzee\n12 - Chance");
        do {
            System.out.println("Type your choice:");
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                choice = 0;
            }
            if(choice<0 || choice>12) choice = 0;
            switch (choice) {
                case 0:
                    if (table.getAces() == null) {
                        chosenCell = 0;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 1:
                    if (table.getTwos() == null) {
                        chosenCell = 1;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 2:
                    if (table.getThrees() == null) {
                        chosenCell = 2;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 3:
                    if (table.getFours() == null) {
                        chosenCell = 3;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 4:
                    if (table.getFives() == null) {
                        chosenCell = 4;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 5:
                    if (table.getSixes() == null) {
                        chosenCell = 5;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 6:
                    if (table.getThreeOfKind() == null) {
                        chosenCell = 6;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 7:
                    if (table.getFourOfKind() == null) {
                        chosenCell = 7;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 8:
                    if (table.getFullHouse() == null) {
                        chosenCell = 8;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 9:
                    if (table.getLowStraight() == null) {
                        chosenCell = 9;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 10:
                    if (table.getHighStraight() == null) {
                        chosenCell = 10;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 11:
                    if (table.getYahtzee() == null || table.getYahtzeeBonusCounter()>1) {
                        chosenCell = 11;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                case 12:
                    if (table.getChance() == null) {
                        chosenCell = 12;
                    } else System.out.println("The cell you've chosen has already been occupied! Choose another one.");
                    break;
                default:
                    System.out.println("The cell you've chosen has already been occupied! Choose another one.");
            }
        } while (chosenCell==null);
        return chosenCell;
    }
}

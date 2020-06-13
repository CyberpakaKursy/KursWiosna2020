package gry.Kosci.Player;

import gry.Kosci.PreClasses.Cell;
import gry.Kosci.PreClasses.Table;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PlayerCell extends Cell {
    @Override
    public Integer chooseCell(Table table) {
        Scanner scanner = new Scanner(System.in);
        Integer chosenCell = null;
        int choice;
        System.out.println("Choices:\n0 - Aces\n1 - Twos\n2 - Threes\n3 - Fours\n4 - Fives\n5 - Sixes\n6 - three of kind\n7 - four of kind\n8 - full house\n9 - low straight\n10 - high straight\n11 - Yahtzee\n12 - Chance");
        do {
            System.out.println("Type your choice:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                choice = 0;
            }
            if (choice < 0 || choice > 12) choice = 0;
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
                    if (table.getYahtzee() == null) {
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
                    break;
            }
        } while (chosenCell == null);
        return chosenCell;
    }

    public Table scoreCounter(Integer chosenCell, List<Integer> dices, Table table) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : dices) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        switch (chosenCell) {
            case 0:
                table.setAces(0);
                if (map.containsKey(1)) table.setAces(map.get(1));
                System.out.println("Value signed (Aces): " + table.getAces());
                break;
            case 1:
                table.setTwos(0);
                if (map.containsKey(2)) table.setTwos(map.get(2) * 2);
                System.out.println("Value signed (Twos): " + table.getTwos());
                break;
            case 2:
                table.setThrees(0);
                if (map.containsKey(3)) table.setThrees(map.get(3) * 3);
                System.out.println("Value signed (Threes): " + table.getThrees());
                break;
            case 3:
                table.setFours(0);
                if (map.containsKey(4)) table.setFours(map.get(4) * 4);
                System.out.println("Value signed (Fours): " + table.getFours());
                break;
            case 4:
                table.setFives(0);
                if (map.containsKey(5)) table.setFives(map.get(5) * 5);
                System.out.println("Value signed (Fives): " + table.getFives());
                break;
            case 5:
                table.setSixes(0);
                if (map.containsKey(6)) table.setSixes(map.get(6) * 6);
                System.out.println("Value signed (Sixes): " + table.getSixes());
                break;
            case 6:
                table.setThreeOfKind(0);
                if (map.containsValue(3)) {
                    for (Integer i : dices) {
                        table.setThreeOfKind(table.getThreeOfKind() + i);
                    }
                }
                System.out.println("Value signed (Three Of Kind): " + table.getThreeOfKind());
                break;
            case 7:
                table.setFourOfKind(0);
                if (map.containsValue(4)) {
                    for (Integer i : dices) {
                        table.setFourOfKind(table.getFourOfKind() + i);
                    }
                }
                System.out.println("Value signed (Four Of Kind): " + table.getFourOfKind());
                break;
            case 8:
                table.setFullHouse(0);
                if (map.containsValue(2) && map.containsValue(3)) {
                    table.setFullHouse(25);
                }
                System.out.println("Value signed (Full House): " + table.getFullHouse());
                break;
            case 9:
                table.setLowStraight(0);
                if (dices.contains(1) && dices.contains(2) && dices.contains(3) && dices.contains(4)) {
                    table.setLowStraight(30);
                } else if (dices.contains(2) && dices.contains(3) && dices.contains(4) && dices.contains(5)) {
                    table.setLowStraight(30);
                } else if (dices.contains(3) && dices.contains(4) && dices.contains(5) && dices.contains(6)) {
                    table.setLowStraight(30);
                }
                System.out.println("Value signed (Low Straight): " + table.getLowStraight());
                break;
            case 10:
                table.setHighStraight(0);
                if (dices.contains(1) && dices.contains(2) && dices.contains(3) && dices.contains(4) && dices.contains(5)) {
                    table.setHighStraight(40);
                } else if (dices.contains(2) && dices.contains(3) && dices.contains(4) && dices.contains(5) && dices.contains(6)) {
                    table.setHighStraight(40);
                }
                System.out.println("Value signed (High Straight): " + table.getHighStraight());
                break;
            case 11:
                table.setYahtzee(0);
                if(map.containsValue(5)) {
                    table.setYahtzee(50);
                } else {
                    table.setYahtzee(0);
                }
                System.out.println("Value signed (Yahtzee): " + table.getYahtzee());
                break;
            case 12:
                table.setChance(0);
                for (Integer i : dices) {
                    table.setChance(table.getChance() + i);
                }
                System.out.println("Value signed (Chance): " + table.getChance());
                break;
        }
        return table;
    }
}

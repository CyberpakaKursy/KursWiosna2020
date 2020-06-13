package gry.Kosci.PreClasses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Cell {

    public Integer chooseCell(Table table) {
        Random random = new Random();
        Integer chosenCell = null;
        do {
            switch (random.nextInt(13)) {
                case 0:
                    if (table.getAces() == null) {
                        chosenCell = 0;
                    }
                    break;
                case 1:
                    if (table.getTwos() == null) {
                        chosenCell = 1;
                    }
                    break;
                case 2:
                    if (table.getThrees() == null) {
                        chosenCell = 2;
                    }
                    break;
                case 3:
                    if (table.getFours() == null) {
                        chosenCell = 3;
                    }
                    break;
                case 4:
                    if (table.getFives() == null) {
                        chosenCell = 4;
                    }
                    break;
                case 5:
                    if (table.getSixes() == null) {
                        chosenCell = 5;
                    }
                    break;
                case 6:
                    if (table.getThreeOfKind() == null) {
                        chosenCell = 6;
                    }
                    break;
                case 7:
                    if (table.getFourOfKind() == null) {
                        chosenCell = 7;
                    }
                    break;
                case 8:
                    if (table.getFullHouse() == null) {
                        chosenCell = 8;
                    }
                    break;
                case 9:
                    if (table.getLowStraight() == null) {
                        chosenCell = 9;
                    }
                    break;
                case 10:
                    if (table.getHighStraight() == null) {
                        chosenCell = 10;
                    }
                    break;
                case 11:
                    if (table.getYahtzee() == null) {
                        chosenCell = 11;
                    }
                    break;
                case 12:
                    if (table.getChance() == null) {
                        chosenCell = 12;
                    }
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
                break;
            case 1:
                table.setTwos(0);
                if (map.containsKey(2)) table.setTwos(map.get(2) * 2);
                break;
            case 2:
                table.setThrees(0);
                if (map.containsKey(3)) table.setThrees(map.get(3) * 3);
                break;
            case 3:
                table.setFours(0);
                if (map.containsKey(4)) table.setFours(map.get(4) * 4);
                break;
            case 4:
                table.setFives(0);
                if (map.containsKey(5)) table.setFives(map.get(5) * 5);
                break;
            case 5:
                table.setSixes(0);
                if (map.containsKey(6)) table.setSixes(map.get(6) * 6);
                break;
            case 6:
                table.setThreeOfKind(0);
                if (map.containsValue(3)) {
                    for (Integer i : dices) {
                        table.setThreeOfKind(table.getThreeOfKind() + i);
                    }
                }
                break;
            case 7:
                table.setFourOfKind(0);
                if (map.containsValue(4)) {
                    for (Integer i : dices) {
                        table.setFourOfKind(table.getFourOfKind() + i);
                    }
                }
                break;
            case 8:
                table.setFullHouse(0);
                if (map.containsValue(2) && map.containsValue(3)) {
                    table.setFullHouse(25);
                }
                break;
            case 9:
                table.setLowStraight(0);
                if (dices.contains(1) && dices.contains(2) && dices.contains(3) && dices.contains(4)) {
                    table.setHighStraight(30);
                } else if (dices.contains(2) && dices.contains(3) && dices.contains(4) && dices.contains(5)) {
                    table.setHighStraight(30);
                } else if (dices.contains(3) && dices.contains(4) && dices.contains(5) && dices.contains(6)) {
                    table.setHighStraight(30);
                }
                break;
            case 10:
                table.setHighStraight(0);
                if (dices.contains(1) && dices.contains(2) && dices.contains(3) && dices.contains(4) && dices.contains(5)) {
                    table.setHighStraight(40);
                } else if (dices.contains(2) && dices.contains(3) && dices.contains(4) && dices.contains(5) && dices.contains(6)) {
                    table.setHighStraight(40);
                }
                break;
            case 11:
                table.setYahtzee(0);
                if (map.containsValue(5)) {
                    table.setYahtzee(50);
                } else {
                    table.setYahtzee(0);
                }
                break;
            case 12:
                table.setChance(0);
                for (Integer i : dices) {
                    table.setChance(table.getChance() + i);
                }
                break;
        }
        return table;
    }

    public Table cellMechanism(List<Integer> dices, Table table) {
        return scoreCounter(chooseCell(table), dices, table);
    }

}

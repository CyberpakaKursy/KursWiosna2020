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
                    if (table.getYahtzee() == null || table.getYahtzeeBonusCounter() > 0) {
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
        switch (chosenCell) {
            case 0:
                table.setAces(0);
                for (Integer i : dices) {
                    if (dices.get(i) == 1) table.setAces(table.getAces() + 1);
                }
                break;
            case 1:
                table.setTwos(0);
                for (Integer i : dices) {
                    if (dices.get(i) == 2) table.setAces(table.getTwos() + 2);
                }
                break;
            case 2:
                table.setThrees(0);
                for (Integer i : dices) {
                    if (dices.get(i) == 3) table.setAces(table.getThrees() + 3);
                }
                break;
            case 3:
                table.setFours(0);
                for (Integer i : dices) {
                    if (dices.get(i) == 4) table.setAces(table.getFours() + 4);
                }
                break;
            case 4:
                table.setFives(0);
                for (Integer i : dices) {
                    if (dices.get(i) == 5) table.setAces(table.getFives() + 5);
                }
                break;
            case 5:
                table.setSixes(0);
                for (Integer i : dices) {
                    if (dices.get(i) == 6) table.setAces(table.getSixes() + 6);
                }
                break;
            case 6:
                table.setThreeOfKind(0);
                Map<Integer, Integer> map1 = new HashMap<>();
                for (Integer element : dices) {
                    if (map1.containsKey(element)) {
                        map1.put(element, map1.get(element) + 1);
                    } else {
                        map1.put(element, 1);
                    }
                }
                if (map1.containsValue(3)) {
                    for (Integer i : dices) {
                        table.setThreeOfKind(table.getThreeOfKind() + dices.get(i));
                    }
                }
                break;
            case 7:
                table.setFourOfKind(0);
                Map<Integer, Integer> map2 = new HashMap<>();
                for (Integer element : dices) {
                    if (map2.containsKey(element)) {
                        map2.put(element, map2.get(element) + 1);
                    } else {
                        map2.put(element, 1);
                    }
                }
                if (map2.containsValue(4)) {
                    for (Integer i : dices) {
                        table.setFourOfKind(table.getFourOfKind() + dices.get(i));
                    }
                }
                break;
            case 8:
                table.setFullHouse(0);
                Map<Integer, Integer> map = new HashMap<>();
                for (Integer element : dices) {
                    if (map.containsKey(element)) {
                        map.put(element, map.get(element) + 1);
                    } else {
                        map.put(element, 1);
                    }
                }
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
                if (dices.get(0).equals(dices.get(1)) && dices.get(1).equals(dices.get(2)) && dices.get(2).equals(dices.get(3)) && dices.get(3).equals(dices.get(4)) && dices.get(4).equals(dices.get(5))) {
                    table.setYahtzee(50);
                    table.setYahtzeeBonusCounter(table.getYahtzeeBonusCounter() + 1);
                    if (table.getYahtzeeBonusCounter() > 1) table.setYahtzeeBonus(table.getYahtzeeBonus() + 100);
                }
                break;
            case 12:
                for (Integer i : dices) {
                    table.setChance(table.getChance() + dices.get(i));
                }
                break;
        }
        return table;
    }

    public Table cellMechanism(List<Integer> dices, Table table) {
        return scoreCounter(chooseCell(table), dices, table);
    }

}

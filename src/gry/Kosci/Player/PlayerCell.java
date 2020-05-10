package gry.Kosci.Player;

import gry.Kosci.PreClasses.Cell;

public class PlayerCell extends  Cell {

    private Integer yahtzeeCounter;

    public Integer getYahtzeeCounter() {
        return yahtzeeCounter;
    }

    public void setYahtzeeCounter(Integer dicesToRoll) {
        this.yahtzeeCounter = dicesToRoll;
    }

    @Override
    public void chooseCell() {

    }

    @Override
    public void scoreCounter() {

    }
}

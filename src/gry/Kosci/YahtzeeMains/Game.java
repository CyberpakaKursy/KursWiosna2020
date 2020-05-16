package gry.Kosci.YahtzeeMains;

import gry.Kosci.PC.PCCell;
import gry.Kosci.PC.PCRollRound;
import gry.Kosci.PC.PCTable;
import gry.Kosci.Player.PlayerCell;
import gry.Kosci.Player.PlayerRollRound;
import gry.Kosci.Player.PlayerTable;

public class Game {

    PCTable tablePC = new PCTable();
    PCRollRound rollRoundPC = new PCRollRound();
    PCCell cellPC = new PCCell();

    PlayerTable tableP = new PlayerTable();
    PlayerRollRound rollRoundP = new PlayerRollRound();
    PlayerCell cellP = new PlayerCell();

    public void clearLabel(){
        tablePC.setAces(null);
        tablePC.setTwos(null);
        tablePC.setThrees(null);
        tablePC.setFours(null);
        tablePC.setFives(null);
        tablePC.setSixes(null);
        tablePC.setUpperBonus(null);
        tablePC.setThreeOfKind(null);
        tablePC.setFourOfKind(null);
        tablePC.setFullHouse(null);
        tablePC.setLowStraight(null);
        tablePC.setHighStraight(null);
        tablePC.setYahtzee(null);
        tablePC.setChance(null);
        tablePC.setYahtzeeBonus(null);

        tableP.setAces(null);
        tableP.setTwos(null);
        tableP.setThrees(null);
        tableP.setFours(null);
        tableP.setFives(null);
        tableP.setSixes(null);
        tableP.setUpperBonus(null);
        tableP.setThreeOfKind(null);
        tableP.setFourOfKind(null);
        tableP.setFullHouse(null);
        tableP.setLowStraight(null);
        tableP.setHighStraight(null);
        tableP.setYahtzee(null);
        tableP.setChance(null);
        tableP.setYahtzeeBonus(null);
    }

    public void gameMechanism(){
        while (tablePC.ifTableFull() && tableP.ifTableFull()) {
            rollRoundP.rollMechanism();
            tableP = (PlayerTable) cellP.cellMechanism(rollRoundP.getDices(),tableP);
            rollRoundPC.rollMechanism();
            tablePC = (PCTable) cellPC.cellMechanism(rollRoundPC.getDices(),tablePC);
        }
    }
    public void finalCounting() {}
    public void ending() {}
}

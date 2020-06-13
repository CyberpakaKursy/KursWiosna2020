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
    int sumPC;

    PlayerTable tableP = new PlayerTable();
    PlayerRollRound rollRoundP = new PlayerRollRound();
    PlayerCell cellP = new PlayerCell();
    int sumP;

    public void clearLabel(){
        tablePC.setAces(null);
        tablePC.setTwos(null);
        tablePC.setThrees(null);
        tablePC.setFours(null);
        tablePC.setFives(null);
        tablePC.setSixes(null);
        tablePC.setUpperBonus(0);
        tablePC.setThreeOfKind(null);
        tablePC.setFourOfKind(null);
        tablePC.setFullHouse(null);
        tablePC.setLowStraight(null);
        tablePC.setHighStraight(null);
        tablePC.setYahtzee(null);
        tablePC.setChance(null);

        tableP.setAces(null);
        tableP.setTwos(null);
        tableP.setThrees(null);
        tableP.setFours(null);
        tableP.setFives(null);
        tableP.setSixes(null);
        tableP.setUpperBonus(0);
        tableP.setThreeOfKind(null);
        tableP.setFourOfKind(null);
        tableP.setFullHouse(null);
        tableP.setLowStraight(null);
        tableP.setHighStraight(null);
        tableP.setYahtzee(null);
        tableP.setChance(null);
    }

    public void gameMechanism(){
        while (tablePC.ifTableFull() && tableP.ifTableFull()) {
            rollRoundP.rollMechanism();
            tableP = (PlayerTable) cellP.cellMechanism(rollRoundP.getDices(),tableP);
            rollRoundPC.rollMechanism();
            tablePC = (PCTable) cellPC.cellMechanism(rollRoundPC.getDices(),tablePC);
        }
    }

    public Integer ending() {
        sumPC = tablePC.getAces();
        sumPC =+ tablePC.getTwos();
        sumPC =+ tablePC.getThrees();
        sumPC =+ tablePC.getFours();
        sumPC =+ tablePC.getFives();
        sumPC =+ tablePC.getSixes();

        if(sumPC>=65) tablePC.setUpperBonus(35);

        sumPC =+ tablePC.getUpperBonus();
        sumPC =+ tablePC.getThreeOfKind();
        sumPC =+ tablePC.getFourOfKind();
        sumPC =+ tablePC.getFullHouse();
        sumPC =+ tablePC.getLowStraight();
        sumPC =+ tablePC.getHighStraight();
        sumPC =+ tablePC.getYahtzee();

        sumP = tableP.getAces();
        sumP =+ tableP.getTwos();
        sumP =+ tableP.getThrees();
        sumP =+ tableP.getFours();
        sumP =+ tableP.getFives();
        sumP =+ tableP.getSixes();

        if(sumP>=65) tableP.setUpperBonus(35);

        sumP =+ tableP.getUpperBonus();
        sumP =+ tableP.getThreeOfKind();
        sumP =+ tableP.getFourOfKind();
        sumP =+ tableP.getFullHouse();
        sumP =+ tableP.getLowStraight();
        sumP =+ tableP.getHighStraight();
        sumP =+ tableP.getYahtzee();

        if(sumP>sumPC){
            System.out.println("WIN");
        } else if(sumP==sumPC) {
            System.out.println("DRAW");
        } else {
            System.out.println("DEFEAT");
        }

        return sumP;
    }
}

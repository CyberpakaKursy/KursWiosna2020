package gry.Kosci.PreClasses;

import java.util.Arrays;
import java.util.Random;

public class RollRound {

    private Integer[] dices;
    private Boolean[] whichD6;

    public Boolean[] getWhichD6() {
        return whichD6;
    }
    public void setWhichD6(Boolean[] whichD6) {
        this.whichD6 = whichD6;
    }
    public Integer[] getDices() {
        return dices;
    }
    public void setDices(Integer[] dices) {
        this.dices = dices;
    }


    public void roll(Boolean[] whichD6){
        Random random = new Random();
        for(int i=0; i<getDices().length;i++) if (whichD6[i]) getDices()[i] = random.nextInt(6) + 1;
    }

    public Boolean[] whichDices(){
        Random random = new Random();
        for(int i=0;i<getWhichD6().length;i++){
            getWhichD6()[i] = random.nextBoolean();
        }
        return getWhichD6();
    }

    public void reRolls(){
        boolean ifReRoll;
        int i = 0;
        int a;
        Random random = new Random();

        do {
            a = random.nextInt(1);
            if(a==1)
            {
                ifReRoll = true;
                roll(whichDices());
                i++;
            } else {
                ifReRoll = false;
            }
        } while (i<2 && ifReRoll);
    }

    public void rollMechanism(){
        setDices(new Integer[6]);
        setWhichD6(new Boolean[6]);
        Arrays.fill(getWhichD6(), true);

        roll(getWhichD6());
        reRolls();
    }
}

package gry.Kosci.InterfacesAndTable;

public class Table {
    private Integer aces = null;
    private Integer twos = null;
    private Integer threes = null;
    private Integer fours = null;
    private Integer fives = null;
    private Integer sixes = null;
    private Integer upperBonus = null;
    private Integer threeOfKind = null;
    private Integer fourOfKind = null;
    private Integer fullHouse = null;
    private Integer lowStraight = null;
    private Integer highStraight = null;
    private Integer yahtzee = null;
    private Integer chance = null;
    private Integer yahtzeeBonus = null;

    public Integer getAces() {
        return aces;
    }

    public void setAces(Integer aces) {
        this.aces = aces;
    }

    public Integer getTwos() {
        return twos;
    }

    public void setTwos(Integer twos) {
        this.twos = twos;
    }

    public Integer getThrees() {
        return threes;
    }

    public void setThrees(Integer threes) {
        this.threes = threes;
    }

    public Integer getFours() {
        return fours;
    }

    public void setFours(Integer fours) {
        this.fours = fours;
    }

    public Integer getFives() {
        return fives;
    }

    public void setFives(Integer fives) {
        this.fives = fives;
    }

    public Integer getSixes() {
        return sixes;
    }

    public void setSixes(Integer sixes) {
        this.sixes = sixes;
    }

    public Integer getUpperBonus() {
        return upperBonus;
    }

    public void setUpperBonus(Integer upperBonus) {
        this.upperBonus = upperBonus;
    }

    public Integer getThreeOfKind() {
        return threeOfKind;
    }

    public void setThreeOfKind(Integer threeOfKind) {
        this.threeOfKind = threeOfKind;
    }

    public Integer getFourOfKind() {
        return fourOfKind;
    }

    public void setFourOfKind(Integer fourOfKind) {
        this.fourOfKind = fourOfKind;
    }

    public Integer getFullHouse() {
        return fullHouse;
    }

    public void setFullHouse(Integer fullHouse) {
        this.fullHouse = fullHouse;
    }

    public Integer getLowStraight() {
        return lowStraight;
    }

    public void setLowStraight(Integer lowStraight) {
        this.lowStraight = lowStraight;
    }

    public Integer getHighStraight() {
        return highStraight;
    }

    public void setHighStraight(Integer highStraight) {
        this.highStraight = highStraight;
    }

    public Integer getYahtzee() {
        return yahtzee;
    }

    public void setYahtzee(Integer yahtzee) {
        this.yahtzee = yahtzee;
    }

    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    public Integer getYahtzeeBonus() {
        return yahtzeeBonus;
    }

    public void setYahtzeeBonus(Integer yahtzeeBonus) {
        this.yahtzeeBonus = yahtzeeBonus;
    }

    public boolean ifTableFull() {
        if(getAces() == null) return false;
        else if(getTwos() == null) return false;
        else if(getThrees() == null) return false;
        else if(getFours() == null) return false;
        else if(getFives() == null) return false;
        else if(getSixes() == null) return false;
        //else if(getUpperBonus() == null) return false;
        else if(getThreeOfKind() == null) return false;
        else if(getFourOfKind() == null) return false;
        else if(getFullHouse() == null) return false;
        else if(getLowStraight() == null) return false;
        else if(getHighStraight() == null) return false;
        else if(getYahtzee() == null) return false;
        else if(getChance() == null) return false;
        //else if(getYahtzeeBonus() == null) return false;
        else return true;
    }
}

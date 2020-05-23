package gry.Kosci.PreClasses;

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
    private Integer yahtzeeBonusCounter = null;

    public Integer getYahtzeeBonusCounter() {
        return yahtzeeBonusCounter;
    }

    public void setYahtzeeBonusCounter(Integer yahtzeeBonusCounter) {
        this.yahtzeeBonusCounter = yahtzeeBonusCounter;
    }

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
        boolean var;
        if(getAces() == null) var = true;
        else if(getTwos() == null) var =  true;
        else if(getThrees() == null) var =  true;
        else if(getFours() == null) var = true;
        else if(getFives() == null) var =  true;
        else if(getSixes() == null) var = true;
        else if(getThreeOfKind() == null) var =  true;
        else if(getFourOfKind() == null) var =  true;
        else if(getFullHouse() == null) var =  true;
        else if(getLowStraight() == null) var =  true;
        else if(getHighStraight() == null) var =  true;
        else if(getYahtzee() == null) var = true;
        else if(getChance() == null) var = true;
        else var =  false;
        return var;
    }
}

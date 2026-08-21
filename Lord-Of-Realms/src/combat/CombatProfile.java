package combat;

public class CombatProfile {

    private int maxHp;
    private int  attack;
    private int defense;
    private int expReward;

    public CombatProfile(int maxHp, int attack, int defense, int expReward){
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.expReward = expReward;
    }

    public int getMaxHp(){
        return maxHp;
    }

    public int getAttack(){
        return attack;
    }

    public int getDefense(){
        return defense;
    }

    public int getExpReward(){
        return expReward;
    }
}

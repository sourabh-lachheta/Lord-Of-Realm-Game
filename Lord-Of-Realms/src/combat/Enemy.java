package combat;

public class Enemy {

    private String name;
    private int hp;
   // private int maxHp;
   // private int attack;
   // private int expReward;
    private CombatProfile combatProfile;

    public Enemy(String name,CombatProfile combatProfile){
        this.name = name;
        this.hp = combatProfile.getMaxHp();
        this.combatProfile = combatProfile;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public int getMaxHp(){
        return combatProfile.getMaxHp();
    }

    public int getAttack(){
        return combatProfile.getAttack();
    }

    public void takeDamage(int damage){
        hp -= damage;

        if(hp <0){
            hp = 0;
        }
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public int getExpReward(){
        return combatProfile.getExpReward();
    }
}

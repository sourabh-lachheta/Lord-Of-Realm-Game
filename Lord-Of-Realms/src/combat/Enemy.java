package combat;

public class Enemy {

    private String name;
    private int hp;
    private int maxHp;
    private int attack;
    private int expReward;

    public Enemy(String name, int hp, int attack, int expReward){
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.expReward = expReward;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public int getMaxHp(){
        return maxHp;
    }

    public int getAttack(){
        return attack;
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
        return expReward;
    }
}

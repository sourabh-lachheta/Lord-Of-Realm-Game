package player;

public class Player {
    private String name;

    private int hp;
    private int maxHp;

    private int qi;
    private int maxQi;

    private int exp;

    private int realm;

    public Player(){

        name = "Fang Yuan";

        maxHp = 100;
        hp = maxHp;

        maxQi = 50;
        qi = maxQi;

        exp = 0;
        realm = 1;
    }

    public String getName(){
        return name;

    }
    public String getHealthText(){
        return hp + "/" + maxHp;
    }

    public String getQiText(){
        return qi + "/" + maxQi;
    }

    public int getExp(){
        return exp;
    }
    public String getRealmName(){
        switch (realm){
            case 1:
                return "Body Tempering";

            case 2:
                return "Qi Gathering";

            case 3:
                return "Foundation Establishment";

            default:
                return "Unknown Realm";

        }
    }



    public void takeDamage(){

    }
    public void heal(){

    }
    public void gainQi(){

    }
    public void consumeQi(){

    }
    public void gainExp(){

    }
    public void breakthrough(){

    }



}

package player;

import inventory.Inventory;
import inventory.Item;

public class Player {
    private String name;

    private int hp;
    private int maxHp;
    private int qi;
    private int maxQi;
    private int exp;
    private int realm;

    private Inventory inventory;

    public Player(){

        name = "User";

        maxHp = 100;
        hp = maxHp;

        maxQi = 50;
        qi = maxQi;

        exp = 0;
        realm = 1;

        inventory = new Inventory();

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

    public void takeDamage(int amount){

        hp -= amount;
        if(hp < 0){
            hp = 0;
        }

    }
    public void heal(int amount){

        hp += amount;
        if(hp > maxHp){
            hp = maxHp;
        }

    }
    public void gainQi(){

    }
    public void consumeQi(){

    }
    public void gainExp(){

    }
    public void breakthrough(){

    }

    public Inventory getInventory(){
        return inventory;
    }

    public void addItem(Item item){
        inventory.addItem(item);
    }

    public boolean hasItem(Item item){
        return inventory.hasItem(item);
    }

    public boolean removeItem(Item item){
        return inventory.removeItem(item);
    }

    public boolean useItem(Item item){
        if(!hasItem(item)){
            return false;
        }

        if(item.getHealAmount() > 0){
            heal(item.getHealAmount());
        }

        if(item.isConsumable()) {
            removeItem(item);
        }
        return true;
    }



}

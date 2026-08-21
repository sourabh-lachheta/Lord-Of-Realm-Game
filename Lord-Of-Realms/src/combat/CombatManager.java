package combat;

import inventory.Item;
import player.Player;

import java.util.ArrayList;
import java.util.List;

public class CombatManager {

    private Player player;
    private Enemy enemy;
    private List<CombatAction> actions;

    public CombatManager(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
        actions = new ArrayList<>();
    }

    public Player getPlayer(){
        return player;
    }


    public Enemy getEnemy(){
        return enemy;
    }


    public void startCombat(){
        System.out.println(player.getName() + " vs " + enemy.getName());
        initializeActions();
    }

    public String playerAttack(){

        int damage = player.getCombatAttack();

        enemy.takeDamage(damage);

        String result =
                player.getName() + " attacks " + enemy.getName() + "\n" +
                        "Damage: " + damage + "\n\n" +
                        enemy.getName() + " HP: " +
                        enemy.getHp() + "/" + enemy.getMaxHp();

        if(!enemy.isAlive()){
            player.gainExp(enemy.getExpReward());

            result += "\n\n" +
                    enemy.getName() + " has been defeated!\n" +
                    "Exp gained: " + enemy.getExpReward();

            return result;
        }
        result += "\n\n" + enemyAttack();
        return result;
    }


    private String enemyAttack(){

        int damage = enemy.getAttack();

        player.takeDamage(damage);


        String result =
                enemy.getName() + " attacks " +
                        player.getName() + "\n" +
                        "Damage: " + damage + "\n\n" +
                        player.getName() + " HP: " +
                        player.getHealthText();

        if(!player.isAlive()){
            result += "\n\n" +
                    player.getName() +
                    " has been defeated!";
        }
        return result;
    }

    public boolean isCombatOver(){
        return !player.isAlive() || !enemy.isAlive();
    }


    public boolean playerUseItem(Item item){

        if(isCombatOver()){
            return false;
        }

        boolean used = player.useItem(item);

        if(!used){
            return false;
        }

        enemyAttack();

        return true;
    }

    public void initializeActions(){

        actions.clear();

        actions.add(new CombatAction("Attack"));
        actions.add(new CombatAction("use Item"));
        actions.add(new CombatAction("Run"));

    }

    public List<CombatAction> getActions(){
        return actions;
    }
}

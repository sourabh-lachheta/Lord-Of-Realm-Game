package combat;

import player.Player;

public class CombatManager {

    private Player player;
    private Enemy enemy;

    public CombatManager(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public Player getPlayer(){
        return player;
    }


    public Enemy getEnemy(){
        return enemy;
    }


    public void startCombat(){
        System.out.println(player.getName() + " vs " + enemy.getName());
    }

    public void playerAttack(){

        int damage = player.getCombaTAttack();

        enemy.takeDamage(damage);

        System.out.println(player.getName() + " attacks " + enemy.getName());
        System.out.println("Damage  " + damage);
        System.out.println(
                enemy.getName() + "HP: "
                + enemy.getHp() + "/" + enemy.getMaxHp()
        );

        if(!enemy.isAlive()){
            System.out.println(enemy.getName() + " has been defeated! ");

            player.gainExp(enemy.getExpReward());

            System.out.println("Exp gained: " + enemy.getExpReward());
            return;
        }
        enemyAttack();
    }


    private void enemyAttack(){

        int damage = enemy.getAttack();

        player.takeDamage(damage);

        System.out.println(enemy.getName() + " attacks " + player.getName());
        System.out.println("Damage: " + damage);
        System.out.println(
                player.getName() + " HP: "
                + player.getHealthText()
        );

        if(!player.isAlive()){
            System.out.println(player.getName() + " has been defeated!");
        }
    }

    public boolean isCombatOver(){
        return !player.isAlive() || !enemy.isAlive();
    }
}

package game;

import combat.CombatManager;
import combat.Enemy;
import inventory.Item;
import inventory.ItemDatabase;
import player.Player;
import story.StoryManager;
import ui.GameWindow; // Getting Access from Package


public class Game {

    private GameWindow gameWindow;
    private StoryManager storyManager;
    private Player player;


    public Game(){
        player = new Player();
        //player.getInventory().addItem(new Item("rusty sword"));
       //player.getInventory().showItems();
        //System.out.println(player.getInventory().getItemsText());



        Player player = new Player();

        Enemy wolf = new Enemy(
                "Wolf",
                50,
                8,
                25
        );

        CombatManager combat = new CombatManager(player, wolf);

        combat.startCombat();

        while (!combat.isCombatOver()) {
            combat.playerAttack();
        }



        storyManager = new StoryManager(player);
        gameWindow = new GameWindow(player,storyManager);


    }

    public void start(){
        gameWindow.showWindow(); // Call from Game Class

    }

}

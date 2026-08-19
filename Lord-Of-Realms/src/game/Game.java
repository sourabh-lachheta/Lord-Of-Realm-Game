package game;

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



      



        storyManager = new StoryManager(player);
        gameWindow = new GameWindow(player,storyManager);


    }

    public void start(){
        gameWindow.showWindow(); // Call from Game Class

    }

}

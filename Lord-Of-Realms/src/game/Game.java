package game;

import player.Player;
import story.StoryManager;
import ui.GameWindow; // Getting Access from Package


public class Game {

    private GameWindow gameWindow;
    private StoryManager storyManager;
    private Player player;


    public Game(){
        player = new Player();
        storyManager = new StoryManager();
        gameWindow = new GameWindow(player,storyManager);


    }

    public void start(){
        gameWindow.showWindow(); // Call from Game Class

    }

}

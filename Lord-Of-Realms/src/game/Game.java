package game;

import story.StoryManager;
import ui.GameWindow; // Getting Access from Package


public class Game {

    private GameWindow gameWindow;
    private StoryManager storyManager;


    public Game(){
        storyManager = new StoryManager();
        gameWindow = new GameWindow(storyManager);


    }

    public void start(){
        gameWindow.showWindow(); // Call from Game Class

    }

}

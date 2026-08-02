package game;

import ui.GameWindow; // Getting Access from Package


public class Game {

    private GameWindow gameWindow;


    public Game(){
        gameWindow = new GameWindow();

    }

    public void start(){
        gameWindow.showWindow(); // Call from Game Class

    }

}

package game;

import ui.GameWindow;

public class Game {

    private GameWindow gameWindow;
    public Game(){

    }

    public void start(){
        gameWindow = new GameWindow();
        gameWindow.showWindow();

    }

}

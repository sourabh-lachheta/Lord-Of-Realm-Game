package ui;
import javax.swing.*;

public class GameWindow extends JFrame {
    private static final String GAME_TITTLE = "LORDS OF REALMS";
    private static final int WINDOW_WIDTH = 1200;
    private static final int WINDOW_HEIGHT = 700;

    public GameWindow(){

        setTitle(GAME_TITTLE);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void showWindow(){
        setVisible(true);
    }

}

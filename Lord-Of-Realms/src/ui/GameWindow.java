

/*
  -> represent the main game window.
  -> responsible only for displaying the user interface.
  -> forwarding user actions to the game logic.
*/








package ui;
import player.Player;
import story.Choice;
import story.StoryManager;
import story.StoryScene;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GameWindow extends JFrame {
    private static final String GAME_TITTLE = "LORD OF REALMS";
    private static final int WINDOW_WIDTH = 1200;
    private static final int WINDOW_HEIGHT = 700;

    private JPanel mainPanel;

    //Status  panel...
    private JPanel statusPanel;
    private JLabel nameLabel;
    private JLabel realmLabel;
    private JLabel hpLabel;
    private JLabel qiLabel;
    private JLabel expLabel;


    //story panel...
    private JPanel storyPanel;
    private JTextArea storyTextArea;
    private JScrollPane storyScrollPane;


    //Choice Panel...
    private JPanel choicePanel;
    private JButton choice1Button;
    private JButton choice2Button;
    private JButton choice3Button;
    private JButton choice4Button;

    private Player player;
    private StoryManager storyManager;

    public GameWindow(Player player, StoryManager storyManager){
        this.player = player;
        this.storyManager = storyManager;
        this.storyManager.startStory(1);

        initialize();
        updatePlayerInfo();
        updateScene();// Actual window Frame
    }

    // Details of window
    public void initialize(){
        configureWindow();
        createComponents();
        layoutComponents();
        registerListeners();
    }


    private void registerListeners() {

        choice1Button.addActionListener( e->{
            storyManager.selectChoice(0);
            updateScene();
        });

        choice2Button.addActionListener( e->{
            storyManager.selectChoice(1);
            updateScene();
        });

        choice3Button.addActionListener( e->{
            storyManager.selectChoice(2);
            updateScene();
        });

        choice4Button.addActionListener( e->{
            storyManager.selectChoice(3);
            updateScene();
        });

    }


    // layouts,fonts,colors,borders, sizes etc.......
    private void layoutComponents() {
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(statusPanel, BorderLayout.NORTH);
        mainPanel.add(storyPanel, BorderLayout.CENTER);
        mainPanel.add(choicePanel, BorderLayout.SOUTH);
        add(mainPanel);

        statusPanel.setBackground(Color.RED);
        storyPanel.setBackground(Color.BLUE);
        choicePanel.setBackground(Color.GREEN);

        // status panel...
        nameLabel.setFont(new Font("font",Font.PLAIN,16));
        statusPanel.add(nameLabel);
        realmLabel.setFont(new Font("font",Font.PLAIN,16));
        statusPanel.add(realmLabel);
        hpLabel.setFont(new Font("font",Font.PLAIN,16));
        statusPanel.add(hpLabel);
        qiLabel.setFont(new Font("font",Font.PLAIN,16));
        statusPanel.add(qiLabel);
        expLabel.setFont(new Font("font",Font.PLAIN,16));
        statusPanel.add(expLabel);

        // story panel...
        storyPanel.setLayout(new BorderLayout());
        storyPanel.add(storyScrollPane,BorderLayout.CENTER);

        // choice panel....
        choicePanel.add(choice1Button);
        choicePanel.add(choice2Button);
        choicePanel.add(choice3Button);
        choicePanel.add(choice4Button);

    }


    // all my panel, buttons, labels, text area etc......
    private void createComponents() {
        mainPanel = new JPanel();


        //status panel...
        statusPanel = new JPanel();
        nameLabel = new JLabel();
        realmLabel = new JLabel();
        hpLabel = new JLabel();
        qiLabel = new JLabel();
        expLabel = new JLabel();

        //story panel....
        storyPanel = new JPanel();
        storyTextArea = new JTextArea();
        storyTextArea.setFont(new Font("GC Omega", Font.BOLD,20));


        storyScrollPane = new JScrollPane(storyTextArea);
        storyTextArea.setEditable(false);
        storyTextArea.setLineWrap(true);
        storyTextArea.setWrapStyleWord(true);

        //choice panel...
        choicePanel = new JPanel();
        choice1Button = new JButton();
        choice2Button = new JButton();
        choice3Button = new JButton();
        choice4Button = new JButton();

    }


    private void configureWindow() {
        setTitle(GAME_TITTLE);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void setStoryText(String text){
        storyTextArea.setText(text);
    }

    public void setChoices(List<Choice> choices){
        JButton[] buttons = {
                choice1Button,
                choice2Button,
                choice3Button,
                choice4Button

        };

        for(int i = 0; i < buttons.length; i++){
            if(i < choices.size()){
                buttons[i].setText(choices.get(i).getText());
                buttons[i].setVisible(true);
            }else{
                buttons[i].setVisible(false);
            }
        }
    }

    private void updateScene() {

        StoryScene scene = storyManager.getCurrentScene();



        setStoryText(scene.getStoryText());
        setChoices(scene.getChoices());

    }

    public void updateHealth(int hp){
        hpLabel.setText("HP : " + hp + "/100");
    }

    private void updatePlayerInfo(){
        nameLabel.setText(("Name : " + player.getName()));
        realmLabel.setText("Realm : "+ player.getRealmName());
        hpLabel.setText("HP : "+ player.getHealthText());
        qiLabel.setText("Qi : " + player.getQiText());
        expLabel.setText("EXp : " + player.getExp());
    }

















    public void showWindow(){
        setVisible(true);
    }

}

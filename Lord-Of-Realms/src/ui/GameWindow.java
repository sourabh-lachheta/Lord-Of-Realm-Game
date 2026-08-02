

/*
  -> represent the main game window.
  -> responsible only for displaying the user interface.
  -> forwarding user actions to the game logic.
*/








package ui;
import javax.swing.*;
import java.awt.*;

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



    public GameWindow(){
        initialize(); // Actual window Frame
    }

    // Details of window
    public void initialize(){
        configureWindow();
        createComponents();
        layoutComponents();
        registerListeners();
    }


    private void registerListeners() {

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
        nameLabel = new JLabel("Name : Unknown    ");
        realmLabel = new JLabel("Realm : Mortal    ");
        hpLabel = new JLabel("HP : 100/100    ");
        qiLabel = new JLabel("Qi : 0/100    ");
        expLabel = new JLabel("EXP : 0");

        //story panel....
        storyPanel = new JPanel();
        storyTextArea = new JTextArea();


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

    public void setChoices(String c1, String c2, String c3, String c4){
        choice1Button.setText(c1);
        choice2Button.setText(c2);
        choice3Button.setText(c3);
        choice4Button.setText(c4);
    }

    public void update(int hp){
        hpLabel.setText("HP : " + hp + "/100");
    }















    public void showWindow(){
        setVisible(true);
    }

}

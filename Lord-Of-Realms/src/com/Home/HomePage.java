package com.Home;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {

    JButton PlayButton, exitButton;

    HomePage(){

        setLayout(null);

        JLabel label  = new JLabel("<-- Lords of Realm -->");
        label.setBounds(590, 100,500,30);
        label.setFont(new Font("GC Omega",Font.BOLD,40));
        label.setForeground(Color.WHITE);
        add(label);

        PlayButton = new JButton("           PLAY            ");
        PlayButton.setBounds(645,200,300,40);
        PlayButton.setFont(new Font("GC Omega",Font.BOLD,20));
        add(PlayButton);

        exitButton = new JButton("           EXIT            ");
        exitButton.setBounds(645,270,300,40);
        exitButton.setFont(new Font("GC Omega",Font.BOLD,20));
        add(exitButton);

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screen.width * 85 / 100;
        int height = screen.height * 85 / 100;
        getContentPane().setBackground(Color.DARK_GRAY);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public static void main(String[] args){
        new HomePage();
    }
}

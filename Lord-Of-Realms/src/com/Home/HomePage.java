package com.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {

    JButton PlayButton, exitButton;

    HomePage(){

        setLayout(null);

        JLabel label  = new JLabel("<-- Lords of Realm -->");
        label.setBounds(590, 100,500,30);
        label.setFont(new Font("Times New Roman",Font.BOLD,40));
        label.setForeground(Color.WHITE);
        add(label);

        PlayButton = new JButton("           PLAY            ");
        PlayButton.setBounds(645,200,300,40);
        PlayButton.setFont(new Font("GC Omega",Font.BOLD,20));
        PlayButton.addActionListener(this);
        add(PlayButton);

        exitButton = new JButton("           EXIT            ");
        exitButton.setBounds(645,270,300,40);
        exitButton.setFont(new Font("GC Omega",Font.BOLD,20));
        exitButton.addActionListener(this);
        add(exitButton);

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screen.width * 85 / 100;
        int height = screen.height * 85 / 100;
        getContentPane().setBackground(Color.DARK_GRAY);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == PlayButton){

        }
        if(e.getSource() == exitButton){
            new Login();
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new HomePage();
    }
}

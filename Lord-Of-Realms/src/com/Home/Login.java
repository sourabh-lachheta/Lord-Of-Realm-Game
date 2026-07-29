package com.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField passField1;
    JButton loginButton, signUpButton, cancelButton, guestButton;
    Login(){
        setLayout(null);


        JLabel label1 = new JLabel("USERNAME : ");
        label1.setBounds(530,300,250,30);
        label1.setFont(new Font("CG Omega",Font.BOLD,30));
        label1.setForeground(Color.WHITE);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(770,300,300,30);
        textField1.setFont(new Font("CG Omega",Font.PLAIN,19));
        add(textField1);

        JLabel label2 = new JLabel("PASSWORD :");
        label2.setBounds(530,350,250,30);
        label2.setFont(new Font("CG Omega",Font.BOLD,30));
        label2.setForeground(Color.WHITE);
        add(label2);

        passField1 = new JPasswordField();
        passField1.setBounds(770,350,300,30);
        passField1.setFont(new Font("CG Omega",Font.PLAIN,19));
        add(passField1);

        signUpButton = new JButton("sign Up");
        signUpButton.setBounds(590,420,100,30);
        signUpButton.addActionListener(this);
        add(signUpButton);

        loginButton = new JButton("login");
        loginButton.setBounds(740,420,100,30);
        loginButton.addActionListener(this);
        add(loginButton);

        cancelButton = new JButton("cancel");
        cancelButton.setBounds(890,420,100,30);
        cancelButton.addActionListener(this);
        add(cancelButton);

        guestButton = new JButton("Guest");
        guestButton.setBounds(730,480,120,30);
        guestButton.addActionListener(this);
        add(guestButton);




        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screen.width * 85 / 100;
        int height = screen.height * 85 / 100;
        getContentPane().setBackground(Color.DARK_GRAY);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == guestButton){
            new HomePage();
            setVisible(false);
        }
        if(e.getSource()==signUpButton){

        }
        if(e.getSource() == loginButton){

        }
        if(e.getSource() == cancelButton){
            System.exit(102);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}

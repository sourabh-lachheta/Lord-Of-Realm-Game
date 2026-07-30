package com.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Help extends JFrame {

    JButton b1,b2;

    Help(){

        setLayout(null);

        JTextArea realmhelp = new JTextArea();
        realmhelp.setForeground(Color.WHITE);
        realmhelp.setBackground(Color.DARK_GRAY);
        realmhelp.setBounds(590, 100,500,700);
        realmhelp.setFont(new Font("GC Omega",Font.PLAIN,20));
        add(realmhelp);

        b1 = new JButton("realm");
        b1.setBounds(100, 100, 100,30);
        add(b1);
        b1.addActionListener(e -> {
            realmhelp.setText(
                    "Human Cultivation: \n" +
                            "S.NO\tMortal Realms\tSteps\n" +
                            "----------------------------------------------------------------------------------\n"+
                            "1.\tMortal\tCommon\n" +
                            "2.\tAwakened\tBody refinement\n" +
                            "\t\tQi Condensation\n" +
                            "\t\tFoundation Establishment\n" +
                            "\t\tCore Formation\n" +
                            "\n" +
                            "3.\tMaster\tGolden Core\n" +
                            "\t\tNascent Soul\n" +
                            "\t\tSoul Transformation\n" +
                            "\t\tBody Integration\n" +
                            "\n" +
                            "4.\tRadiant Stage / Grand Master\n"+
                            "\t\tSpiritual Sea\n" +
                            "\t\tSpirit Transformation\n" +
                            "\n" +
                            "5.\tProfound Stage\n"+
                            "\t\tNine Layer\n" +
                            "\n" +
                            "6.\tTranscendent\tNine Layer\n" +
                            "\n" +
                            "7.\tSaint\tNine Layer\n" +
                            "\n" +
                            "8.\tFalse Immortal\tNine Layer\n" +
                            "\n"



            );
        });


       /* JTextArea r = new JTextArea();
        r.setForeground(Color.WHITE);
        r.setBackground(Color.DARK_GRAY);
        r.setBounds(590, 100,500,30);
        add(r);

        b2 = new JButton("r");
        b2.setBounds(100, 300, 100,30);
        add(b2);
        b2.addActionListener(e -> {
            r.setText(
                    "sourabh"
            );
        });*/





        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screen.width * 85 / 100;
        int height = screen.height * 85 / 100;
        getContentPane().setBackground(Color.DARK_GRAY);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);










    }


    public static void main(String[] args){
        new Help();
    }
}

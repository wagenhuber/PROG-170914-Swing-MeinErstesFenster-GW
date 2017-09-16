package com.sabel.MeinErstesFensterGW;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    public JButton knopf1;


    public Fenster() {
        setTitle("Mein erstes Fenster");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        knopf1 = new JButton("OK");

    }


    public Fenster(String title) {
        this();
        setTitle(title);
        knopf1.setVisible(true);
    }

}//ende klasse

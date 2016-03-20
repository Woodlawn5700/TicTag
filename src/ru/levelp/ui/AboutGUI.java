package ru.levelp.ui;



import ru.levelp.panels.AboutJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;

/**
 * Created by pavelpetrov on 19.03.16.
 */
public class AboutGUI {
    public  void about() {
        JFrame aboutFrame = new JFrame("About programm");
        JLabel nameOftheGameLabel = new JLabel("TicTog");
        JLabel versionLabel = new JLabel("Version 1.0.0");
        JLabel rightsLabel = new JLabel("All rights reserved");



        aboutFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aboutFrame.setLocationRelativeTo(null);
        aboutFrame.setSize(200,200);
        JPanel mainAboutPanel = new JPanel();

        AboutJPanel aboutJPanel = new AboutJPanel();


        aboutFrame.add(BorderLayout.NORTH,nameOftheGameLabel);
        aboutFrame.add(BorderLayout.CENTER, versionLabel);
        aboutFrame.add(BorderLayout.SOUTH, rightsLabel);
        aboutFrame.pack();
        aboutFrame.setVisible(true);
    }

}

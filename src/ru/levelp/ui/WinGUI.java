package ru.levelp.ui;

import ru.levelp.listeners.StartNewGameListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by pavelpetrov on 19.03.16.
 */
public class WinGUI {
    public static JFrame winningFrame;
    public void win(String x){
        JFrame winningFrame = new JFrame("WON");

        winningFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        winningFrame.setSize(250,250);


        JLabel winLabel = new JLabel("Congratulation " + x + " Won");
        winLabel.setFont(new Font("New Roman",Font.BOLD,16));
        JPanel wonPanel = new JPanel();
        JButton wonBtn = new JButton("OK");

        StartNewGameListener startNewGameListener =new  StartNewGameListener();
        wonBtn.addActionListener(startNewGameListener);

        wonPanel.add(wonBtn);
        winningFrame.add(BorderLayout.NORTH, winLabel);
        winningFrame.add(BorderLayout.CENTER,wonPanel);

        winningFrame.setLocationRelativeTo(null);
        winningFrame.setVisible(true);
        winningFrame.pack();

    }

}


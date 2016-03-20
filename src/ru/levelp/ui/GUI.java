package ru.levelp.ui;

import ru.levelp.listeners.AboutListener;
import ru.levelp.listeners.OnGameButtonClickListener;
import ru.levelp.listeners.QuitGameListener;
import ru.levelp.listeners.StartNewGameListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

/**
 * Created by pavelpetrov on 18.03.16.
 */
public class GUI {
    public static JButton[] buttons = new JButton[9];
    public static JFrame mainFrame;
    public void start() {
        JFrame mainFrame = new JFrame("TicTacToe");
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setBounds(100,100,300,300);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setMinimumSize(new Dimension(300,300));

        //JMenuBar, JMenu, JMenuItem

        JMenuBar bar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        JMenu settingsMenu = new JMenu("Settings");
        JMenuItem newGameMenuItem = new JMenuItem("New game");
        JMenuItem quitMenuItem = new JMenuItem("Quit");
        JMenu vieSettingsMenuItem = new JMenu("Vie settings");
        JMenuItem ruleSettingsMenuItem = new JMenuItem("Rules");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        JCheckBox darSide = new JCheckBox("Get it Dark");
        JCheckBox lightSide = new JCheckBox("Get it Light");



        settingsMenu.add(vieSettingsMenuItem);
        settingsMenu.add(ruleSettingsMenuItem);
        gameMenu.add(settingsMenu);
        gameMenu.add(newGameMenuItem);
        gameMenu.add(quitMenuItem);
        vieSettingsMenuItem.add(darSide);
        vieSettingsMenuItem.add(lightSide);
        bar.add(gameMenu);
        bar.add(helpMenu);
        helpMenu.add(aboutItem);
        mainFrame.setJMenuBar(bar);

        darSide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeItDark();
            }
        });

        lightSide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeIrBright();
            }
        });





        QuitGameListener quitGameListener = new QuitGameListener();
        quitMenuItem.addActionListener(quitGameListener);


        JPanel playGroundPanel = new JPanel();
        playGroundPanel.setLayout(new GridLayout(3,3));




        OnGameButtonClickListener gameListener = new OnGameButtonClickListener();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("");
            playGroundPanel.add(buttons[i]);
            buttons[i].addActionListener(gameListener);
        }

        StartNewGameListener startNewGameListener = new StartNewGameListener();
        newGameMenuItem.addActionListener(startNewGameListener);

        JPanel footer = new JPanel();
        JButton newGameBtn = new JButton("New Game");
        JButton exitBtn = new JButton("Quit");
        footer.add(newGameBtn);
        footer.add(exitBtn);

        newGameBtn.addActionListener(startNewGameListener);
        exitBtn.addActionListener(quitGameListener);
        AboutListener aboutListener = new AboutListener();
        aboutItem.addActionListener(aboutListener);

        mainFrame.add(BorderLayout.CENTER, playGroundPanel);
        mainFrame.add(BorderLayout.SOUTH, footer);
        mainFrame.setVisible(true);

    }
    public void makeItDark(){
       mainFrame.setBackground(Color.BLACK);

    }

    public void makeIrBright() {

        mainFrame.setBackground(Color.white);
    }


}

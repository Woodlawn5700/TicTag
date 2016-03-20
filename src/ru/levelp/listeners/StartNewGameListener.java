package ru.levelp.listeners;

import ru.levelp.ui.GUI;
import ru.levelp.ui.WinGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by pavelpetrov on 19.03.16.
 */
public class StartNewGameListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < GUI.buttons.length; i ++) {
            GUI.buttons[i].setText("");
        }
//        WinGUI.winningFrame.dispose();
    }
}

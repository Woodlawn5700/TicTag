package ru.levelp.listeners;

import ru.levelp.ui.AboutGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pavelpetrov on 19.03.16.
 */
public class AboutListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new AboutGUI().about();
    }
}

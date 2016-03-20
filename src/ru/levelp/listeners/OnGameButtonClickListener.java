package ru.levelp.listeners;

import ru.levelp.ui.GUI;
import ru.levelp.ui.WinGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pavelpetrov on 18.03.16.
 */
public class OnGameButtonClickListener implements ActionListener {
   private boolean isX = true;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton)e.getSource();
        if (source.getText().isEmpty()) {
            if (isX == true) {
                source.setText("X");
                isX = !isX;
            } else {
                source.setText("0");
                isX = !isX;
            }
            if ((GUI.buttons[0].getText().equals("X") && GUI.buttons[1].getText().equals("X") &&
                    GUI.buttons[2].getText().equals("X"))
                    || (GUI.buttons[2].getText().equals("X") && GUI.buttons[5].getText().equals("X") &&
                    GUI.buttons[8].getText().equals("X"))
                    || (GUI.buttons[6].getText().equals("X") && GUI.buttons[7].getText().equals("X") &&
                    GUI.buttons[8].getText().equals("X"))
                    || (GUI.buttons[0].getText().equals("X") && GUI.buttons[3].getText().equals("X") &&
                    GUI.buttons[6].getText().equals("X"))
                    || (GUI.buttons[0].getText().equals("X") && GUI.buttons[4].getText().equals("X") &&
                    GUI.buttons[8].getText().equals("X"))
                    || (GUI.buttons[6].getText().equals("X") && GUI.buttons[4].getText().equals("X") &&
                    GUI.buttons[2].getText().equals("X"))
                    || (GUI.buttons[1].getText().equals("X") && GUI.buttons[4].getText().equals("X") &&
                    GUI.buttons[7].getText().equals("X"))
                    || (GUI.buttons[3].getText().equals("X") && GUI.buttons[4].getText().equals("X") &&
                    GUI.buttons[5].getText().equals("X"))) {
                new WinGUI().win("X");
            }
            if ((GUI.buttons[0].getText().equals("0") && GUI.buttons[1].getText().equals("0") &&
                    GUI.buttons[2].getText().equals("0"))
                    || (GUI.buttons[2].getText().equals("0") && GUI.buttons[5].getText().equals("0") &&
                    GUI.buttons[8].getText().equals("0"))
                    || (GUI.buttons[6].getText().equals("0") && GUI.buttons[7].getText().equals("0") &&
                    GUI.buttons[8].getText().equals("0"))
                    || (GUI.buttons[0].getText().equals("0") && GUI.buttons[3].getText().equals("0") &&
                    GUI.buttons[6].getText().equals("0"))
                    || (GUI.buttons[0].getText().equals("0") && GUI.buttons[4].getText().equals("0") &&
                    GUI.buttons[8].getText().equals("0"))
                    || (GUI.buttons[6].getText().equals("0") && GUI.buttons[4].getText().equals("0") &&
                    GUI.buttons[2].getText().equals("0"))
                    || (GUI.buttons[1].getText().equals("0") && GUI.buttons[4].getText().equals("0") &&
                    GUI.buttons[7].getText().equals("0"))
                    || (GUI.buttons[3].getText().equals("0") && GUI.buttons[4].getText().equals("0") &&
                    GUI.buttons[5].getText().equals("0"))) {
                new WinGUI().win("0");
            }
        }
    }
}

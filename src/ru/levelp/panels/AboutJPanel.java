package ru.levelp.panels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by pavelpetrov on 19.03.16.
 */
public class AboutJPanel extends JPanel{
    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        Image image = new ImageIcon("1.jpg").getImage();
        g.drawImage(image,2,4,this);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labre_trescalle;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author HERNANFA
 */
public class MyIcon implements Icon{

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
         Image image = new ImageIcon(getClass().getResource("/imagenes/starwars.png")).getImage();
        g.drawImage(image, x, y, c);
    }

    @Override
    public int getIconWidth() {
         return 50;
    }

    @Override
    public int getIconHeight() {
         return 50;
    }
    
}

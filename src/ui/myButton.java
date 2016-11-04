/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;

/**
 *
 * @author morteza
 */
public class myButton extends JButton {

    public myButton(){
        change();
    }
    private float opicity = (float) 0.1;

//    @Override
//    public void paint(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g.create();
//        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, getOpicity()));
//        super.paint(g2);
//        g2.dispose();
//
//    }

    /**
     * @return the opicity
     */
    public float getOpicity() {
        return opicity;
    }

    /**
     * @param opicity the opicity to set
     */
    public void setOpicity(float opicity) {
        this.opicity = opicity;
    }

    public void change() {
        this.setOpaque(false);
        this.setContentAreaFilled(false);

    }
}

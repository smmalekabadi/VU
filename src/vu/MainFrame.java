/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author morteza
 */
public class MainFrame extends JFrame{

    private static MainFrame instance;

    private MainFrame() {

    }

    public static synchronized MainFrame getInstance() {

        if (instance == null) {
            instance = new MainFrame();
        }
        return instance;

    }
    public void setPanel(JPanel jPanel){
    
    this.add(jPanel);
    
    }
}

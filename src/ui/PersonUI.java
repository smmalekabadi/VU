/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author morteza
 */
public class PersonUI extends JPanel {

    private myButton exit;
    private myButton setting;
    private myLabel welcome;
    private String name;
    double width;
    double height;
    
    Image bgimg;

    public PersonUI(String name) {
        
        this.name= name;
        
        setLayout(null);
        MediaTracker mt = new MediaTracker(this);
        bgimg = Toolkit.getDefaultToolkit().getImage("//home//morteza//NetBeansProjects//vu//pictures//background4.jpg");
        mt.addImage(bgimg, 0);
        try {
            mt.waitForAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getScreenSize();
        settingElement();
        
    }

    public void getScreenSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
    }

    public void settingElement() {
        welcome = new myLabel();
        exit = new myButton();
        setting = new myButton();
        
        welcome.setText("Welcome "+name);
        welcome.setLocation((int)width/10, (int)height/36);
        welcome.setFont(new Font("Serif", Font.PLAIN, 36));
        welcome.setSize(450, 100);
        
       
        exit.setSize(48, 48);
        exit.setLocation((int)width-220, (int)height/14);
        exit.setIcon(new ImageIcon("//home//morteza//NetBeansProjects//vu//pictures//exit3.png"));
        exit.setBorder(null);
        
        setting.setSize(48, 48);
        setting.setLocation((int)width-150, (int)height/14);
        setting.setIcon(new ImageIcon("//home//morteza//NetBeansProjects//vu//pictures//settings-icon.png"));
        setting.setBorder(null);
        
        add(welcome);
        add(exit);
        add(setting);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imwidth = bgimg.getWidth(null);
        int imheight = bgimg.getHeight(null);
        g.drawImage(bgimg, 1, 1, null);

    }
    public JPanel getPanel(){
    
    return this;
    }
}

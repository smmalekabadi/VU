/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author morteza
 */
public class SettingUI extends JPanel {

    private myTextField name;
    private myTextField username;
    private myTextField password;
    private myTextField email;
    private String username1;
    Image bgimg;
    double width;
    double height;

    public SettingUI(String username1) {
        this.username1= username1;
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

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imwidth = bgimg.getWidth(null);
        int imheight = bgimg.getHeight(null);
        g.drawImage(bgimg, 1, 1, null);

    }

    public void getScreenSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
    }

    public void settingElement() {
        name = new myTextField();
        username = new myTextField();
        password = new myTextField();
        email = new myTextField();
        
        name.setText("new name");
        name.setLocation((int) (width / 2.5) - 15, (int) height / 5);
        name.setSize(350, 35);
        
        username.setText("new username");
        username.setLocation((int) (width / 2.5) - 15, (int) (height / 3.8));
        username.setSize(350, 35);
        
        password.setText("new password");
        password.setLocation((int) (width / 2.5) - 15, (int) height / 3);
        password.setSize(350, 35);
        
        email.setText("new email");
        email.setLocation((int) (width / 2.5) - 15, (int) (height / 2.5));
        email.setSize(350, 35);
        
        add(name);
        add(username);
        add(password);
        add(email);

    }

}

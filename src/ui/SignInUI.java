/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author morteza
 */
public class SignInUI extends JPanel {

    private myTextField username;
    private myPasswordField password;
    private myButton submit;
    private myButton signUp;
    private myLabel virtualUniversity;
    Image bgimg;
    double width;
    double height;

    public SignInUI() {
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
        new test().setpanel(this);
    }

    public void settingElement() {
        username = new myTextField();
        password = new myPasswordField();
        submit = new myButton();
        signUp = new myButton();
        virtualUniversity = new myLabel();
        
        
        virtualUniversity.setText("Virtual University");
        virtualUniversity.setLocation((int) width / 2 - 220, (int) height / 2 - 200);
        virtualUniversity.setSize(450, 100);
        virtualUniversity.setFont(new Font("Serif", Font.PLAIN, 48));

        signUp.setText("sign up");
        signUp.setLocation((int) width / 2 - 150, (int) height / 2 + 50);
        signUp.setSize(300, 35);

        submit.setText("sign in");
        submit.setLocation((int) width / 2 - 150, (int) height / 2);
        submit.setSize(300, 35);

        password.setText("password");
        password.setLocation((int) width / 2 - 150, (int) height / 2 - 50);
        password.setSize(300, 35);
        password.setBorder(BorderFactory.createCompoundBorder(password.getBorder(), BorderFactory.createEmptyBorder(5, 8, 5, 5)));

        username.setText("username");
        username.setLocation((int) width / 2 - 150, (int) height / 2 - 100);
        username.setSize(300, 35);
        username.setBorder(BorderFactory.createCompoundBorder(username.getBorder(), BorderFactory.createEmptyBorder(5, 8, 5, 5)));

        this.add(virtualUniversity);
        this.add(signUp);
        this.add(submit);
        this.add(username);
        this.add(password);
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


}

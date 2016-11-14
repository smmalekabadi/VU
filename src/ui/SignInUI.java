/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.Contoller;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import startPage.SignIn;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class SignInUI extends JPanel {

    private myTextField username;
    private myPasswordField password;
    private myButton signIn;
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

    }

    public void settingElement() {
        username = new myTextField();
        password = new myPasswordField();
        signIn = new myButton();
        signUp = new myButton();
        virtualUniversity = new myLabel();

        virtualUniversity.setText("Virtual University");
        virtualUniversity.setLocation((int) width / 2 - 220, (int) height / 2 - 200);
        virtualUniversity.setSize(450, 100);
        virtualUniversity.setFont(new Font("Serif", Font.PLAIN, 48));

        password.setText("password");
        password.setLocation((int) width / 2 - 150, (int) height / 2 - 50);
        password.setSize(300, 35);
        password.setBorder(BorderFactory.createCompoundBorder(password.getBorder(), BorderFactory.createEmptyBorder(5, 8, 5, 5)));

        username.setText("username");
        username.setLocation((int) width / 2 - 150, (int) height / 2 - 100);
        username.setSize(300, 35);
        username.setBorder(BorderFactory.createCompoundBorder(username.getBorder(), BorderFactory.createEmptyBorder(5, 8, 5, 5)));

        signUp.setText("sign up");
        signUp.setLocation((int) width / 2 - 150, (int) height / 2 + 50);
        signUp.setSize(300, 35);
        signUp.addMouseListener(new Controller());
        signUp.setName("signUp");

        signIn.setText("sign in");
        signIn.setLocation((int) width / 2 - 150, (int) height / 2);
        signIn.setSize(300, 35);
        signIn.setName("signIn");
        signIn.addMouseListener(new Controller());

        this.add(virtualUniversity);
        this.add(signUp);
        this.add(signIn);
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

    public String getUsername() {

        return username.getText();
    }

    public String getPassword() {

        return password.getText();
    }

    public void visibel() {
        this.setVisible(false);
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getComponent().getName().equals("signIn")) {
                SignIn.scan();
            } else {
                visibel();
                MainFrame.getInstance().getContentPane().removeAll();
                MainFrame.getInstance().getContentPane().add(new SignUpUI());

            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }

}

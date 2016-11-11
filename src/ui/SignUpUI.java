/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import startPage.SignIn;
import startPage.SignUp;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class SignUpUI extends JPanel {

    private myTextField name;
    private myTextField username;
    private myTextField email;
    private myPasswordField password;
    private myLabel virtualUniversity;
    private myButton signUp;

    Image bgimg;
    double width;
    double height;

    public SignUpUI() {
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
        email = new myTextField();
        password = new myPasswordField();
        signUp = new myButton();
        virtualUniversity = new myLabel();

        virtualUniversity.setText("Virtual University");
        virtualUniversity.setLocation((int) width / 2 - 220, (int) height / 2 - 200);
        virtualUniversity.setSize(450, 100);
        virtualUniversity.setFont(new Font("Serif", Font.PLAIN, 48));

        name.setText("NAME");
        name.setLocation((int) width / 2 - 150, (int) height / 2 - 100);
        name.setSize(300, 35);
        name.setBorder(BorderFactory.createCompoundBorder(name.getBorder(), BorderFactory.createEmptyBorder(5, 8, 5, 5)));

        username.setText("USERNAME");
        username.setLocation((int) width / 2 - 150, (int) height / 2 - 50);
        username.setSize(300, 35);
        username.setBorder(BorderFactory.createCompoundBorder(username.getBorder(), BorderFactory.createEmptyBorder(5, 8, 5, 5)));

        password.setText("PASSWORD");
        password.setLocation((int) width / 2 - 150, (int) height / 2);
        password.setSize(300, 35);
        password.setBorder(BorderFactory.createCompoundBorder(password.getBorder(), BorderFactory.createEmptyBorder(5, 8, 5, 5)));

        email.setText("EMAIL@email");
        email.setLocation((int) width / 2 - 150, (int) height / 2 + 50);
        email.setSize(300, 35);
        email.setBorder(BorderFactory.createCompoundBorder(email.getBorder(), BorderFactory.createEmptyBorder(5, 8, 5, 5)));

        signUp.setText("sign up");
        signUp.setLocation((int) width / 2 - 150, (int) height / 2 + 100);
        signUp.setSize(300, 35);
        signUp.addMouseListener(new Controller());

        add(virtualUniversity);
        add(name);
        add(username);
        add(password);
        add(email);
        add(signUp);

    }

    public String getUsername() {

        return username.getText();
    }

    public String getPassword() {

        return password.getText();
    }

    public String getName() {

        return name.getText();
    }

    public String getEmail() {

        return email.getText();
    }

    public void visibel() {
        this.setVisible(false);
    }

    public SignUpUI getSignUpUI() {

        return this;
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            SignUp.scan(getSignUpUI());
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

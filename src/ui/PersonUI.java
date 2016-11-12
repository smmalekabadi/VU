/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

import course.Course;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import startPage.SignIn;
import vu.MainFrame;

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

    public PersonUI(String username) {

        this.name = username;

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

        welcome.setText("Welcome " + name);
        welcome.setLocation((int) width / 10, (int) height / 36);
        welcome.setFont(new Font("Serif", Font.PLAIN, 36));
        welcome.setSize(450, 100);

        exit.setSize(48, 48);
        exit.setLocation((int) width - 220, (int) height / 14);
        exit.setIcon(new ImageIcon("//home//morteza//NetBeansProjects//vu//pictures//exit3.png"));
        exit.setBorder(null);
        exit.addMouseListener(new Controller());
        exit.setName("exit");

        setting.setSize(48, 48);
        setting.setLocation((int) width - 150, (int) height / 14);
        setting.setIcon(new ImageIcon("//home//morteza//NetBeansProjects//vu//pictures//settings-icon.png"));
        setting.setBorder(null);
        setting.addMouseListener(new Controller());
        setting.setName("Setting");
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

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().getName().equals("exit")) {
                SignIn si = new SignIn();
                MainFrame.getInstance().getContentPane().removeAll();
                MainFrame.getInstance().getContentPane().add(si.getSignInUI());
                MainFrame.getInstance().getContentPane().validate();
                MainFrame.getInstance().getContentPane().invalidate();
                MainFrame.getInstance().getContentPane().repaint();
            } else if (e.getComponent().getName().equals("setting")) {
                MainFrame.getInstance().getContentPane().removeAll();
                //MainFrame.getInstance().getContentPane().add(new SettingUI());
                MainFrame.getInstance().getContentPane().validate();
                MainFrame.getInstance().getContentPane().invalidate();
                MainFrame.getInstance().getContentPane().repaint();
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

//    public JPanel getPanel(){
//    
//    return this;
//    }
}

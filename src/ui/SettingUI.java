/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import file.RWonFile;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import startPage.SignIn;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class SettingUI extends JPanel {

    private myTextField name;
    private myTextField username;
    private myTextField password;
    private myTextField email;
    private myButton save;
    private String username1;
    Image bgimg;
    double width;
    double height;

    public SettingUI(String username1) throws Exception {
        this.username1 = username1;
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
        settingElement(RWonFile.getOneLine(username1));

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

    public void settingElement(String[] myInfo) {
        name = new myTextField();
        username = new myTextField();
        password = new myTextField();
        email = new myTextField();
        save = new myButton();

        name.setText(myInfo[0]);
        name.setLocation((int) (width / 2.5) - 15, (int) height / 5);
        name.setSize(350, 35);

        username.setText(myInfo[1]);
        username.setLocation((int) (width / 2.5) - 15, (int) (height / 3.8));
        username.setSize(350, 35);

        password.setText(myInfo[2]);
        password.setLocation((int) (width / 2.5) - 15, (int) height / 3);
        password.setSize(350, 35);

        email.setText(myInfo[3]);
        email.setLocation((int) (width / 2.5) - 15, (int) (height / 2.5));
        email.setSize(350, 35);

        save.setText("save");
        save.setSize(350, 35);
        save.setLocation((int) (width / 2.5) - 15, (int) (height / 2.2));
        save.setName("save");
        save.addMouseListener(new Controller());
        
        add(name);
        add(username);
        add(password);
        add(email);
        add(save);
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().getName().equals("save")) {
                try {
                    System.out.println(RWonFile.ReadFromfile("filename.txt").get(0));
                    RWonFile.deleteLine(username1);
                    RWonFile.appendOnFile(name.getText()+ "#" + username.getText()+ "#" + password.getText()+ "#" + email.getText(), "filename.txt");
                } catch (Exception ex) {
                    Logger.getLogger(SettingUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                SignIn si = new SignIn();
                MainFrame.getInstance().getContentPane().removeAll();
                MainFrame.getInstance().getContentPane().add(si.getSignInUI());
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

}

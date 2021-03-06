/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Course;
import course.CourseObj;
import course.Exercise;
import course.Newsfeed;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import save.Save;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class CourseObjUI extends JPanel {

    private String name;
    private myLabel CourseObjName;
    private myButton back;
    double width;
    double height;
    Image bgimg;
    private CourseObj courseObj;
    public CourseObjUI(String name,CourseObj courseObj) {
        this.name = name;
        this.courseObj=courseObj;
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

        CourseObjName = new myLabel();
        back = new myButton();

        CourseObjName.setText(getName());
        CourseObjName.setLocation((int) width / 10, (int) height / 36);
        CourseObjName.setFont(new Font("Serif", Font.PLAIN, 36));
        CourseObjName.setSize(450, 100);

        back.setSize(48, 48);
        back.setLocation((int) width - 220, (int) height / 14);
        back.setIcon(new ImageIcon("//home//morteza//NetBeansProjects//vu//pictures//back.png"));
        back.setBorder(null);
        back.setName("back");
        back.addMouseListener(new Controller());

        add(CourseObjName);
        add(back);

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imwidth = bgimg.getWidth(null);
        int imheight = bgimg.getHeight(null);
        g.drawImage(bgimg, 1, 1, null);

    }

    public JPanel getPanel() {

        return this;
    }
//-------------------------------------------------------------------------------

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the courseObj
     */
    public CourseObj getCourseObj() {
        return courseObj;
    }

    /**
     * @param courseObj the courseObj to set
     */
    public void setCourseObj(CourseObj courseObj) {
        this.courseObj = courseObj;
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().getName().equals("back")) {
                MainFrame.getInstance().getContentPane().removeAll();
                Save.getWhoIsIn().getPersonUI().update();
                MainFrame.getInstance().getContentPane().add(Save.getWhoIsIn().getPersonUI());
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

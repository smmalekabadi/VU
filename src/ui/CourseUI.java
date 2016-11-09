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
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author morteza
 */
public class CourseUI extends JPanel {

    private myButton back;
    private myLabel courseName;
    private String name;
    double width;
    double height;

    Image bgimg;

    public CourseUI(String name) {
        this.name = name;
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
        courseName = new myLabel();
        back = new myButton();

        courseName.setText("Welcome " + getName());
        courseName.setLocation((int) width / 10, (int) height / 36);
        courseName.setFont(new Font("Serif", Font.PLAIN, 36));
        courseName.setSize(450, 100);

        back.setSize(48, 48);
        back.setLocation((int) width - 220, (int) height / 14);
        back.setIcon(new ImageIcon("//home//morteza//NetBeansProjects//vu//pictures//back.png"));
        back.setBorder(null);
        add(courseName);
        add(back);
        
    }
    public void showNewsfeedExercise(Course course){
        myList myNewsfeedExercise = new myList();
        ArrayList<CourseObj> courseobj = new ArrayList<CourseObj>();
        
            for (Exercise ex : course.getCourseExercise()) {
                courseobj.add(ex);
            }
            for (Newsfeed newsfeed : course.getCourseNewsFeed()) {
                courseobj.add(newsfeed);
            

        }
        myNewsfeedExercise.setListData(courseobj.toArray());
        myNewsfeedExercise.setLocation((int) (width / (1.8)), (int) (height / 4));
        myNewsfeedExercise.setSize(500, 500);

        add(myNewsfeedExercise);

    
    
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
}

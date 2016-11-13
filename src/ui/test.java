/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Course;
import course.Exercise;
import course.Newsfeed;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author morteza
 */
public class test extends JFrame {

    public test() {

    }
    static ArrayList<Course> c = null;

    public static void main(String[] args) {
//
//        c = new ArrayList<Course>();
//        //Course cc = new Course("asda");
//        Exercise exercis = new Exercise("asdasd", "sadasd", new Date(2014, 1, 20));
//        SettingUI te= new SettingUI("mort");
//        
//        
//        
//        test t;
//        t = new test();
//        t.setpanel(te);
//        t.setDefaultCloseOperation(3);
//        t.setVisible(true);
//        t.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void setpanel(JPanel jPanel) {
        add(jPanel);
    }

    public void add() {
        //Course c1 = new Course("dasd");
        //c.add(c1);
    }
}

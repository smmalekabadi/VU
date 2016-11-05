/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
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

    public static void main(String[] args) {
        test t;
        t = new test();
        StudentUI s=new StudentUI("morteza","sda");
        s.lixti();
        t.getpanel(s);
        
        t.setDefaultCloseOperation(3);
        t.setVisible(true);
        t.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void getpanel(JPanel jPanel) {
        add(jPanel);
    }
}

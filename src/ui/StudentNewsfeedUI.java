/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Newsfeed;
import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author morteza
 */
public class StudentNewsfeedUI extends CourseObjUI {

    private myLabel name;
    private myLabel description;
    private Newsfeed newsfeed;

    public StudentNewsfeedUI(String name, Newsfeed newsfeed) {
        super(name,newsfeed);
        this.newsfeed = newsfeed;
        setElement();
    }

    public void setElement() {

        name.setText(newsfeed.getName());
        name.setSize(350, 35);
        name.setLocation((int) (width / 2.5) - 15, (int) height / 5);
        name.setBorder(new LineBorder(Color.gray));

        description.setText(newsfeed.getDescription());
        description.setLocation((int) (width / 2.5) - 15, (int) (height / 3.5));
        description.setSize(350, 105);
        description.setBorder(new LineBorder(Color.gray));
        add(name);
        add(description);

    }
}

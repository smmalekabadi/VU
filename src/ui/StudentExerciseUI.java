/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Exercise;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author morteza
 */
public class StudentExerciseUI extends CourseObjUI {

    private myLabel name;
    private myLabel description;
    private myLabel date;
    private myTextField path;
    private myButton browse;
    private myButton send;
    private Exercise exercise;

    public StudentExerciseUI(String name, Exercise exercise) {
        super(name);
        this.exercise = exercise;
    }

    public void setElement() {
        name = new myLabel();
        description = new myLabel();
        date = new myLabel();
        path = new myTextField();
        browse = new myButton();
        send = new myButton();

        name.setText(exercise.getName());
        name.setSize(350, 35);
        name.setLocation((int) (width / 2.5) - 15, (int) height / 5);
        name.setBorder(new LineBorder(Color.gray));

        description.setText(exercise.getDescription());
        description.setLocation((int) (width / 2.5) - 15, (int) (height / 3.5));
        description.setSize(350, 105);
        description.setBorder(new LineBorder(Color.gray));

        date.setText(exercise.getDate().toString());
        date.setLocation((int) (width / 2.5) - 15, (int) (height / 2.2));
        date.setSize(350, 35);
        date.setBorder(new LineBorder(Color.gray));

        path.setSize(350, 35);
        path.setLocation((int) (width / 2.5) - 15, (int) (height / 1.9));

        browse.setText("browse");
        browse.setLocation((int) (width / 2.5) - 15, (int) (height / 1.7));
        browse.setSize(350, 35);

        send.setText("send");
        send.setLocation((int) (width / 2.5) - 15, (int) (height / 1.6));
        send.setSize(350, 35);

        add(name);
        add(description);
        add(date);
        add(path);
        add(browse);
        add(send);
    }
}

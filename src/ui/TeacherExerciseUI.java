/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Exercise;
import file.RWonFile;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import startPage.SignIn;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class TeacherExerciseUI extends CourseObjUI {

    private myTextField name;
    private myTextField description;
    private myTextField date;
    private myButton save;
    private Exercise exercise;

    public TeacherExerciseUI(String name, Exercise exercise) {
        super(name,exercise);
        this.exercise = exercise;
        setElement();
    }

    public void setElement() {
        name = new myTextField();
        description = new myTextField();
        date = new myTextField();
        save = new myButton();

        name.setText(exercise.getName());
        name.setSize(350, 35);
        name.setLocation((int) (width / 2.5) - 15, (int) height / 5);

        description.setText(exercise.getDescription());
        description.setLocation((int) (width / 2.5) - 15, (int) (height / 3.5));
        description.setSize(350, 105);

        date.setText(exercise.getDate().toString());
        date.setLocation((int) (width / 2.5) - 15, (int) (height / 2.2));
        date.setSize(350, 35);

        save.setText("Save");
        save.setSize(350, 35);
        save.setLocation((int) (width / 2.5) - 15, (int) (height / 1.8));
        save.setName("save");
        save.addMouseListener(new Controller());
        
        add(name);
        add(description);
        add(date);
        add(save);
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().getName().equals("save")) {
                exercise.setName(name.getText());
                exercise.setDescription(description.getText());
                getCourseObj().getCourse().setOneCourseExercise(exercise);
                JOptionPane.showMessageDialog(null,"exercise saved");
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

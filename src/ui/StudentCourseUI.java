/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Course;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import users.Student;

/**
 *
 * @author morteza
 */
public class StudentCourseUI extends CourseUI {

    private myButton joinTheCourse;

    public StudentCourseUI(String name, Course course) {
        super(name, course);
    }

    public void setElement() {
        joinTheCourse = new myButton();

        joinTheCourse.setText("join");
        joinTheCourse.setLocation((int) (width / (2.5)), (int) (height / 1.2));
        joinTheCourse.setSize(300, 35);
        joinTheCourse.addMouseListener(new Controller());
        add(joinTheCourse);
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().getName().equals("jj")) {
                Student s = (Student) save.Save.getWhoIsIn();
                s.setOneCourse(course);
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

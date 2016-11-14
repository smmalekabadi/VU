/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Course;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import save.Save;

/**
 *
 * @author morteza
 */
public class TeacherCourseUI extends CourseUI {

    private myTextField studentName;
    private myButton addStudent;
    private myButton removeStudent;

    public TeacherCourseUI(String name, Course course) {
        super(name, course);
        setElement();
    }

    public void setElement() {
        studentName = new myTextField();
        addStudent = new myButton();
        removeStudent = new myButton();

        studentName.setSize(300, 35);
        studentName.setLocation((int) (width / (4)), (int) (height / 1.2));

        addStudent.setSize(100, 35);
        addStudent.setLocation((int) (width / (2)), (int) (height / 1.2));
        addStudent.setText("Add");
        addStudent.setName("add");
        removeStudent.setText("Remove");
        removeStudent.setLocation((int) (width / (1.7)), (int) (height / 1.2));
        removeStudent.setSize(100, 35);
        removeStudent.setName("remove");
        add(studentName);
        add(addStudent);
        add(removeStudent);
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().getName().equals("add")) {
                for (int i = 0; i < Save.getAllStudent().size(); i++) {
                    if (Save.getAllStudent().get(i).getUsername().equals(studentName)) {
                        Save.getAllStudent().get(i).setOneCourse(getCourse());
                        JOptionPane.showInputDialog("Student added ");
                    }
                }
            } else if (e.getComponent().getName().equals("remove")) {
                for (int i = 0; i < Save.getAllStudent().size(); i++) {
                    if (Save.getAllStudent().get(i).getUsername().equals(studentName)) {
                        Save.getAllStudent().get(i).getMyCourse().remove(getCourse());
                        JOptionPane.showInputDialog("Student remove");
                    }
                    
                }
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

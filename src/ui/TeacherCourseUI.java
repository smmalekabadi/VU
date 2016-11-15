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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import javax.swing.JOptionPane;
import save.Save;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class TeacherCourseUI extends CourseUI {

    private myTextField studentName;
    private myButton addStudent;
    private myButton removeStudent;
    private myButton createExercise;
    private myButton createNewsfeed;

    public TeacherCourseUI(String name, Course course) {
        super(name, course);
        setElement();
    }

    public void setElement() {
        studentName = new myTextField();
        addStudent = new myButton();
        removeStudent = new myButton();
        createExercise = new myButton();
        createNewsfeed = new myButton();

        studentName.setSize(300, 35);
        studentName.setLocation((int) (width / (4)), (int) (height / 1.2));

        addStudent.setSize(100, 35);
        addStudent.setLocation((int) (width / (2)), (int) (height / 1.2));
        addStudent.setText("Add");
        addStudent.setName("add");
        addStudent.addMouseListener(new Controller());

        removeStudent.setText("Remove");
        removeStudent.setLocation((int) (width / (1.7)), (int) (height / 1.2));
        removeStudent.setSize(100, 35);
        removeStudent.setName("remove");
        removeStudent.addMouseListener(new Controller());

        createExercise.setText("Create Exercise");
        createExercise.setLocation((int) (width / (1.5)), (int) (height / 1.2));
        createExercise.setSize(200, 35);
        createExercise.setName("createExercise");
        createExercise.addMouseListener(new Controller());

        createNewsfeed.setText("Create newsfeed");
        createNewsfeed.setLocation((int) (width / (1.2)), (int) (height / 1.2));
        createNewsfeed.setSize(200, 35);
        createNewsfeed.setName("createNewsfeed");
        createNewsfeed.addMouseListener(new Controller());

        add(studentName);
        add(addStudent);
        add(removeStudent);
        add(createExercise);
        add(createNewsfeed);
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

//            for (int i = 0; i < Save.getAllStudent().size(); i++) {
//                System.out.println(Save.getAllStudent().get(i).getUsername());
//            }
            if (e.getComponent().getName().equals("add")) {
                for (int i = 0; i < Save.getAllStudent().size(); i++) {
                    if (Save.getAllStudent().get(i).getUsername().equals(studentName.getText())) {
                        Save.getAllStudent().get(i).setOneCourse(getCourse());
                      //  System.out.println(Save.getAllStudent().get(i).getMyCourse());
                        JOptionPane.showMessageDialog(null, "added succesfully");
                        

                    }
                }
            } else if (e.getComponent().getName().equals("remove")) {
                for (int i = 0; i < Save.getAllStudent().size(); i++) {
                    if (Save.getAllStudent().get(i).getUsername().equals(studentName.getText())) {
                        JOptionPane.showMessageDialog(null, "removed succesfully");
                        Save.getAllStudent().get(i).getMyCourse().remove(getCourse());

                    }

                }
            } else if (e.getComponent().getName().equals("createNewsfeed")) {
                Newsfeed nf = new Newsfeed("topic", "description", CourseObj.TEACHER_CODE);
                MainFrame.getInstance().getContentPane().removeAll();
                MainFrame.getInstance().getContentPane().add(nf.getCourseObjUI());
                MainFrame.getInstance().getContentPane().validate();
                MainFrame.getInstance().getContentPane().invalidate();
                MainFrame.getInstance().getContentPane().repaint();

            } else if (e.getComponent().getName().equals("createExercise")) {
                Exercise ex = new Exercise("name", "description", new Date(2015, 2, 2), CourseObj.TEACHER_CODE);
                MainFrame.getInstance().getContentPane().removeAll();
                MainFrame.getInstance().getContentPane().add(ex.getCourseObjUI());
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

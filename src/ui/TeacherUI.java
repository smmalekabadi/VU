/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Course;
import course.Exercise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import save.Save;
import startPage.SignUp;
import users.Teacher;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class TeacherUI extends PersonUI {

    private myButton createCourse;
    private Teacher teacher;

    public TeacherUI(String username, Teacher teacher) {
        super(username);
        this.teacher = teacher;
        setElement();
        showMyCourse(teacher.getMyCourses());
        showStudentExecrcise(teacher.getMyCourses());
    }

    public void setElement() {
        createCourse = new myButton();
        createCourse.setName("cc");
        createCourse.setSize(300, 35);
        createCourse.setLocation((int) (width / (2.5)), (int) (height / 1.4));
        createCourse.setText("create new course");
        createCourse.addMouseListener(new Controller());

        add(createCourse);
    }

    public void showStudentExecrcise(ArrayList<Course> myCourse) {
        if (myCourse != null && myCourse.isEmpty()) {
            ArrayList<File> files = new ArrayList<>();
            for (Course course : myCourse) {
                for (Exercise Exercise : course.getCourseExercise()) {
                    for (File uploadedFile : Exercise.getUploadedExecise()) {
                        files.add(uploadedFile);
                    }
                }

            }
            myList studentExe = new myList();
            studentExe.setListData(files.toArray());
            studentExe.setSize(500, 300);
            studentExe.setLocation((int) (width / (12)), (int) (height / 4));
            studentExe.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {

                }
            });

            add(studentExe);
        }
    }

    public void showMyCourse(ArrayList<Course> course) {

        if (course != null && !course.isEmpty()) {

            myList myCourse = new myList();
            myCourse.setListData(course.toArray());
            myCourse.setLocation((int) ((int) width / (1.8)), (int) (height / 4));
            myCourse.setSize(500, 300);
            myCourse.setName("myCourse");
            add(new JScrollPane(myCourse));
            myCourse.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {

                    String s = myCourse.getSelectedValue().toString();
                    for (Course c : teacher.getMyCourses()) {
                        if (c.getCourseName().equals(s)) {
                            MainFrame.getInstance().getContentPane().removeAll();
                            MainFrame.getInstance().getContentPane().add(c.getCourseUI());
                            MainFrame.getInstance().getContentPane().validate();
                            MainFrame.getInstance().getContentPane().invalidate();
                            MainFrame.getInstance().getContentPane().repaint();
                        }
                    }
                }

            });
            
            add(myCourse);
            MainFrame.getInstance().validate();
            MainFrame.getInstance().invalidate();
            MainFrame.getInstance().repaint();
        }
    }

    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().getName().equals("cc")) {
                String name = JOptionPane.showInputDialog("enter the course name");
                Course c = new Course(name, Course.TEACHER_CODE);
                teacher.setOneCourse(c);
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

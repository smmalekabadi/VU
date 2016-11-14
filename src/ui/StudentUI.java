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
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import users.Student;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class StudentUI extends PersonUI {

    Student student;

    public StudentUI(String username, Student student) {
        super(username);
        this.student = student;
        update();

    }

    public void update() {

        showCourses();
        showNewseedExercise();
    }

    public void showCourses() {
        ArrayList<Course> course = student.getMyCourse();
        if (course != null && course.isEmpty()) {
            myList myCourse = new myList();
            myCourse.setListData(course.toArray());
            myCourse.setLocation((int) ((int) width / (1.8)), (int) (height / 4));
            myCourse.setSize(500, 500);
            myCourse.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    String s = myCourse.getSelectedValue().toString();
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getCourseName().equals(s)) {
                            System.out.println("slm");
                            MainFrame.getInstance().getContentPane().removeAll();
                            MainFrame.getInstance().getContentPane().add(course.get(i).getCourseUI());
                            MainFrame.getInstance().getContentPane().validate();
                            MainFrame.getInstance().getContentPane().invalidate();
                            MainFrame.getInstance().getContentPane().repaint();
                        }
                    }
                }
            });

            add(myCourse);
            MainFrame.getInstance().getContentPane().validate();
            MainFrame.getInstance().getContentPane().invalidate();
            MainFrame.getInstance().getContentPane().repaint();
        }
    }

    public void showNewseedExercise() {
        ArrayList<Course> course=student.getMyCourse();
        if (course != null && course.isEmpty()) {
            myList myNewsfeedExercise = new myList();
            ArrayList<CourseObj> courseobj = new ArrayList<CourseObj>();
            for (Course course1 : course) {
                for (Exercise ex : course1.getCourseExercise()) {
                    courseobj.add(ex);
                }
                for (Newsfeed newsfeed : course1.getCourseNewsFeed()) {
                    courseobj.add(newsfeed);
                }

            }
            myNewsfeedExercise.setListData(courseobj.toArray());
            myNewsfeedExercise.setLocation((int) ((int) width / (12)), (int) (height / 4));
            myNewsfeedExercise.setSize(500, 500);
            myNewsfeedExercise.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    String s = myNewsfeedExercise.getSelectedValue().toString();
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getCourseName().equals(s)) {
                            System.out.println("slm");
                            MainFrame.getInstance().getContentPane().removeAll();
                            MainFrame.getInstance().getContentPane().add(courseobj.get(i).getCourseObjUI());
                            MainFrame.getInstance().getContentPane().validate();
                            MainFrame.getInstance().getContentPane().invalidate();
                            MainFrame.getInstance().getContentPane().repaint();
                        }
                    }
                }
            });
            add(myNewsfeedExercise);
            MainFrame.getInstance().getContentPane().validate();
            MainFrame.getInstance().getContentPane().invalidate();
            MainFrame.getInstance().getContentPane().repaint();
        }
    }
}

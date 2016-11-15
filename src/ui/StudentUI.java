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

    @Override
    public void update() {

        showCourses();
        showNewseedExercise();
    }

    public void showCourses() {
        ArrayList<Course> course = student.getMyCourse();
        if (course != null && !course.isEmpty()) {
            myList myCourse = new myList();
            myCourse.setListData(course.toArray());

            myCourse.setLocation((int) ((int) width / (1.8)), (int) (height / 4));
            myCourse.setSize(500, 300);
            myCourse.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    String s = myCourse.getSelectedValue().toString();
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getCourseName().equals(s)) {
                            MainFrame.getInstance().getContentPane().removeAll();
                            MainFrame.getInstance().getContentPane().add(course.get(i).getCourseUIS());
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
        ArrayList<Course> course = student.getMyCourse();
        if (course != null && !course.isEmpty()) {
            myList myNewsfeedExercise = new myList();
            ArrayList<CourseObj> courseobj = new ArrayList<CourseObj>();
            for (int i = 0; i < course.size(); i++) {
                for (int j = 0; j < course.get(i).getCourseExercise().size(); j++) {
                    courseobj.add(course.get(i).getCourseExercise().get(j));
                }
                for (int j = 0; j < course.get(i).getCourseNewsFeed().size(); j++) {
                    courseobj.add(course.get(i).getCourseNewsFeed().get(j));
                }
            }
            myNewsfeedExercise.setListData(courseobj.toArray());
            myNewsfeedExercise.setLocation((int) ((int) width / (12)), (int) (height / 4));
            myNewsfeedExercise.setSize(500, 300);
            myNewsfeedExercise.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    String s = myNewsfeedExercise.getSelectedValue().toString();
                    System.out.println(s);
                    for (int i = 0; i < courseobj.size(); i++) {
                        if (courseobj.get(i).getName().equals(s)||courseobj.get(i).getName().equals(s)) {

                            MainFrame.getInstance().getContentPane().removeAll();
                            MainFrame.getInstance().getContentPane().add(courseobj.get(i).getCourseObjUIS());
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

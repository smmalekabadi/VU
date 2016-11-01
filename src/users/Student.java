/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import controller.saveCourse;
import course.Course;
import java.util.ArrayList;

/**
 *
 * @author morteza
 */
public class Student extends Person {

    ArrayList<String> courseName;

    public Student(String name, String username) {
        super(name, username);
    }

    public ArrayList<Course> courseList() {
        ArrayList<Course> allCourse = saveCourse.getAllCourse();
        ArrayList<Course> myCourse = null;
        for (Course course : allCourse) {
            for (String coursename : courseName) {
                if (course.getCourseName().equals(coursename)) {
                    myCourse.add(course);
                }
            }

        }
        return myCourse;
    }

}

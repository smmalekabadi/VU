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

/**
 *
 * @author morteza
 */
public class StudentUI extends PersonUI {

    //private myList courseList;

    public StudentUI(String name, String username) {
        super(name);
    }

    public void showCourses(ArrayList<Course> course) {
        myList myCourse = new myList();
        myCourse.setListData(course.toArray());
        myCourse.setLocation((int) ((int) width / (1.8)), (int) (height / 4));
        myCourse.setSize(500, 500);

        add(myCourse);
    }

    public void showNewseedExercise(ArrayList<Course> course) {
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

        add(myNewsfeedExercise);

    }

  

}

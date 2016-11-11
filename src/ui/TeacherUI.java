/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Course;
import course.Exercise;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author morteza
 */
public class TeacherUI extends PersonUI {
    private myButton createCourse;
    public TeacherUI(String name, String username) {
        super(name);
        showMyCourse(null);
        showStudentExecrcise(null);
    }

    public void setElement(){
    createCourse = new myButton();
    
    createCourse.setSize(300, 35);
    createCourse.setLocation((int) (width / (2.5)), (int) (height / 1.8));
    createCourse.setText("create new course");
            
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
            studentExe.setSize(500, 500);
            studentExe.setLocation((int) (width / (12)), (int) (height / 4));

            add(studentExe);
        }
    }

    public void showMyCourse(ArrayList<Course> course) {
        if (course != null && course.isEmpty()) {
            myList myCourse = new myList();
            myCourse.setListData(course.toArray());
            myCourse.setLocation((int) ((int) width / (1.8)), (int) (height / 4));
            myCourse.setSize(500, 300);

            add(myCourse);
        }
    }

}

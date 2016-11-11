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

    public TeacherUI(String name, String username) {
        super(name);
    }

    public void showStudentExecrcise(ArrayList<Course> myCourse) {
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

    public void showMyCourse(ArrayList<Course> course) {
        myList myCourse = new myList();
        myCourse.setListData(course.toArray());
        myCourse.setLocation((int) ((int) width / (1.8)), (int) (height / 4));
        myCourse.setSize(500, 300);

        add(myCourse);

    }

}

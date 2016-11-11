/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import save.saveCourse;
import course.Course;
import java.util.ArrayList;
import ui.StudentUI;

/**
 *
 * @author morteza
 */
public class Student extends Person {

    private ArrayList<Course> AllCourse;
    private ArrayList<Course> myCourse;
    private StudentUI studentUI;
    public Student(String name, String username) {
        super(name, username);
        studentUI= new StudentUI(name, username);
    }

    public void coureList() {

    }

    public void newsfeed() {

    }

    public void exercise() {

    }
//-------------------------------------------------------------------------------
    /**
     * @return the AllCourse
     */
    public ArrayList<Course> getAllCourse() {
        return AllCourse;
    }

    /**
     * @param AllCourse the AllCourse to set
     */
    public void setAllCourse(ArrayList<Course> AllCourse) {
        this.AllCourse = AllCourse;
    }

    /**
     * @return the myCourse
     */
    public ArrayList<Course> getMyCourse() {
        return myCourse;
    }

    /**
     * @param myCourse the myCourse to set
     */
    public void setMyCourse(ArrayList<Course> myCourse) {
        this.myCourse = myCourse;
    }

    /**
     * @return the studentUI
     */
    public StudentUI getStudentUI() {
        return studentUI;
    }

    /**
     * @param studentUI the studentUI to set
     */
    public void setStudentUI(StudentUI studentUI) {
        this.studentUI = studentUI;
    }
}

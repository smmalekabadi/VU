/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import save.Save;
import course.Course;
import java.util.ArrayList;
import ui.PersonUI;
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
        super(name, username,Person.STUDENT_CODE);
        studentUI= new StudentUI(username,this);
         Save.addOneStudent(this);
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
    public void setOneCourse(Course course) {
        myCourse.add(course);
        

    }

    /**
     * @param studentUI the studentUI to set
     */
    public void setStudentUI(StudentUI studentUI) {
        this.studentUI = studentUI;
    }
}

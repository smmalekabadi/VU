/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import course.Course;
import course.Exercise;
import course.Newsfeed;
import java.util.ArrayList;
import java.util.Date;
import ui.TeacherUI;

/**
 *
 * @author morteza
 */
public class Teacher extends Person {

    ArrayList<course.Course> myCourses = null;
    private TeacherUI teacherUI;
    public Teacher(String name, String username) {
        super(name, username);
        teacherUI= new TeacherUI(name, username);
    }

    public void createCourse(String courseName) {
        myCourses.add(new Course(courseName));
        
    }

    public void deleteCourse(Course course) {
        myCourses.remove(course);
                            
    }

    public void createExercise(Course course,String name,String description ,Date date){
        course.setOneCourseExercise(new Exercise(name, description, date));
    
    }
    public void createNewsfeed(Course course, String subjet ,String description){
        course.setOneCourseNewsfeed(new Newsfeed(subjet, description));
    }
    public void editExercise(Exercise exercise,Date date){
        exercise.setDate(date);
    }
    public void editNewsfeed(Newsfeed newsfeed ,String decription){
        newsfeed.setDescription(decription);
    
    }

    /**
     * @return the teacherUI
     */
    public TeacherUI getTeacherUI() {
        return teacherUI;
    }

    /**
     * @param teacherUI the teacherUI to set
     */
    public void setTeacherUI(TeacherUI teacherUI) {
        this.teacherUI = teacherUI;
    }
}

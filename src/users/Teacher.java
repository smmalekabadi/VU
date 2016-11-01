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

/**
 *
 * @author morteza
 */
public class Teacher extends Person {

    ArrayList<course.Course> myCourses = null;

    public Teacher(String name, String username) {
        super(name, username);
    }

    public void createCourse(String courseName) {
        myCourses.add(new Course(courseName));
        
    }

    public void deleteCourse(Course course) {
        myCourses.remove(course);
                            
    }

    public void addStudentToCourse(Course course,Student student) {
        course.setOneCourseStudent(student);
    }

    public void removeStudentFromCourse(Course course,Student student) {
        course.getCourseStudent().remove(student);
    }

    public void seeStudent(Course course) {
        System.out.println(course.getCourseStudent());
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
}

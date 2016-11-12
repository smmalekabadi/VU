/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import save.saveCourse;
import java.util.ArrayList;
import users.Student;

/**
 *
 * @author morteza
 */
public class Course {

    private String courseName;
   
    private ArrayList<Exercise> courseExercise = new ArrayList<>();
    private ArrayList<Newsfeed> courseNewsFeed = new ArrayList<>();
    
    public Course(String courseName) {
        this.courseName = courseName;
        saveCourse.addOnecourse(this);
    }
    @Override
    public String toString(){
    
    return courseName;
    }
//-------------------------------------------------------------------------------
    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

 

    /**
     * @return the courseExercise
     */
    public ArrayList<Exercise> getCourseExercise() {
        return courseExercise;
    }
    /**
     * @param newExercise 
     */
    public void setOneCourseExercise(Exercise newExercise) {
        courseExercise.add(newExercise);
    }

    /**
     * @param courseExercise the courseExercise to set
     */
    public void setCourseExercise(ArrayList<Exercise> courseExercise) {
        this.courseExercise = courseExercise;
    }

    /**
     * @return the courseNewsFeed
     */
    public ArrayList<Newsfeed> getCourseNewsFeed() {
        return courseNewsFeed;
    }
    public void setOneCourseNewsfeed(Newsfeed newsfeed){
        this.courseNewsFeed.add(newsfeed);
    }
    /**
     * @param courseNewsFeed the courseNewsFeed to set
     */
    public void setCourseNewsFeed(ArrayList<Newsfeed> courseNewsFeed) {
        this.courseNewsFeed = courseNewsFeed;
    }
}

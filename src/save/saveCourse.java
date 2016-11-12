/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;

import java.util.ArrayList;
import course.Course;
/**
 *
 * @author morteza
 */
public final class saveCourse {
    private static ArrayList<Course> allCourse=new ArrayList<Course>();
    
    
    
    
    
    
//-------------------------------------------------------------------------------
    /**
     * @return the allCourse
     */
    public static ArrayList<Course> getAllCourse() {
        return allCourse;
    }
    public static void addOnecourse(Course course){
    allCourse.add(course);
    }
     public static void removeOnecourse(Course course){
    allCourse.remove(course);
    }
    /**
     * @param allCourse the allCourse to set
     */
    public static void setAllCourse(ArrayList<Course> allCourse) {
        saveCourse.allCourse = allCourse;
    }

}

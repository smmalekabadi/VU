/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import save.Save;
import java.util.ArrayList;
import ui.CourseUI;
import ui.StudentCourseUI;
import ui.TeacherCourseUI;
import users.Student;
import users.Teacher;

/**
 *
 * @author morteza
 */
public class Course {

    private String courseName;
    private ArrayList<Exercise> courseExercise = new ArrayList<Exercise>();
    private ArrayList<Newsfeed> courseNewsFeed = new ArrayList<Newsfeed>();
    private CourseUI courseUIT;
    private CourseUI courseUIS;
    private Teacher teacher;
    public static final int TEACHER_CODE = 1;
    public static final int STUDENT_CODE = 2;

    public Course(String courseName, int SorTCode/*student or teacher code*/,Teacher teacher) {
        this.courseName = courseName;
        this.teacher=teacher;
        Save.addOnecourse(this);
        setUI();
    }
    public void setUI(){
        setCourseUIT(new TeacherCourseUI(courseName, this));
        setCourseUIS(new StudentCourseUI(courseName, this));
    }
    @Override
    public String toString() {

        return getCourseName();
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

    public void setOneCourseNewsfeed(Newsfeed newsfeed) {
        this.courseNewsFeed.add(newsfeed);
    }

    /**
     * @param courseNewsFeed the courseNewsFeed to set
     */
    public void setCourseNewsFeed(ArrayList<Newsfeed> courseNewsFeed) {
        this.courseNewsFeed = courseNewsFeed;
    }

    /**
     * @return the teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * @return the courseUIT
     */
    public CourseUI getCourseUIT() {
        return courseUIT;
    }

    /**
     * @param courseUIT the courseUIT to set
     */
    public void setCourseUIT(CourseUI courseUIT) {
        this.courseUIT = courseUIT;
    }

    /**
     * @return the courseUIS
     */
    public CourseUI getCourseUIS() {
        return courseUIS;
    }

    /**
     * @param courseUIS the courseUIS to set
     */
    public void setCourseUIS(CourseUI courseUIS) {
        this.courseUIS = courseUIS;
    }
}

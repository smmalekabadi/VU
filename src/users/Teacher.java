/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import course.Course;
import course.CourseObj;
import course.Exercise;
import course.Newsfeed;
import java.util.ArrayList;
import java.util.Date;
import save.Save;
import ui.TeacherUI;

/**
 *
 * @author morteza
 */
public class Teacher extends Person {

    private ArrayList<course.Course> myCourses = new ArrayList<Course>();
    private TeacherUI teacherUI;

    public Teacher(String name, String username) {
        super(name, username, TEACHER_CODE);
        Save.addOneTeacher(this);
        teacherUI = new TeacherUI(username, this);

    }

    public void createCourse(String courseName) {
        getMyCourses().add(new Course(courseName, Course.TEACHER_CODE));

    }

    public void deleteCourse(Course course) {
        getMyCourses().remove(course);

    }

    public void createExercise(Course course, String name, String description, Date date) {
        course.setOneCourseExercise(new Exercise(name, description, date, CourseObj.TEACHER_CODE));

    }

    public void createNewsfeed(Course course, String subjet, String description) {
        course.setOneCourseNewsfeed(new Newsfeed(subjet, description, CourseObj.TEACHER_CODE));
    }

    public void editExercise(Exercise exercise, Date date) {
        exercise.setDate(date);
    }

    public void editNewsfeed(Newsfeed newsfeed, String decription) {
        newsfeed.setDescription(decription);

    }
//-------------------------------------------------------------------------------

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

    public void setOneCourse(Course course) {
        myCourses.add(course);
        teacherUI.update();
    }

    /**
     * @return the myCourses
     */
    public ArrayList<course.Course> getMyCourses() {
        return myCourses;
    }

    /**
     * @param myCourses the myCourses to set
     */
    public void setMyCourses(ArrayList<course.Course> myCourses) {
        this.myCourses = myCourses;
    }
}

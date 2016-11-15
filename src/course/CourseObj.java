/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import ui.CourseObjUI;

/**
 *
 * @author morteza
 */
public class CourseObj {

    private String name;
    private String description;
    public static final int TEACHER_CODE = 1;
    public static final int STUDENT_CODE = 2;
//    protected CourseObjUI courseObjUI;
    protected CourseObjUI courseObjUIT;
    protected CourseObjUI courseObjUIS;
    private Course course;

    public CourseObj(String name, String description, Course course) {
        this.name = name;
        this.description = description;
        this.course = course;

    }
    public void setUI(){
    
    
    }
    
    @Override
    public String toString() {
        return name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the courseObjUI
     */
//    public CourseObjUI getCourseObjUI() {
//        return courseObjUI;
//    }
//
//    /**
//     * @param courseObjUI the courseObjUI to set
//     */
//    public void setCourseObjUI(CourseObjUI courseObjUI) {
//        this.courseObjUI = courseObjUI;
//    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * @return the courseObjUIS
     */
    public CourseObjUI getCourseObjUIS() {
        return courseObjUIS;
    }

    /**
     * @param courseObjUIS the courseObjUIS to set
     */
    public void setCourseObjUIS(CourseObjUI courseObjUIS) {
        this.courseObjUIS = courseObjUIS;
    }

    /**
     * @return the courseObjUIT
     */
    public CourseObjUI getCourseObjUIT() {
        return courseObjUIT;
    }

    /**
     * @param courseObjUIT the courseObjUIT to set
     */
    public void setCourseObjUIT(CourseObjUI courseObjUIT) {
        this.courseObjUIT = courseObjUIT;
    }

}

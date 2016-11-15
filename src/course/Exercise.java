/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.io.File;
import java.util.Date;
import java.time.*;
import java.util.ArrayList;
import ui.CourseObjUI;
import ui.StudentExerciseUI;
import ui.TeacherExerciseUI;

/**
 *
 * @author morteza
 */
public class Exercise extends CourseObj {

    private Date date;
    private ArrayList<File> uploadedExecise = new ArrayList<File>();
    
    public Exercise(String name, String description, Course course, Date date, int SorTCode) {
        super(name, description, course);
        this.date = date;
        setUI();
    }
    
    @Override
    public void setUI() {
        setCourseObjUIT(new TeacherExerciseUI(getName(), this));
        setCourseObjUIS(new StudentExerciseUI(getName(), this));

    }

//-------------------------------------------------------------------------------
    /**
     *
     * public Date getDate() { return date; }
     *
     * /
     *
     **
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the uploadedExecise
     */
    public ArrayList<File> getUploadedExecise() {
        return uploadedExecise;
    }

    /**
     * @param uploadedExecise the uploadedExecise to set
     */
    public void setUploadedExecise(ArrayList<File> uploadedExecise) {
        this.uploadedExecise = uploadedExecise;
    }

    public void setOneUploadedExecise(File f) {
        uploadedExecise.add(f);

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

}

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
    

    public Exercise(String name, String description, Date date, int SorTCode) {
        super(name, description);
        this.date = date;
        if (SorTCode == 1) {
            courseObjUI = new TeacherExerciseUI(name, this);

        } else {
            courseObjUI = new StudentExerciseUI(name, this);
        }

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

  
}

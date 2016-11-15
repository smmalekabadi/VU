/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import ui.CourseObjUI;
import ui.StudentExerciseUI;
import ui.StudentNewsfeedUI;
import ui.TeacherExerciseUI;
import ui.TeacherNewsfeedUI;

/**
 *
 * @author morteza
 */
public class Newsfeed extends CourseObj {

    public Newsfeed(String name, String description, Course course, int SorT) {
        super(name, description, course);
        setUI();
    }

    @Override
    public void setUI() {
        courseObjUIT = new TeacherNewsfeedUI(getName(), this);
        courseObjUIS = new StudentNewsfeedUI(getName(), this);

    }
//-------------------------------------------------------------------------------

    /**
     * @return the courseObjUI
     */
}

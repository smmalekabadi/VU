/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author morteza
 */
public class StudentCourseUI extends CourseUI {

    private myButton joinTheCourse;

    public StudentCourseUI(String name) {
        super(name);
    }

    public void setElement() {
        joinTheCourse = new myButton();

        joinTheCourse.setText("join");
        joinTheCourse.setLocation((int) (width / (2.5)), (int) (height / 1.2));
        joinTheCourse.setSize(300,35);
        add(joinTheCourse);
    }

}

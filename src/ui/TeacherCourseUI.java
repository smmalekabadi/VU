/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Course;

/**
 *
 * @author morteza
 */
public class TeacherCourseUI extends CourseUI{
    private myTextField studentName;
    private myButton addStudent;
    private myButton removeStudent;
    public TeacherCourseUI(String name,Course course) {
        super(name,course);
        
    }
    public void setElement(){
        studentName= new myTextField();
        addStudent = new myButton();
        removeStudent= new myButton();
        
        studentName.setSize(300, 35);
        studentName.setLocation((int) (width / (4)), (int) (height / 1.2));
        
        addStudent.setSize(100,35);
        addStudent.setLocation((int) (width / (2)), (int) (height / 1.2));
        addStudent.setText("Add");
        
        removeStudent.setText("Remove");
        removeStudent.setLocation((int) (width / (1.7)), (int) (height / 1.2));
        removeStudent.setSize(100,35);
        add(studentName);
        add(addStudent);
        add(removeStudent);
    }
    
}

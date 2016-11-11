/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Exercise;

/**
 *
 * @author morteza
 */
public class TeacherExerciseUI extends CourseObjUI {

    private myTextField name;
    private myTextField description;
    private myTextField date;
    private myButton save;
    private Exercise exercise;

    public TeacherExerciseUI(String name, Exercise exercise) {
        super(name);
        this.exercise = exercise;
    }

    public void setElement() {
        name = new myTextField();
        description= new myTextField();
        date = new myTextField();
        save = new myButton();
        
        name.setText(exercise.getName());
        name.setSize(350,35);
        name.setLocation((int)(width / 2.5)-15, (int) height /5);
        
        description.setText(exercise.getDescription());
        description.setLocation((int) (width / 2.5)-15, (int) (height /3.5));
        description.setSize(350, 105);
        
        date.setText(exercise.getDate().toString());
        date.setLocation((int) (width / 2.5)-15, (int) (height /2.2));
        date.setSize(350, 35);
        
        save.setText("Save");
        save.setSize(350,35);
        save.setLocation((int) (width / 2.5)-15, (int) (height /1.8));
        add(name);
        add(description);
        add(date);
        add(save);
    }

}

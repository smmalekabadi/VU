/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Course;
import java.util.ArrayList;
import javax.swing.JList;

/**
 *
 * @author morteza
 */
public class StudentUI extends PersonUI{
    
    public StudentUI(String name,String username) {
        super(name);
    }
    
    public void showCourses(ArrayList<Course> course){
    
    }
    
    public void lixti(){
    JList mylist= new JList();
    mylist.setLocation(500, 500);
    mylist.setSize(500, 500);
    this.add(mylist);
    }
    
    
    
}

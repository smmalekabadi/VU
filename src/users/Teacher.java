/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.util.ArrayList;

/**
 *
 * @author morteza
 */
public class Teacher extends Person {
    ArrayList<course.Course> myCourses=null;
  
    public Teacher(String name, String username) {
        super(name, username);
    }
     
    
    
}

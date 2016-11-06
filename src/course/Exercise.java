/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.Date;
import java.time.*;

/**
 *
 * @author morteza
 */
public class Exercise extends CourseObj{

   
    private Date date;

    public Exercise(String name, String description, Date date) {
       super(name, description);
        this.date=date;
    }
//-------------------------------------------------------------------------------
    /**
    
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}

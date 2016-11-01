/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import file.RWonFile;

/**
 *
 * @author morteza
 */
public abstract class Person {

    private String name;
    private String username;
    private boolean inORout;
    public Person(String name, String username) {
        this.name = name;
        this.username = username;
    }
    public void editProfilePassword() throws Exception{
        
        
    }
    public void editProfileUsername(){
    
    
    }
    public void indexOfCourse(){
        
    
    }
//-------------------------------------------------------------------------------
    /**
     * @return the inORout
     */
    public boolean isInORout() {
        return inORout;
    }

    /**
     * @param inORout the inORout to set
     */
    public void setInORout(boolean inORout) {
        this.inORout = inORout;
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
}

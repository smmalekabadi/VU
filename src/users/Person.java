/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import file.RWonFile;
import ui.PersonUI;
import ui.StudentUI;
import ui.TeacherUI;

/**
 *
 * @author morteza
 */
public abstract class Person {

    private String name;
    private String username;
    private boolean inORout;
    private PersonUI personUI;
    public static final int TEACHER_CODE = 1;
    public static final int STUDENT_CODE = 2;

    public Person(String name, String username, int SorT) {
        this.name = name;
        this.username = username;
        if (SorT == 1) {
            this.personUI = new TeacherUI(name, (Teacher) this);
        } else {
            this.personUI = new StudentUI(username, (Student) this);
        }
    }

    public void editProfilePassword() throws Exception {

    }

    public void editProfileUsername() {

    }

    public void indexOfCourse() {

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

    /**
     * @return the personUI
     */
    public PersonUI getPersonUI() {
        return personUI;
    }

    /**
     * @param personUI the personUI to set
     */
    public void setPersonUI(PersonUI personUI) {
        this.personUI = personUI;
    }
}

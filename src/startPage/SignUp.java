/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startPage;

import file.RWonFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.SignUpUI;
import ui.StudentUI;
import ui.TeacherUI;
import users.Student;
import users.Teacher;
import vu.MainFrame;

/**
 *
 * @author morteza
 */
public class SignUp {

    private static String name;
    private static String username;
    private static String password;
    private static String email;
    private static SignUpUI signUpUI;

    public SignUp() {

    }

    public static void verfiy() {

        int isOK = 0;
        ArrayList<String> allUser = null;
        try {
            allUser = RWonFile.ReadFromfile("filename.txt");
        } catch (Exception ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < allUser.size(); i++) {
            if (allUser.get(i).split("#")[1].equals(username)) {
                isOK = 1;//already exists user 
                JOptionPane.showMessageDialog(null, "this username already exites", "vu", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (!email.contains("@")) {
            isOK = 2;//email is not real
        }

        if (isOK == 2) {
            JOptionPane.showMessageDialog(null, "EMAIL is not corrct", "vu", JOptionPane.ERROR_MESSAGE);
        } else if (isOK == 0) {
            RWonFile.appendOnFile(name + "#" + username + "#" + password + "#" + email, "filename.txt");
            MainFrame.getInstance().getContentPane().removeAll();
            if (email.contains("@um.ac.ir")) {
                Teacher newTeacher = new Teacher(name, username);
                save.Save.setWhoIsIn(newTeacher);
                MainFrame.getInstance().getContentPane().removeAll();
                MainFrame.getInstance().getContentPane().add(newTeacher.getTeacherUI());
                MainFrame.getInstance().getContentPane().validate();
            } else {
                
                Student student = new Student(name, username);
                save.Save.setWhoIsIn(student);
                MainFrame.getInstance().getContentPane().removeAll();
                MainFrame.getInstance().getContentPane().add(student.getStudentUI());
                MainFrame.getInstance().getContentPane().validate();
            }

        }

    }

    public static void scan(SignUpUI signUpUI) {
        name = signUpUI.getName();
        username = signUpUI.getUsername();
        password = signUpUI.getPassword();
        email = signUpUI.getEmail();
        verfiy();
    }
//-------------------------------------------------------------------------------

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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}

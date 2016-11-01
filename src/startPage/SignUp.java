/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startPage;

import file.RWonFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author morteza
 */
public class SignUp {

    private String name;
    private String username;
    private String password;
    private String email;

    public SignUp() {
        scan();
    }

    public void verfiy() {
        int isOK = 0;
        ArrayList<String> allUser = null;
        try {
            allUser = new RWonFile("filename.txt").ReadFromfile();
        } catch (Exception ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < allUser.size(); i++) {
            if (allUser.get(i).split("#")[1].equals(username)) {
                isOK = 1;//already exists user 
            }
        }
       
        if (!email.contains("@")) {
            isOK = 1;//email is not real
        }
        if (isOK == 1) {
            scan();
        }
        else 
           new RWonFile("filename.txt").appendOnFile(name+"#"+username+"#"+password+"#"+email);

    }

    public void scan() {
        Scanner sc1 = new Scanner(System.in);
        name = sc1.nextLine();
        username = sc1.nextLine();
        password = sc1.nextLine();
        email = sc1.nextLine();
        verfiy();
    }
//-------------------------------------------------------------------

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

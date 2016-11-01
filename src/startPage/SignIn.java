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

/**
 *
 * @author morteza
 */
public class SignIn {

    private String username;
    private String password;

    public SignIn() {

    }

    private void verfiy() {
        ArrayList<String> allUser = null;

        try {
            allUser = RWonFile.ReadFromfile("filename.txt");
        } catch (Exception ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        int sw = 0;
        for (int i = 0; i < allUser.size() && sw == 0; i++) {
            if (username.equals(allUser.get(i).split("#")[1])) {
                if (password.equals(allUser.get(i).split("#")[2])) {
                    System.out.println(":D");
                    sw = 1;
                    //pass and username is correct
                }

            }

        }
        if (sw == 0) {
            System.out.println("pass or user is wrong");
            scan();
        }

    }

    public void scan() {
        Scanner sc1 = new Scanner(System.in);
        username = sc1.nextLine();
        password = sc1.nextLine();
        verfiy();
    }

//--------------------------------------------------------------------------
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

}

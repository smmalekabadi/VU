/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startPage;

import java.util.Scanner;

/**
 *
 * @author morteza
 */
public class SignIn {
    private String username;
    private String password;
    public SignIn(){
        Scanner sc1 = new Scanner(System.in);
        username = sc1.nextLine();
        password = sc1.nextLine();
    }
    private void search(){
    
    
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
    
}

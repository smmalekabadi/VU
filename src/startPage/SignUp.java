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
public class SignUp {
    private String name;
    private String username;
    private String password;
    private String email;
    public SignUp(){
        Scanner sc1 = new Scanner(System.in);
        name=sc1.nextLine();
        username= sc1.nextLine();
        password= sc1.nextLine();
        email= sc1.nextLine();
    }
    
}

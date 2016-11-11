/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import startPage.SignIn;

/**
 *
 * @author morteza
 */
public class Vu extends JFrame {

    public static void main(String[] args) {

        SignIn si = new SignIn();

        MainFrame mf = MainFrame.getInstance();
        mf.add(si.getSignInUI());
        mf.setDefaultCloseOperation(3);
        mf.setVisible(true);
        mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author morteza
 */
public class myList extends JList {

    public myList() {
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        change();
    }

    public void change() {
        this.setOpaque(false);

    }
}

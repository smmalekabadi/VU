/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author morteza
 */
public abstract class Person {

    protected String name;
    protected String username;

    public Person(String name, String username) {
        this.name = name;
        this.username = username;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeproject;

/**
 *
 * @author Student
 */
public class Login {
     //stnumber
    //name and password
    //username
    public String name;
    public String userName;
    public String stnum;
    public String password;

    public Login(String name, String stnum, String username, String password) {
        this.name = name;
        this.password = password;
        this.stnum = stnum;
        this.userName = username;
    }

    public boolean checkUsername() {
        return userName.contains("_") && userName.length() < 5;
    }

    public boolean checkStudentNum() {
        return stnum.startsWith("ST") && stnum.length() == 10;
    }
}

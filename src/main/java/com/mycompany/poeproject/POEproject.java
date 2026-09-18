/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeproject;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class POEproject {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
                 // TODO code application logic here
        System.out.println("Please eneter your name");
        String name = input.nextLine();
        System.out.println("Enter your username");
        String userName = input.nextLine();
        System.out.println("Please enter your  student number");
        String stnum = input.nextLine();
        System.out.println("please enetr your password");
        String password = input.nextLine();
        // create instance of class
        Login userLogin = new Login(name, stnum, userName, password);
        
        // check user name meets the requirements
        if (userLogin.checkUsername()){
            System.out.println("Username successfully captured");
        } else {
            System.out.println("Username is not captured succesfully");
            
        }
        //checking for student number
        if (userLogin.checkStudentNum()) {
            System.out.println("Student number successfully captured");
        } else {
            System.out.println("student number ot successfully captured.");
        }
    }
}
    


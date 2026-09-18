/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {

        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("======================================");
            System.out.println("       REGISTRATION AND LOGIN");
            System.out.println("======================================");

            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();
            
            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            
            System.out.print("Enter your cellphone number: ");
            String cellphoneNumber = scanner.nextLine();
            
            Login user = new Login(
                    firstName,
                    lastName,
                    username,
                    password,
                    cellphoneNumber
            );
            
            System.out.println();
            System.out.println("======================================");
            System.out.println("        REGISTRATION STATUS");
            System.out.println("======================================");
            
            // Username
            if (user.checkUserName()) {
                System.out.println("Username successfully captured.");
            } else {
                System.out.println(
                        "Username is not correctly formatted; please ensure "
                                + "that your username contains an underscore and is "
                                + "no more than five characters in length."
                );
            }
            
            // Password
            if (user.checkPasswordComplexity()) {
                System.out.println("Password successfully captured.");
            } else {
                System.out.println(
                        "Password is not correctly formatted; please ensure "
                                + "that the password contains at least eight characters, "
                                + "a capital letter, a number, and a special character."
                );
            }
            
            // Cellphone
            if (user.checkCellPhoneNumber()) {
                System.out.println("Cell number successfully captured.");
            } else {
                System.out.println(
                        "Cell number is incorrectly formatted or does not "
                                + "contain an international code; please correct the "
                                + "number and try again."
                );
            }
            
            System.out.println();
            System.out.println("Registration result:");
            System.out.println(user.registerUser());
            
            // Login
            if (user.checkUserName()
                    && user.checkPasswordComplexity()
                    && user.checkCellPhoneNumber()) {
                
                System.out.println();
                System.out.println("======================================");
                System.out.println("                 LOGIN");
                System.out.println("======================================");
                
                System.out.print("Enter your username: ");
                String enteredUsername = scanner.nextLine();
                
                System.out.print("Enter your password: ");
                String enteredPassword = scanner.nextLine();
                
                System.out.println();
                
                System.out.println(
                        user.returnLoginStatus(
                                enteredUsername,
                                enteredPassword
                        )
                );
            }
        }
    }
}
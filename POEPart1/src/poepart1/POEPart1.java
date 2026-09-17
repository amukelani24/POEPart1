/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class POEPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Registration register = new Registration();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n===== Registration =====");

        System.out.print("Please enter the username: ");
        String username = scan.nextLine();

        System.out.print("Please enter password: ");
        String password = scan.nextLine();

        System.out.print("Please enter the cellphone number: ");
        String cellPhone = scan.nextLine();

        System.out.println(register.registerUser(username, password, cellPhone));
        
        if (!register.registerStatus (username, password, cellPhone)) {
            return;
        }
        
        Login login = new Login(username, password);
        
        System.out.println("\n==== Login ====");
        
        System.out.println("Please enter the username: ");
        String loginUsername =  scan.nextLine();
        
        System.out.println("Please eter the password: ");
        String loginPassword = scan.nextLine();
        
        boolean loginStatus = login.loginUser(loginUsername, loginPassword);
        
        System.out.println(login.returnLoginStatus(loginStatus));
        
        scan.close();
    }
    
}

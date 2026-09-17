/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1;

/**
 *
 * @author Student
 */
public class Login extends Registration {
    
    private String username;
    private String password;
    
public Login() {
}

public Login(String username, String password) {
    this.username = username;
    this.password = password;
}    

public boolean checkUserName() {
    
    return username.contains("_") 
            &&
            username.length() <=5;
}


public boolean loginUser(String registeredUsername, String registeredPassword) {
    
    return
    username.equals(registeredUsername)
    
            &&
    password.equals(registeredPassword);
}


public String returnLoginStatus(boolean loginSuccessful) {
   
    if (loginSuccessful) {
        return "Welcome " + username + ", it is great to see you again.";
    }else {
        return "Username or password incorrect, please try again.";
    }
}
   
}
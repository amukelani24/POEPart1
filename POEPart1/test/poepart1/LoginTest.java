/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poepart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        
        System.out.println("checkUserName");
        
        Login instance = new Login("kyl_1", "Ch&.sec@ke99!");
        
        boolean expResult = true;
        
        boolean result = instance.checkUserName();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        
        System.out.println("loginUser");
        
        Login instance = new Login("kyl_1", "Ch&.sec@ke99!");
        
        boolean expResult = true;
        
        boolean result = instance.loginUser("kyl_1", "Ch&.sec@ke99!");
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testLoginUserIncorrect() {
        
        System.out.println("loginUserIncorrect");
        
        Login instance = new Login ("kyl_1", "Ch&.sec@ke99!");
        
        boolean expResult = false;
        
        boolean result = instance.loginUser("wrongUser", "wrongPassword");
        
        assertEquals(expResult, result);
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        
        System.out.println("returnLoginStatus");
        
        Login instance = new Login("kyl_1", "Ch&.sec@ke99!");
        
        boolean loginSuccessful = true;
        
        String expResult = "Welcome kyl_1, it is great to see you again.";
        
        String result = instance.returnLoginStatus(loginSuccessful);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testReturnLoginStatusFailed() {
        
        System.out.println("returnLoginStatusFailed");
        
        Login instance = new Login("kyl_1", "Ch&.sec@ke99!");
        
        boolean loginSuccessful = false;
        
        String expResult = "Username or password incorrect, please try agin.";
        
        String result = instance.returnLoginStatus(loginSuccessful);
        
        assertEquals(expResult, result);
    }
    
}

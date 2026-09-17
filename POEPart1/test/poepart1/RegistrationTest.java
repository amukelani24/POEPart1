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
public class RegistrationTest {
    
public RegistrationTest() {
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
     * Test of checkUserName method, of class Registration.
     */
@Test
public void testCheckUserName() {
System.out.println("checkUserName");
String username = "kyl_1";
Registration instance = new Registration();
boolean expResult = true;
boolean result = instance.checkUserName(username);
assertEquals(expResult, result);
}

/**
* Test of checkPasswordComplexity method, of class Registration.
     */
@Test
public void testCheckPasswordComplexity() {
System.out.println("checkPasswordComplexity");

String password = "Ch&sec@ke99!";
Registration instance = new Registration();
boolean expResult = true;
boolean result = instance.checkPasswordComplexity(password);
assertEquals(expResult, result);
}

/**
     * Test of checkCellPhoneNumber method, of class Registration.
     */
@Test
public void testCheckCellPhoneNumber() {
System.out.println("checkCellPhoneNumber");
String cellphone = "+27838968976";
Registration instance = new Registration();
boolean expResult = true;
boolean result = instance.checkCellPhoneNumber(cellphone);
assertEquals(expResult, result);
}

/**
     * Test of registerUser method, of class Registration.
     */
@Test
public void testRegisterUser() {
    
System.out.println("registerUser");

String username = "kyl_1";
String password = "Che&sec@ke99!";
String cellphone = "+27838968976";
Registration instance = new Registration();
String expResult = "Registration was a success.";
String result = instance.registerUser(username, password, cellphone);
assertEquals(expResult, result);

}

/**
     * Test of registerStatus method, of class Registration.
     */
@Test
public void testRegisterStatus() {
    
System.out.println("registerStatus");

String username = "kyl_1";
String password = "Ch&sec@ke99!";
String cellphone = "+27838968976";
Registration instance = new Registration();
boolean expResult = true;
boolean result = instance.registerStatus(username, password, cellphone);
assertEquals(expResult, result);
}

@Test
public void testCheckUserNameInvalid() {
    
    System.out.println("checkUserNameInvalid");
    
    String username = "kyle!!!!!";
    Registration instance = new Registration();
    
    boolean expResult = false;
    boolean result = instance.checkUserName(username);
    
    assertEquals(expResult, result);
}

@Test
public void testCheckPasswordComplexityInvalid() {
    
    System.out.println("testCheckPasswordComplexityInvalid");
    
    String password = "password";
    Registration instance = new Registration();
    
    boolean expResult = false;
    boolean result = instance.checkPasswordComplexity(password);
    
    assertEquals(expResult, result);
}

@Test
public void testCellPhoneNumberInvalid() {
    
    System.out.println("checkCellPhoneNumberInvalid");
    
    String cellphone = "08966553";
    Registration instance = new Registration();
    
    boolean expResult = false;
    boolean result = instance.checkCellPhoneNumber(cellphone);
    
    assertEquals(expResult, result);
}

}
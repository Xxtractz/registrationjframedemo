/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package za.co.demo.registrationjframedemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author xxtractz
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
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String firstName = "Kyle";
        String lastName = "Moodley";
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        String expResult = "Registration Successful";
        String result = instance.registerUser(firstName, lastName, username, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String storedUsername = "kyl_1";
        String storedPassword = "Ch&&sec@ke99!";
        String enteredUsername = "kyl_1";
        String enteredPassword = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean result = instance.loginUser(storedUsername, storedPassword, enteredUsername, enteredPassword);
        assertTrue(result);
 
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String storedFirstName = "Kyle";
        String storedLastName = "Moodley";
        String storedUsername = "kyl_1";
        String storedPassword = "Ch&&sec@ke99!";
        String enteredUsername = "kyl_1";
        String enteredPassword = "Ch&&sec@ke99!";
        Login instance = new Login();
        String result = instance.returnLoginStatus(storedFirstName, storedLastName, storedUsername, storedPassword, enteredUsername, enteredPassword);
        assertTrue(result.contains("Welcome"));
    }
    
}

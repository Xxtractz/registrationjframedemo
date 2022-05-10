/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.co.demo.registrationjframedemo;

/**
 *
 * @author xxtractz
 */
public class Login {

    public boolean checkUserName(String username) {
        if (username.contains("_") && (username.length() <= 5)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPasswordComplexity(String password) {
        int index = 0;
        int specialChar = 0;
        int number = 0;
        int capitalLetter = 0;
        char character;

        // If Password is not 8 characters, this must fail
        if (password.length() > 7) {
            while (index < password.length()) {

                /**
                 * if our index is 0 and password is @password1 our password in
                 * character form ['@','p','a','s','s','w','o','r','d','1']
                 * character at index 0 will be @
                 */
                character = password.charAt(index);

                if (Character.isUpperCase(character)) {
                    capitalLetter = 1;
                } else if (Character.isDigit(character)) {
                    number = 1;
                } else if (Character.isLowerCase(character)) {
                    // I need to make sure that a special character is the last thing i check
                } else {
                    specialChar = 1;
                }

                index++;//index + 1
            }

            //If password has all of these, then passes
            if ((capitalLetter == 1) && (number == 1) && (specialChar == 1)) {
                return true;
            }
        }

        return false;
    }

    public String registerUser(String firstName, String lastName, String username, String password) {
        if (firstName.isEmpty()) {
            return "First Name should not be Empty";
        } else if (lastName.isEmpty()) {
            return "Last Name should not be Empty";
        } else if (username.isEmpty()) {
            return "Username should not be Empty";
        } else if (password.isEmpty()) {
            return "Password should not be Empty";
        } else if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .";
        } else if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        } else {
            return "Registration Successful";
        }
    }

    public boolean loginUser(String storedUsername, String storedPassword, String enteredUsername, String enteredPassword) {
        if (storedUsername.equals(enteredUsername)) {
            if (storedPassword.equals(enteredPassword)) {
                return true;
            }
        }
        return false;
    }

    public String returnLoginStatus(String storedFirstName, String storedLastName, String storedUsername, String storedPassword, String enteredUsername, String enteredPassword) {

        if (loginUser(storedUsername, storedPassword, enteredUsername, enteredPassword)) {
            return "Welcome ".concat(storedFirstName).concat(",").concat(storedLastName).concat(" it is great to see you again.");
        }
        return "Username or password incorrect, please try again”";
    }
}

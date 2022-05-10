/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package za.co.demo.registrationjframedemo;

import java.util.Scanner;

/**
 *
 * @author xxtractz
 */
public class Kanban {
    
    String firstName;
    String lastName;
    String username;
    String password;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Kanban kanbanObj = new Kanban();
        
        System.out.println("#################################################");
        System.out.println("               Registration Feature");
        System.out.println("#################################################");
        
        System.out.print("Enter First Name :");
        kanbanObj.firstName = scanner.nextLine();
        
        System.out.print("Enter Last Name :");
        kanbanObj.lastName = scanner.nextLine();
        
        System.out.print("Enter username:");
        kanbanObj.username = scanner.nextLine();
        
        System.out.print("Enter password :");
        kanbanObj.password = scanner.nextLine();
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login.java;
import java.util.Scanner;

public class LoginJava {

    public static void main(String[] args) {

        // Initialize attempts counter
        int attempts = 0;
        String correctUsername = "user";
        String correctPassword = "password";
        String inputUsername, inputPassword;

        Scanner scanner = new Scanner(System.in);

        // Loop until the user has made 3 attempts
        while (attempts < 3) {
            System.out.print("Enter username: ");
            inputUsername = scanner.nextLine();

            System.out.print("Enter password (each character will be printed as *): ");
            inputPassword = "";
            char character;
            while (scanner.hasNext()) {
                character = scanner.next().charAt(0);
                if (character == '\n') {
                    break;
                }
                inputPassword += "*";
                System.out.print("*");
            }

            // Check if the entered username and password are correct
            if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
                System.out.println("\nAuthentication Successful");
                return;
            } else {
                System.out.println("\nAuthentication Failed");
                attempts++;
            }
        }

        System.out.println("Maximum attempts reached. Exiting...");
    }
}
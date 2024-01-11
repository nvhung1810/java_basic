package components.java_classes.java_user_input;

import java.util.Scanner;

public class JavaUserInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine(); // Read user input
    System.out.println("Username is: " + userName);

    myObj.close();
  }
}

/**
 * Java user input
 *
 * The Scanner class is used to get user input, and it is found in the java.util
 * package.
 */

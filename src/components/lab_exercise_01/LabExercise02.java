package components.lab_exercise_01;

import java.util.Scanner;

public class LabExercise02 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    // Input length and width of the rectangle
    System.out.print("Enter the length of the rectangle: ");
    double length = scanner.nextDouble();

    System.out.print("Enter the width of the rectangle: ");
    double width = scanner.nextDouble();

    // Calculate perimeter, area, and the smallest side of the rectangle
    double perimeter = 2 * (length + width);
    double area = length * width;
    double smallestSide = Math.min(length, width);

    // Display the results
    System.out.println("The perimeter of the rectangle is: " + perimeter);
    System.out.println("The area of the rectangle is: " + area);
    System.out.println("The smallest side of the rectangle is: " + smallestSide);

    // Close the Scanner
    scanner.close();
  }
}

package components.lab_exercise_01;

import java.util.Scanner;

public class LabExercise01 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Enter student name: ");
    String studentName = scanner.nextLine();
    System.out.printf("Enter student point: ");
    double point = scanner.nextDouble();
    System.out.println(studentName + "has point" + point);

    scanner.close();
  }
}

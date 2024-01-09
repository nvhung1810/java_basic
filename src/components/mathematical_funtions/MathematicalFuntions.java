package components.mathematical_funtions;

import java.util.Scanner;

public class MathematicalFuntions {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number a of: ");
    int a = scanner.nextInt();
    System.out.println("Enter the number b of: ");
    int b = scanner.nextInt();
    System.out.println(Math.min(a, b));

    scanner.close();
  }
}

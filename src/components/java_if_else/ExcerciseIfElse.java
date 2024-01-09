package components.java_if_else;

import java.util.Scanner;

public class ExcerciseIfElse {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the tax amount (unit is million VND),");
    float tax = scanner.nextFloat();

    // check logic
    if (tax < 10)
      System.out.println("not taxable");
    else if (tax >= 10 && tax < 15)
      System.out.println("tax 10%");
    else if (tax >= 15 && tax < 30)
      System.out.println("tax 20%");
    else
      System.out.println("tax 50%");

    // close scanner
    scanner.close();
  }
}

package components.java_switch;

import java.util.Scanner;

public class ExcerciseSwitch {
  public static void main(String[] args) throws Exception {
    System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
    System.out.println("++ ------------------ ++");
    System.out.println("| 1. Cộng |");
    System.out.println("| 2. Trừ |");
    System.out.println("| 3. Kết thúc |");
    System.out.println("++ ------------------ ++");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lựa chọn của bạn là : ");
    int choose = scanner.nextInt();

    switch (choose) {
      case 1:
        System.out.println("Bạn đã lựa chọn phép cộng");
        break;
      case 2:
        System.out.println("Bạn đã lựa chọn phép trừ");
      case 3:
        System.out.println("Bạn đã lựa chọn thoát chương trình");
        scanner.close();
      default:
        break;
    }

    scanner.close();
  }
}

package components.function_output_screen;

import java.util.Scanner;

public class FuntionOutputScreen {
  public static void main(String[] args) throws Exception {
    // sout
    System.out.println("Hello, World!"); // Cai nay co xuong dong
    System.out.printf("Hello, World!"); // Cai nay ko co xuong dong
    /*
     * In ra co dinh dang
     * %d: số nguyên
     * %f: số thực
     * - mặc định là 6 số lẻ
     * %.3f định dạng 3 số lẻ
     * %s: chuỗi
     */

    int age = 26;
    String name = "hung nguyen";
    System.out.println("my profile:" + age + ", name is: " + name);

    // NHAP VAO TU BAN PHIM
    /**
     * Bước 1: Tạo đối tượng Scanner
     * Scanner scanner = new Scanner(System.in);
     *
     * Bước 2: sử dụng các phương thức được cung cấp sẵn
     * scanner.nextLine() => nhận 1 dòng nhập từ bàn phím => trả ra dữ liệu string
     * scanner.nextInt() => nhận 1 số nguyên từ bàn phím => trả ra dữ liệu số nguyên
     * scanner.nextDouble() => nhận 1 số thực từ bàn phím => trả ra dữ liệu số thực
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Your name is: ");
    String name2 = scanner.nextLine();
    System.out.println("Your age is: ");
    int age2 = scanner.nextInt();
    System.out.println("My name is " + name2 + ", age = " + age2);
    scanner.close();
  }
}

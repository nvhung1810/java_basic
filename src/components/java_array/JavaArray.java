package components.java_array;

import java.util.Arrays;

public class JavaArray {
  public static void main(String[] args) {
    String[] students = { "A", "B", "C", "D", "E" };
    System.out.println(students); // [Ljava.lang.String;@7ad041f3
    System.out.println(Arrays.toString(students)); // [A, B, C, D, E]
    System.out.println(students.length); // 5

    students[0] = "H";
    System.out.println(Arrays.toString(students)); // [H, B, C, D, E]

    // __________________________
    String[] a = new String[3]; // {null, null, null}
    a[0] = "1"; // { "1", null, null}
    System.out.println(a[1]); // null
  }
}

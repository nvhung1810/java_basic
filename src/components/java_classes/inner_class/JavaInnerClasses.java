package components.java_classes.inner_class;

class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class JavaInnerClasses {
  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();

    System.out.println(innerClass.y + outerClass.x);
  }
}

/**
 * Trong Java, cũng có thể lồng các lớp (một lớp trong một lớp). Mục đích của
 * các lớp lồng nhau là nhóm các lớp thuộc về nhau, điều này làm cho mã của bạn
 * dễ đọc và dễ bảo trì hơn.
 *
 * Để truy cập lớp bên trong, hãy tạo một đối tượng của lớp bên ngoài, sau đó
 * tạo một đối tượng của lớp bên trong:
 */

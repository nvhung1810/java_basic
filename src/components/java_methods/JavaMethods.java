public class JavaMethods {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  /**
   * myMethod() is the name of the method
   * static có nghĩa là phương thức này thuộc về lớp JavaMethods chứ không phải
   * đối tượng của lớp JavaMethods.
   */

  public static void main(String[] args) {
    myMethod();
  }
}

/**
 * a method la mot khoi ma chi dc chay khi dc goi
 * Bạn có thể truyền dữ liệu, được gọi là tham số, vào một phương thức.
 * Các phương thức được sử dụng để thực hiện một số hành động nhất định và chúng
 * còn được gọi là hàm.
 */

package components.class_attributes_method;

public class ClassAttributesAndMethod {
  // class attributes
  String name;

  // class methods

  /** void: la ham khong tra ra cai gi */
  public void learnJava() {

  } // tra ra ket qua la gi

  /** Tra ra cai gi thi them phan truoc do vao */
  public int getAge() {
    return 25;
  }

  public String getName() {
    return "hungnguyen";
  }

  public int sum(int a, int b) {
    return a + b;
  }

  public String[] getArray() {
    String[] array = { "a", "b", "c", "d", "e" };
    return array;
  }

  public static void main(String[] args) {
    ClassAttributesAndMethod classAttributesAndMethod = new ClassAttributesAndMethod();
    int results = classAttributesAndMethod.sum(10, 20);
    System.out.println(results);
  }
}

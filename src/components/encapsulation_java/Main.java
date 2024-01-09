package components.encapsulation_java;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("hungnguyen", 26);

    // get values
    String name = student.getName();
    int age = student.getAge();
    System.out.println(name + age);

    student.setName("hangnguyen");
    student.setAge(20);

    System.out.println(student.getName() + student.getAge());
  }
}

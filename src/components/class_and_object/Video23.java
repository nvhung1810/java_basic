package components.class_and_object;

public class Video23 {
  public static void main(String[] args) {
    // Tao ra doi tuong student cu the
    Student hungnv = new Student();
    hungnv.name = "hungnguyen";
    hungnv.age = 21;
    hungnv.address = "HaNoi";

    System.out.println(hungnv); // components.class_and_object.Student@251a69d7 in ra cai file
    System.out.println(hungnv.name); // hungnguyen
  }
}

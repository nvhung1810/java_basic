package components.constructor;

public class Student {
  // Nho ham tao nay moi lan dung new se tu tao ra object chua cac thuoc tinh
  // Gia tri nay neu nhu khong viet

  // Khoi tao ham tao
  // Khi viet 1 thang nay roi thi cai ham mac dinh se ko dc tu dong tao nua
  String name;

  public Student(String name1) {
    this.name = name1;
    // this.name la String name khai bao o tren
    // this tuong trung cho public class Student
  }

  public void learnJava() {
    System.out.println("I learn Java");
  }

  // function overloading
  // public void learnJava(int a) {
  // System.out.println("I learn Java");
  // }
}

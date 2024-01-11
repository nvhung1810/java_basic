package components.java_classes.java_abstraction;

interface DongVatCaSi {
  // trong interface tat ca phuong thuc deu la abstract
  void hat();
}

// abstract class
abstract class Animal {
  public abstract void speak();

  public void sleep() {
    System.out.println("Animal is sleeping");
  }
}

class Meo extends Animal {
  @Override
  public void speak() {
    System.out.println("Meo Meo");
  }
}

class HoaMi implements DongVatCaSi {
  @Override
  public void hat() {
    System.out.println("dau cat moi");
  }
}

public class JavaAbstraction {
  public static void main(String[] args) {
    Animal cat = new Meo();
    cat.speak();
    cat.sleep();
  }
}

/*
 * Java Abstraction [Tinh truu tuong]
 *
 * Abstract Classes and Methods
 */

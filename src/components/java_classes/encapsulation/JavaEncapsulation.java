package components.java_classes.encapsulation;

public class JavaEncapsulation {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("John");

    System.out.println(person.getName());
  }
}

/**
 * Java Encapsulation [Tinh dong goi]
 *
 * The meaning of Encapsulation, is to make sure that "sensitive[nhay cap]" data
 * is hidden from users. To achieve this, you must:
 *
 * - declare class variables/attributes as private (private int age)
 * - provide public get and set methods to access and update the value of a
 * private variable (crearte method get and set).
 *
 * private variables can only be accessed within the same class (an outside
 * class has no access to it). However, it is possible to access them if we
 * provide public get and set methods.
 */

package components.java_classes.inheritance;

public class VehicleSuperClass {
  protected String brand = "Ford";

  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

/**
 * If you don't want other classes to inherit from a class, use the final
 * keyword:
 */

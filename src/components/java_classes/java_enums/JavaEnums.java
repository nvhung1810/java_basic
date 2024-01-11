package components.java_classes.java_enums;

enum Level {
  LOW,
  MEDIUM,
  HIGH,
}

public class JavaEnums {
  // Enum inside a Class
  enum Level {
    LOW,
    MEDIUM,
    HIGH,
  }

  public static void main(String[] args) {
    Level myLevel = Level.MEDIUM;

    System.out.println(myLevel); // MEDIUM
  }
}

/**
 * An enum is a special[dac biet] "class" that represents[dai dien] a group of
 * constants (unchangeable variables, like final variables).
 */

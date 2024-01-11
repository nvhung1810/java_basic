package components.java_classes.inheritance;

public class CarSubClass extends VehicleSuperClass {
  private String modelName = "Mustang";

  public static void main(String[] args) {
    // Create a myCar object
    CarSubClass carSubClass = new CarSubClass();

    // Call the honk() method (from the Vehicle class) on the myCar object
    carSubClass.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the
    // value of the modelName from the Car class
    System.out.println(carSubClass.brand + " " + carSubClass.modelName);
  }
}

/**
 * extends VehicleSuperClass
 * muon ke thua cai nao thi extends cai class do vo
 *
 */

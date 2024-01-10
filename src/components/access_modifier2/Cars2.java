package components.access_modifier2;

import components.access_modifier.Cars;

public class Cars2 extends Cars {
  public static void main(String[] args) {
    Cars newCars = new Cars();

    newCars.a = 1;
    // newCars.b = 2; // error
  }
}

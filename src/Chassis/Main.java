package Chassis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
    VehicleChassis vc1 = new VehicleChassis(); //Object for informal constructor
    VehicleChassis vc2 = new VehicleChassis("Sample data");

    // Test default constructor and print instance attributes.
    Car c1 = new Car();
    System.out.println(c1);
    System.out.println();


  Feature[] f = {new InteriorFeature("AM/FM Radio")
      , new ExteriorFeature("Wood Panels")
      , new InteriorFeature("Air Conditioning")
      , new ExteriorFeature("Moonroof")};

  Car c2 = new Car(new Date(), "Honda", "Prelude", "Coupe",
      new VehicleChassis("Unibody"), "null", "type",
      new ManufacturedEngine("Honda", new Date(), "H-series",
          "H23A1", "88 AKI", 4,
          "2WD: Two-Wheel Drive"), f, 2);
    System.out.println(c2);
    System.out.println();
  }
}
package Chassis;

import java.util.Date;

public class Car extends Vehicle{

  // Variables

  private Feature[] features = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    features[0] = new InteriorFeature("No Interior Features");
    features[1] = new ExteriorFeature("No Exterior Features");
    carAxle = 2;
  }

 // Overloaded constructor

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine, Feature[] features, int carAxle){
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.features = features;
    this.carAxle = carAxle;

  }

  public String getExteriorFeatures(){
    String exteriorLoop = "";

    for (int index = 0; index < features.length; index++){
      if(features[index] instanceof ExteriorFeature) {
        exteriorLoop += "Exterior [" + features[index] + "]\n";
      }
    }
    return exteriorLoop;
  }

  public String getInteriorFeatures(){
    String interiorLoop = "";

    for (int index = 0; index < features.length; index++){
      if(features[index] instanceof InteriorFeature) {
        interiorLoop += "Interior [" + features[index] + "]\n";
      }
    }
    return interiorLoop;
  }

  public String toString(){
    return super.toString() // Gives me all vehicle + engine fields
        + "\n" + "Features : \n" + getInteriorFeatures()
        + getExteriorFeatures() + "Car Axle : " + carAxle;
  }

  /*
  public static void defaultCar(){
  }


  public static void defaultCar(String vehicleManufacture, Date vehicleManufacturedDate
      , String vehicleMake, String vehicleModel, String vehicleType, Chassis vehicleFrame
      , Engine vehicleEngine, Feature[] feature, int carAxle){
  }
  */
}

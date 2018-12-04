package Chassis;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  public Chassis getChassisType(){
    return vehicleFrame;
  }

  public void setChassisType(String vehicleChassis){
    this.vehicleFrame = new VehicleFrame(vehicleChassis);
  }

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  public Vehicle(){
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine){

    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  public void setEngineManufacturedDate(Date date) {
    this.vehicleEngine.setEngineManufacturedDate(date);
  }

  public void setEngineManufacturer(String manufacturer){
    this.vehicleEngine.setEngineManufacturer(vehicleManufacturer);
  }

  public void setEngineMake(String engineMake){
    this.vehicleEngine.setEngineMake(engineMake);
  }

  public void setEngineCylinders(int engineCylinders){
    this.vehicleEngine.setEngineCylinders(engineCylinders);
  }

  public void setEngineModel(String engineModel){
    this.vehicleEngine.setEngineModel(engineModel);
  }

  public void setDriveTrain(String driveTrain){
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  public void setEngineType(String fuel){
    this.vehicleEngine.setEngineType(fuel);
  }

  public String toString(){
    return "Manufacturer Name : " + this.vehicleManufacturer +"\n"
        + "Manufactured Date : " + this.vehicleManufacturedDate +"\n"
        + "Vehicle Make : " +  this.vehicleMake +"\n"
        + "Vehicle Model : " + this.vehicleModel +"\n"
        + "Vehicle Type : " + this.vehicleType + "\n"
        + vehicleEngine.toString();
  }
}

package Chassis;

import java.util.Date;

public class ManufacturedEngine implements Engine{

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private String engineType;
  private int engineCylinders;
  private String driveTrain;

  public ManufacturedEngine(){
    this.engineManufacturer
        = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineType = "Generic";
    this.engineCylinders = 0;
    this.driveTrain = "Generic";
  }

  public ManufacturedEngine(String engineManufacturer,  Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain){
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineType = engineType;
    this.engineCylinders = engineCylinders;
    this.driveTrain = driveTrain;
  }

  // A public method implementations for all of the public methods found in the Engine interface.

  public void setEngineCylinders(int engineCylinders){
    this.engineCylinders = engineCylinders;
  }

  public void setEngineManufacturedDate(Date engineManufacturedDate){
    this.engineManufacturedDate = engineManufacturedDate;
  }

  public void setEngineManufacturer(String engineManufacturer){
    this.engineManufacturer = engineManufacturer;
  }

  public void setEngineMake(String engineMake){
    this.engineMake = engineMake;
  }


  public void setEngineModel(String engineModel){
    this.engineModel = engineModel;
  }

  public void setDriveTrain(String driveTrain){
    this.driveTrain = driveTrain;
  }

  public void setEngineType(String engineType){
    this.engineType = engineType;
  }


  public String toString(){
    return "Engine Manufacturer : " + this.engineManufacturer +"\n" +
    "Engine Manufactured : " + this.engineManufacturedDate +"\n" +
    "Engine Make : " +  this.engineMake +"\n" +
    "Engine Model : " + this.engineModel +"\n" +
    "Engine Type : " + this.engineType +"\n" +
    "Engine Cylinders : " + this.engineCylinders +"\n" +
    "Drive Train : " + this.driveTrain ;
  }
}
package Chassis;

public class VehicleChassis implements Chassis{

  String chassisName;
  public VehicleChassis(){
    this.chassisName = Chassis.chassis;
  }

  public VehicleChassis(String chassisName){
    this.chassisName = chassisName;
  }

  public Chassis getChassisType(){
    return this;
  }

  public void setChassisType(String vehicleChassis){
    this.chassisName = vehicleChassis;
  }

  public String toString(){
    return "Chassis name : " + chassis;
  }
}
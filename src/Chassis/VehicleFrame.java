package Chassis;

public class VehicleFrame implements Chassis {

  String vehicleFrameType;

  public VehicleFrame(){
    this.vehicleFrameType = vehicleFrameType;
  }

  public VehicleFrame(String vehicleFrameType){
    this.vehicleFrameType = vehicleFrameType;
  }

  public Chassis getChassisType(){

    return this;
  }

  public void setChassisType(String vehicleFrameType){

  }

  public String toString(){
    return "Chassis : Chassis\n" + "Vehicle Frame : Unibody\n";
  }

}
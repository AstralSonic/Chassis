package Chassis;

public class ExteriorFeature implements Feature{

  String exteriorFeature;

  // Default Constructor

  public ExteriorFeature() {
    exteriorFeature = "Generic";
  }

  public ExteriorFeature(String exteriorFeature){
    this.exteriorFeature = exteriorFeature;
  }

  public String getFeature(){
    return this.exteriorFeature;
  }

  public void setFeature(String feature){
    this.exteriorFeature = feature;
  }

  public String toString(){
    return this.exteriorFeature;
  }
}

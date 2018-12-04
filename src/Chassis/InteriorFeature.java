package Chassis;

public class InteriorFeature implements Feature {

  String interiorFeature;

  // Default Constructor

  public InteriorFeature() {
    interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature){
    this.interiorFeature = interiorFeature;
  }

  public String getFeature(){
    return this.interiorFeature;
  }

  public void setFeature(String feature){
    this.interiorFeature = feature;
  }

  public String toString(){
    return this.interiorFeature;
  }
}

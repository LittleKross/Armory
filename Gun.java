public class Gun extends Weapon{
  
  private String brand;
  private String model;
  private String version;
  private int serial;
  private int roundCapacity;
  
  public Gun(String brand, String model, String version, String type, int serial, int damagePerUse, int roundCapacity) {
    
    super(type, serial, damagePerUse);
    this.brand = brand;
    this.model = model;
    this.version = version;
    this.roundCapacity = roundCapacity;
  }
  
  //Brand Accessor
  public String getGunBrand() {
    return brand;
  }
  
  //Brand Mutator
  public void setGunBrand(String brand) {
    this.brand = brand;
  }
  
  //Model Accessor
  public String getGunModel() {
    return model;
  }
  
  //Model Mutator
  public void setGunModel(String model) {
    this.model = model;
  }
  
  //Version Accessor
  public String getGunVersion() {
    return version;
  }
  
  //Version Mutator
  public void setGunVersion(String version) {
    this.version = version;
  }
  
  //RoundCapacity Accessor
  public int getGunRoundCapacity() {
    return roundCapacity;
  }
  
  //RoundCapacity Mutator
  public void setGunRoundCapacity(int roundCapacity) {
    this.roundCapacity = roundCapacity;
  }
  
  public String gunDescribe() {    
    return String.format("This %s %s %s %s's id is %d. Its damage is %d, and it can hold %d rounds.", brand, model, version, super.getType(), serial, super.getDamagePerUse(), roundCapacity);
  }  
}
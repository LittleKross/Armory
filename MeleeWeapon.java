public class MeleeWeapon extends Weapon {
  
  private String brand;
  private String model;
  private String version;
  
  public MeleeWeapon(String brand, String model, String version, String type, int serial, int damagePerUse) {
    
    super(type, serial, damagePerUse);
    this.brand = brand;
    this.model = model;
    this.version = version;
  }
  
  //Brand Accessor
  public String getMeleeBrand() {
    return brand;
  }
  
  //Brand Mutator
  public void setMeleeBrand(String brand) {
    this.brand = brand;
  }
  
  //Model Accessor
  public String getMeleeModel() {
    return model;
  }
  
  //Model Mutator
  public void setMeleeModel(String model) {
    this.model = model;
  }
  
  //Version Accessor
  public String getMeleeVersion() {
    return version;
  }
  
  //Version Mutator
  public void setMeleeVersion(String version) {
    this.version = version;
  }
  
  public String meleeDescribe() {    
    return String.format("This %s %s%s %s's id is %d and its damage is %d.", brand, model, version, super.getType(), super.getSerial(), super.getDamagePerUse());
  }
}
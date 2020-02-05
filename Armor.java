public class Armor {
  
  String brand;
  String model;
  String version;
  String type;
  int serial;
  int damageReduction;
  int maxDurability;
  
  public Armor(String brand, String model, String version, String type, int serial, int damageReduction, int maxDurability) {
    
    this.brand = brand;
    this.model = model;
    this.version = version;
    this.type = type;
    this.serial = serial;
    this.damageReduction = damageReduction;
    this.maxDurability = maxDurability;
  }
  
  //Brand Accessor
  public String getArmorBrand() {
    return brand;
  }
  
  //Brand Mutator
  public void setArmorBrand(String brand) {
    this.brand = brand;
  }
  
  //Model Accessor
  public String getArmorModel() {
    return model;
  }
  
  //Model Mutator
  public void setArmorModel(String model) {
    this.model = model;
  }
  
  //Version Accessor
  public String getArmorVersion() {
    return version;
  }
  
  //Version Mutator
  public void setArmorVersion(String version) {
    this.version = version;
  }
  
  //Type Accessor
  public String getArmorType() {
    return type;
  }
  
  //Type Mutator
  public void setArmorType(String type) {
    this.type = type;
  }
  
  //Serial Accessor
  public int getArmorSerial() {
    return serial;
  }
  
  //Serial Mutator
  public void setArmorSerial(int serial) {
    this.serial = serial;
  }
  
  //DamageReduction Accessor
  public int getArmorDamageReduction() {
    return damageReduction;
  }
  
  //DamageReduction Mutator
  public void setArmorDamageReduction(int damageReduction) {
    this.damageReduction = damageReduction;
  }
  
  //MaxDurability Accessor
  public int getArmorMaxDurability() {
    return maxDurability;
  }
  
  //MaxDurability Mutator
  public void setArmorMaxDurability(int maxDurability) {
    this.maxDurability = maxDurability;
  }
  
  public String armorDescribe() {    
    return String.format("This %s %s %s %s's id is %d. Its protection is %d, and it can endure %d hits.", brand, model, version, type, serial, damageReduction, maxDurability);
  }
}
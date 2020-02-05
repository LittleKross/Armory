public class Weapon {
  
  private String type;
  private int serial;
  private int damagePerUse;
  
  public Weapon() {
    type = null;
    damagePerUse = 0;
  }
  
  public Weapon(String type, int serial, int damagePerUse) {
    this.type = type;
    this.serial = serial;
    this.damagePerUse = damagePerUse;
  }
  //Type Accessor
  public String getType() {
    return type;
  }
  
  //Type Mutator
  public void setType(String type) {
    this.type = type;
  }
  
  //Serial Accessor
  public int getSerial() {
    return serial;
  }
  
  //Serial Mutator
  public void setSerial(int serial) {
    this.serial = serial;
  }
  
  //DamagePerUse Accessor
  public int getDamagePerUse() {
    return damagePerUse;
  }
  
  //DamagePerUse Mutator
  public void setDamagePerUse(int damagePerUse) {
    this.damagePerUse = damagePerUse;
  }
}
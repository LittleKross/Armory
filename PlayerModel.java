public class PlayerModel {
  
  private String name;
  private int age;
  private String frequency;
  private Gun primaryWeapon;
  private Gun secondaryWeapon;
  private MeleeWeapon meleeWeapon;
  private Armor helmet;
  private Armor chestplate;
  private Armor armGuards;
  private Armor gauntlets;
  private Armor legGuards;
  private Armor shinGuards;
  private Armor boots;
  
  public PlayerModel(String name, int age, String frequency, Gun primaryWeapon, Gun secondaryWeapon, MeleeWeapon meleeWeapon, Armor helmet, Armor chestplate, Armor armGuards, Armor gauntlets, Armor legGuards, Armor shinGuards, Armor boots) {
    
    this.name = name;
    this.age = age;
    this.frequency = frequency;
    this.primaryWeapon = primaryWeapon;
    this.secondaryWeapon = secondaryWeapon;
    this.meleeWeapon = meleeWeapon;
    this.helmet = helmet;
    this.chestplate = chestplate;
    this.armGuards = armGuards;
    this.gauntlets = gauntlets;
    this.legGuards = legGuards;
    this.shinGuards = shinGuards;
    this.boots = boots;
  }
  
  //
}
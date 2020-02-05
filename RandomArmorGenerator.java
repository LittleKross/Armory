import java.util.Random;

public class RandomArmorGenerator {
  
  public static void randomArmorGenerator() {
    
    Armor[] armor = new Armor[1];
    Random rand = new Random();
    String[] brands = {"Olympian", "Hallbred", "Jester", "Goran", "Future Point", "Virtual Combatant", "Physical Combat", "A.I.M.", "Hawk Armory", "Cryo", "Void", "Broker", "Skulker", "Harrog", "Kilok"};
    String[] models = {"Resistor", "Damage Breaker", "Perfect Hooligan", "Capstone", "Knight", "Warlock", "Ninja", "Damage Resistor", "Reaver", "Pshychic", "Reptilia", "Constructor"};
    String[] versions = {"1.1", "1.1.0", "1.1.1", "1.1.2", "1.1.3", "1.1.4", "1.1.5", "1.1.6", "1.1.7", "1.1.8", "1.1.9", "1.2", "1.2.0", "1.2.1", "1.2.2", "1.2.3", "1.2.4", "1.2.5", "1.2.6", "1.2.7", "1.2.8", "1.2.9", "1.3", "1.1a", "1.1b", "1.1c", "1.2a", "1.2b", "1.2c", "1.3a", "1.3b", "1.3c", "prototype", "prototype alpha", "prototype beta"};
    String[] types = {"Light Helmet", "Medium Helmet", "Heavy Helmet", "Helm", "Light Chestplate", "Medium Chestplate", "Heavy Chestplate", "Tactical Vest", "Protective Vest", "Light Gauntlets", "Medium Gauntlets", "Heavy Gauntlets", "Light Arm Guards", "Medium Arm Guards", "Heavy Arm Guards", "Light Leg Guards", "Medium Leg Guards", "Heavy Leg Guards", "Light Shin Guards", "Medium Shin Guards", "Heavy Shin Guards", "Light Boots", "Medium Boots", "Heavy Boots", "Gloves"};
    int[] damageReduction = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 275, 280, 285, 290, 295, 300};
    int[] maxDurability = {1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 2000, 2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000};
    
    for(int i = 0; i < armor.length; i++) {
      armor[i] = new Armor(brands[rand.nextInt(brands.length)], models[rand.nextInt(models.length)], versions[rand.nextInt(versions.length)], types[rand.nextInt(types.length)], i + 679, damageReduction[rand.nextInt(damageReduction.length)], maxDurability[rand.nextInt(maxDurability.length)]);
      System.out.println(armor[i].armorDescribe());
    }
  }
  public static void main(String[] args) {
   randomArmorGenerator();
  }
}
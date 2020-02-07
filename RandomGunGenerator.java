import java.util.Random;

public class RandomGunGenerator {

  private static Random rand = new Random();
  private static String[] brands = {"Remington", "Battle Rack", "Galatrax", "Inferno", "Uronia", "Manacle", "Carbor", "Glea", "Shackle", "Dalarax", "Gorog"};
  private static String[] models = {"Hogbuster", "Shiny Shooter", "Bolt Breaker", "Greedy", "Sheetcutter", "Hullbuster", "Hellfire", "Firebreather", "Tank Blaster"};
  private static String[] versions = {"mkI", "mkII", "mkIII", "mkIV", "mkV", "v1", "v2", "v3", "v4", "v5", "prototype"};
  private static String[] types = {"Auto Rifle", "Pulse Rifle", "Scout Rifle", "Auto Pistol", "Pulse Pistol", "Scout Pistol", "Flamethrower", "Rocket Launcher", "Sniper Rifle", "Focus Rifle", "Machine Gun"};
  private static int[] damagePerUse = {90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300};
  private static int[] roundCapacity = {1, 2, 10, 15, 20, 25, 30, 35, 40, 45, 50};
  
  public static void randomGunGenerator() {
    
    Gun[] guns = new Gun[1];
    
    for(int i = 0; i < guns.length; i++) {
      guns[i] = new Gun(brands[rand.nextInt(brands.length)], models[rand.nextInt(models.length)], versions[rand.nextInt(versions.length)], types[rand.nextInt(types.length)], i + 100, damagePerUse[rand.nextInt(damagePerUse.length)], roundCapacity[rand.nextInt(roundCapacity.length)]);
      System.out.println(guns[i].gunDescribe());
    }
  }

  public static void randomGunGenerator(int n) {
    
    Gun[] guns = new Gun[n];
    
    for(int i = 0; i < guns.length; i++) {
      guns[i] = new Gun(brands[rand.nextInt(brands.length)], models[rand.nextInt(models.length)], versions[rand.nextInt(versions.length)], types[rand.nextInt(types.length)], i + 100, damagePerUse[rand.nextInt(damagePerUse.length)], roundCapacity[rand.nextInt(roundCapacity.length)]);
      System.out.println(guns[i].gunDescribe());
    }
  }

  public static void main(String[] args) {
   randomGunGenerator();
  }
}
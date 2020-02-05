import java.util.Random;

public class RandomMeleeGenerator {
  
  public static void randomMeleeGenerator() {
    
    MeleeWeapon[] meleeWeapons = new MeleeWeapon[1];
    Random rand = new Random();
    String[] brands = {"Manacle", "Battle Rack", "Mandarin Arms", "Corosive", "Vibro", "Clan", "Reviler", "Cleaver"};
    String[] models = {"Craken", "Cyclops", "Zeus", "Hades", "Gargoyle"};
    String[] versions = {" mkI", " mkII", " mkIII", " mkIV", " mkV", ".v1", ".v2", ".v3", ".v4", ".v5", " prototype"};
    String[] types = {"Knife", "Short Sword", "Long Sword", "Battleaxe", "Warhammer", "Vibroblade", "Machette", "Electro-Whip", "Electro-Blade"};
    int[] damagePerUse = {90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300};
    
    for(int i = 0; i < meleeWeapons.length; i++) {
      meleeWeapons[i] = new MeleeWeapon(brands[rand.nextInt(brands.length)], models[rand.nextInt(models.length)], versions[rand.nextInt(versions.length)], types[rand.nextInt(types.length)], i + 100, damagePerUse[rand.nextInt(damagePerUse.length)]);
      System.out.println(meleeWeapons[i].meleeDescribe());
    }
  }
  public static void main(String[] args) {
   randomMeleeGenerator();
  }
}
public class F35 extends AirCraft {

  public F35(int maxAmmo, int currentAmmo, int baseDamage, String type, int allDamage) {
    super(maxAmmo, currentAmmo, baseDamage, type, allDamage);
  }

  public F35() {
    maxAmmo = 12;
    baseDamage = 50;
    type = "F35";
    allDamage = maxAmmo * baseDamage;
  }


}

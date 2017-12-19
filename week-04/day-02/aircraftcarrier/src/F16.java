public class F16 extends AirCraft {

  public F16(int maxAmmo, int currentAmmo, int baseDamage, String type, int allDamage) {
    super(maxAmmo, currentAmmo, baseDamage, type, allDamage);
  }

  public F16() {
    maxAmmo = 8;
    baseDamage = 30;
    type = "F16";
    allDamage = maxAmmo * baseDamage;
  }

}

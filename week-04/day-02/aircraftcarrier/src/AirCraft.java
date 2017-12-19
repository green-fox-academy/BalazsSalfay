public class AirCraft {

  protected int maxAmmo;
  protected int currentAmmo;
  protected int baseDamage;
  protected int allDamage;
  protected String type;

  public AirCraft(int maxAmmo,int currentAmmo, int baseDamage, String type, int allDamage) {
    this.maxAmmo = maxAmmo;
    this.currentAmmo = currentAmmo;
    this.baseDamage = baseDamage;
    this.type = type;
    this.allDamage = allDamage;
  }

  public AirCraft() {
  }

  public String getType() {
    return type;
  }

  public int fight() {
    int damage = baseDamage * maxAmmo;
    maxAmmo = 0;
    return damage;
  }

  public int refill(int fillWith) {
    if (type.equals("F16")) {
      maxAmmo = 8;
    } else if (type.equals("F35")) {
      maxAmmo = 12;
    }
    int remainingAmmo = fillWith - maxAmmo;
    return remainingAmmo;
  }


  public String getStatus() {
    String status = "Type: " + type + ", Ammo: " + maxAmmo + ", Base damage: " + baseDamage + ", All damage: " + allDamage;
    return status;
  }
}

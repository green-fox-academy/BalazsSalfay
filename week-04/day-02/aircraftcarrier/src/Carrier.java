import java.util.List;

public class Carrier {

  private int ammoStorage;
  private int healthPoint;
  private int totalDamage;
  private List<AirCraft> listOfAircrafts;

  public int getAmmoStorage() {
    return ammoStorage;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public int getTotalDamage() {
    return totalDamage;
  }

  public List<AirCraft> getListOfAircrafts() {
    return listOfAircrafts;
  }

  public Carrier(int ammoStorage, int healthPoint) {
    this.ammoStorage = ammoStorage;
    this.healthPoint = healthPoint;
  }

  public void addAircraft(AirCraft type) {
    listOfAircrafts.add(type);
  }

  public String getStatus() {
    return "HP: " + healthPoint + ", Aircraft count: " + listOfAircrafts.size() + ", Ammo Storage: " +
            ammoStorage + ", Total Damage: " + totalDamage + "n\"" + "Aircrafts: " + "n\"";
  }
}

package comgreenfoxacademy.gfwebshop.models;

import javax.persistence.*;

@Entity
@Table(name="warehouse")
public class Clothes {

  @Id
  private int id;
  @Column(name="item_name")
  private String itemName;
  private String manufacturer;
  private String category;
  private String size;
  @Column(name="unit_price")
  private double price;

  public Clothes() {
  }

  public Clothes(int id, String itemName, String manufacturer, String category, String size, double price) {
    this.id = id;
    this.itemName = itemName;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

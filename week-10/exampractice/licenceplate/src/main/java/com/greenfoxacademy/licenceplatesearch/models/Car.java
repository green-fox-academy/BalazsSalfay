package com.greenfoxacademy.licenceplatesearch.models;

import javax.persistence.*;

@Entity
@Table(name="licence_plates")
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String plate;
  @Column(name="car_brand")
  private String brand;
  @Column(name="car_model")
  private String model;
  private String color;
  private String year;

  public Car() {
  }

  public Car(String plate, String brand, String model, String color, String year) {
    this.plate = plate;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }
}

package com.greenfoxacademy.licenceplatesearch.services;

import com.greenfoxacademy.licenceplatesearch.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

  List<Car> listAll();
  List<Car> getCarByLicencePlate(String search, int police, int diplomat);
  List<Car> findAllByBrand (String brand);
}

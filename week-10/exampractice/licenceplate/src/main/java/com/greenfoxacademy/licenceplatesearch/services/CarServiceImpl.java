package com.greenfoxacademy.licenceplatesearch.services;

import com.greenfoxacademy.licenceplatesearch.models.Car;
import com.greenfoxacademy.licenceplatesearch.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

  @Autowired
  CarRepository carRepository;

  @Override
  public List<Car> listAll() {
    return (List<Car>) carRepository.findAll();
  }

  @Override
  public List<Car> getCarByLicencePlate(String search, int police, int diplomat) {
    if (police == 1) {
      return carRepository.findAllByPlateStartingWith("RB");
    } else if (diplomat == 1) {
      return carRepository.findAllByPlateStartingWith("DT");
    } else {
      return carRepository.findAllByPlateContaining(search);
    }
  }

  @Override
  public List<Car> findAllByBrand(String brand) {
    return carRepository.findAllByBrand(brand);
  }
}

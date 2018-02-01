package com.greenfoxacademy.licenceplatesearch.repositories;

import com.greenfoxacademy.licenceplatesearch.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

  List<Car> findAllByPlateContaining(String search);
  List<Car> findAllByPlateStartingWith(String searchingValue);
  List<Car> findAllByBrand(String brand);
}

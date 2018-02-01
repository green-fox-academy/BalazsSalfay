package com.greenfoxacademy.licenceplatesearch.controllers;

import com.greenfoxacademy.licenceplatesearch.models.CarList;
import com.greenfoxacademy.licenceplatesearch.models.Response;
import com.greenfoxacademy.licenceplatesearch.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicencePlateRestController {

  @Autowired
  CarService carService;

  @Autowired
  CarList carList;

  @Autowired
  Response response;

  @GetMapping("/api/search/{brand}")
  public Object getCarsBySameBrand(@PathVariable String brand) {
    if (brand == null) {
     response.setStatus("No brand name provided.");
     return response;
    } else {
      carList.setData(carService.findAllByBrand(brand));
      carList.setResult("ok");
      return carList;
    }
  }
}

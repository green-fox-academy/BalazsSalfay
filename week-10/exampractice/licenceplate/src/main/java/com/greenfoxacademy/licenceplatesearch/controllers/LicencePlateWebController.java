package com.greenfoxacademy.licenceplatesearch.controllers;

import com.greenfoxacademy.licenceplatesearch.models.Car;
import com.greenfoxacademy.licenceplatesearch.models.SearchChecker;
import com.greenfoxacademy.licenceplatesearch.services.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LicencePlateWebController {

  @Autowired
  CarServiceImpl carService;

  @Autowired
  SearchChecker searchChecker;

  @GetMapping("/")
  public String listAllLicencePlates(Model model) {
    List<Car> listAllCars = carService.listAll();
    model.addAttribute("cars", listAllCars);
    return "licencePlate";
  }

  @GetMapping("/search")
  public String searchingLicencePlates (@RequestParam (value="police", required = false, defaultValue = "0") int police,
                                        @RequestParam (value="diplomat", required = false, defaultValue = "0") int diplomat,
                                        @RequestParam (value="q", required = false, defaultValue = "") String search,
                                        Model model) {
    if (searchChecker.isItAValidSearch(search) || police == 1 || diplomat == 1) {
      List<Car> searchedPlates = carService.getCarByLicencePlate(search, police, diplomat);
      model.addAttribute("cars", searchedPlates);
    } else {
      model.addAttribute("error", "Sorry,the submitted licence plate is not valid");
    }
    return "licencePlate";
  }

  @GetMapping("/search/{brand}")
  public String listCarsByBrand(@PathVariable String brand, Model model) {
    List<Car> carsByBrand = carService.findAllByBrand(brand);
    model.addAttribute("cars", carsByBrand);
    return "licencePlate";
  }
}

package comgreenfoxacademy.gfwebshop.controllers;

import comgreenfoxacademy.gfwebshop.models.Clothes;
import comgreenfoxacademy.gfwebshop.models.ClothesDTO;
import comgreenfoxacademy.gfwebshop.repositories.ClothesRepository;
import comgreenfoxacademy.gfwebshop.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StoreWebController {

  @Autowired
  ClothesService clothesService;

  @GetMapping("/warehouse")
  public String listWantedItem(@ModelAttribute ClothesDTO clothesDTO, Model model) {
    List<Clothes> listOfItems = clothesService.listAllItems();
    List<String> distinctNames = clothesService.getDistinctItemName();
    List<String> distinctSizes = clothesService.getDistinctItemSize();
    model.addAttribute("listOfItems", listOfItems);
    model.addAttribute("distinctName", distinctNames);
    model.addAttribute("distinctSize", distinctSizes);
    model.addAttribute("clothesDTO", new ClothesDTO());
    return "index";
  }

  @PostMapping("/warehouse/summary")
  public String getTheWantedItem(@ModelAttribute ClothesDTO clothesDTO, Model model) {
    Clothes clothes = clothesService.getAllNameAndSize(clothesDTO.getItemName(), clothesDTO.getSize());
    double totalPrice = clothesDTO.getQuantity()* clothes.getPrice();
    model.addAttribute("quantity", clothesDTO.getQuantity());
    model.addAttribute("totalPrice", totalPrice);
    model.addAttribute("price", clothes.getPrice());
    model.addAttribute("clothes", clothes);
    return "summary";
  }
}

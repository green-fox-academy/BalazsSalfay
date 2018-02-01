package comgreenfoxacademy.gfwebshop.controllers;

import comgreenfoxacademy.gfwebshop.models.Response;
import comgreenfoxacademy.gfwebshop.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreRestController {

  @Autowired
  ClothesService clothesService;

  @GetMapping("/warehouse/query")
  public Response getStoreResult(@RequestParam(value ="price", required = false) Double price,
                                 @RequestParam(value ="type", required = false) String type) {
    return clothesService.filterResult(price,type);
  }
}

package comgreenfoxacademy.gfwebshop.service;

import comgreenfoxacademy.gfwebshop.models.Clothes;
import comgreenfoxacademy.gfwebshop.models.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClothesService {

  List<Clothes> listAllItems();
  List<String> getDistinctItemName();
  List<String> getDistinctItemSize();
  Clothes getAllNameAndSize(String name, String size);
  Response filterResult(Double number, String type);
}

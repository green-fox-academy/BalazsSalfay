package comgreenfoxacademy.gfwebshop.service;

import comgreenfoxacademy.gfwebshop.models.Clothes;
import comgreenfoxacademy.gfwebshop.models.Response;
import comgreenfoxacademy.gfwebshop.repositories.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothesServiceImpl implements ClothesService {

  @Autowired
  ClothesRepository clothesRepository;

  @Override
  public List<Clothes> listAllItems() {
    return (List<Clothes>) clothesRepository.findAll();
  }

  @Override
  public List<String> getDistinctItemName() {
    return clothesRepository.getDistinctClothesName();
  }

  @Override
  public List<String> getDistinctItemSize() {
    return clothesRepository.getDistinctClothesSize();
  }

  @Override
  public Clothes getAllNameAndSize(String name, String size) {
    return clothesRepository.findByItemNameAndSize(name,size);
  }

  @Override
  public Response filterResult(Double number, String type) {
    Response response = new Response();
    if (type != null || number == null) {
      if (type.equals("lower")) {
        response.setResult("ok");
        response.setClothes(clothesRepository.getAllByPriceLessThan(number));
        return response;
      } else if (type.equals("higher")) {
        response.setResult("ok");
        response.setClothes(clothesRepository.getAllByPriceGreaterThan(number));
        return response;
      } else if (type.equals("equal")) {
        response.setResult("ok");
        response.setClothes(clothesRepository.getAllByPriceEquals(number));
        return response;
      } else {
        response.setResult("not ok");
        return response;
      }
    }
    response.setResult("not ok");
    return response;
  }
}

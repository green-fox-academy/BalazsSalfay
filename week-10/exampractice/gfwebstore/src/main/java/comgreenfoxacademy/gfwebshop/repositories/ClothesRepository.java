package comgreenfoxacademy.gfwebshop.repositories;

import comgreenfoxacademy.gfwebshop.models.Clothes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothesRepository extends CrudRepository<Clothes, Integer> {

  @Query(value = "SELECT DISTINCT item_name FROM warehouse", nativeQuery = true)
  List<String> getDistinctClothesName();

  @Query(value = "SELECT DISTINCT size FROM warehouse", nativeQuery = true)
  List<String> getDistinctClothesSize();

  Clothes findByItemNameAndSize(String name, String size);
  List<Clothes> getAllByPriceLessThan(Double number);
  List<Clothes> getAllByPriceGreaterThan(Double number);
  List<Clothes> getAllByPriceEquals(Double number);
}

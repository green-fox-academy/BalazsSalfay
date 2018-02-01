package comgreenfoxacademy.gfwebshop.models;

import java.util.List;

public class Response {

  private String result;
  private List<Clothes> clothes;

  public Response() {
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Clothes> getClothes() {
    return clothes;
  }

  public void setClothes(List<Clothes> clothes) {
    this.clothes = clothes;
  }
}

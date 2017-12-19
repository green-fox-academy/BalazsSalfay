
public class GameObject {

  protected String imagePath;

  public GameObject() {
  }

  public GameObject(String imagePath) {
    this.imagePath = imagePath;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }
}
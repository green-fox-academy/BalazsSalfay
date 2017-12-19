import java.awt.*;

public class GameCharacter extends GameObject {

  private int maxHealthpPoint;
  private int currentHealthPoint;
  private int defendPoint;
  private int strikePoint;
  private boolean isAlive;

  public GameCharacter() {
  }

  public GameCharacter(String imagePath, int maxHealthpPoint, int currentHealthPoint, int defendPoint, int strikePoint, boolean isAlive) {
    super(imagePath);
    this.maxHealthpPoint = maxHealthpPoint;
    this.currentHealthPoint = currentHealthPoint;
    this.defendPoint = defendPoint;
    this.strikePoint = strikePoint;
    this.isAlive = isAlive;
  }

  public GameCharacter(String imagePath) {
    super(imagePath);
  }

  public int[] findTheHero(GameObject[][] matrix) {
    int[] heroLocation = new int[2];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] instanceof Hero) {
          heroLocation[0] = i;
          heroLocation[1] = j;
        }
      }
    }
    return heroLocation;
  }

  public GameObject[][] moveHeroRight (GameObject[][]matrix) {
    int[] heroLocation;
    GameCharacter gameElement = new GameCharacter();
    heroLocation = gameElement.findTheHero(matrix);
    if (heroLocation[1] != matrix[0].length - 1) {
      if (!(matrix[heroLocation[0]][heroLocation[1] + 1] instanceof TileWall)) {
        TilePath tilePath = new TilePath();
        matrix[heroLocation[0]][heroLocation[1]] = tilePath;
        Hero hero = new Hero();
        hero.heroturnRight();
        matrix[heroLocation[0]][heroLocation[1] + 1] = hero;
      }
    }
    return matrix;
  }

  public GameObject[][] moveHeroLeft (GameObject[][]matrix) {
    int[] heroLocation;
    GameCharacter gameElement = new GameCharacter();
    heroLocation = gameElement.findTheHero(matrix);
    if (heroLocation[1] != matrix[0].length) {
      if (!(matrix[heroLocation[0]][heroLocation[1] - 1] instanceof TileWall)) {
        TilePath tilePath = new TilePath();
        matrix[heroLocation[0]][heroLocation[1]] = tilePath;
        Hero hero = new Hero();
        hero.heroturnLeft();
        matrix[heroLocation[0]][heroLocation[1] - 1] = hero;
      }
    }
    return matrix;
  }

  public GameObject[][] moveHeroUp (GameObject[][]matrix) {
    int[] heroLocation;
    GameCharacter gameElement = new GameCharacter();
    heroLocation = gameElement.findTheHero(matrix);
    if (heroLocation[0] != matrix.length) {
      if (!(matrix[heroLocation[0] - 1][heroLocation[1]] instanceof TileWall)) {
        TilePath tilePath = new TilePath();
        matrix[heroLocation[0]][heroLocation[1]] = tilePath;
        Hero hero = new Hero();
        hero.heroturnUp();
        matrix[heroLocation[0] - 1][heroLocation[1]] = hero;
      }
    }
    return matrix;
  }

  public GameObject[][] moveHeroDown (GameObject[][]matrix) {
    int[] heroLocation;
    GameCharacter gameElement = new GameCharacter();
    heroLocation = gameElement.findTheHero(matrix);
    if (heroLocation[0] != matrix[1].length - 1) {
      if (!(matrix[heroLocation[0] + 1][heroLocation[1]] instanceof TileWall)) {
        TilePath tilePath = new TilePath();
        matrix[heroLocation[0]][heroLocation[1]] = tilePath;
        Hero hero = new Hero();
        matrix[heroLocation[0] + 1][heroLocation[1]] = hero;
      }
    }
    return matrix;
  }
}


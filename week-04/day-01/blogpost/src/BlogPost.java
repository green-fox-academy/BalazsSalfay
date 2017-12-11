public class BlogPost {

  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  @Override
  public String toString() {
    return  "\"" + title + "\"" + " titled by " + authorName + " posted at " + "\"" + publicationDate + "\"" + "\n" + text;
  }

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }
}



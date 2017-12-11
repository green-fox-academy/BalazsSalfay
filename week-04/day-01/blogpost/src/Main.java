public class Main {

  public static void main(String[] args) {
    BlogPost first = new BlogPost("Steve Gates", "How I builded up Pear",
            "Coloring book everyday carry master cleanse poutine, microdosing cornhole iPhone salvia swag kale chips."
            , "11.06.2017.");
    System.out.println(first);

    System.out.println("");

    BlogPost second = new BlogPost("Bill Jobs", "When I freaked out", "Man braid chartreuse jean shorts" +
            " mumblecore, gentrify pickled jianbing", "17.09.2017.");
    System.out.println(second);
  }
}


  /*Create a BlogPost class that has
        an authorName
        a title
        a text
        a publicationDate
        Create a few blog post objects:
        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
        Lorem ipsum dolor sit amet.
        "Wait but why" titled by Tim Urban posted at "2010.10.10."
        A popular long-form, stick-figure-illustrated blog about almost everything.
        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
        When I asked to take his picture outside one of IBM’s New York City offices,
        he told me that he wasn’t really into the whole organizer profile thing.*/
public class Main {

  public static void main(String[] args) {
    PostIt idea = new PostIt("orange" , "Idea 1", "blue");
    System.out.println(idea);

    PostIt awesome = new PostIt("pink", "Awesome", "black");
    System.out.println(awesome);

    PostIt superB = new PostIt("yellow", "Superb!", "green");
    System.out.println(superB);
  }
}


  /*Create a PostIt class that has
  a backgroundColor
  a text on it
  a textColor
  Create a few example post-it objects:
  an orange with blue text: "Idea 1"
  a pink with black text: "Awesome"
  a yellow with green text: "Superb!"*/
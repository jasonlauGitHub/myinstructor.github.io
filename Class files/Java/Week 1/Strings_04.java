// The String class and its methods

public class Strings {
  public static void main(String[] args) {
    String str = "Java programming";

    System.out.println(str.substring(0, 4));
    System.out.println(str.substring(5));
    System.out.println(str.substring(6, 7));

    System.out.println(str.substring(str.indexOf("p")));
  }
}

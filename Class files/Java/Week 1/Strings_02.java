// The String class and its methods

public class Strings {
  public static void main(String[] args) {
    String s1 = "Hello ";
    String s2 = "world";

    String s3 = s1.concat(s2);

    System.out.println(s3);
    System.out.println(s3.length());

    s3.replace("world", "Java");
    System.out.println(s3);

    System.out.println(s3.toUpperCase());
    System.out.println(s3.toLowerCase());
    System.out.println(s3.startsWith("H"));
    System.out.println(s3.contains("z"));
  }
}

// String class / Strings

/*
 * The String class is final, immutable and doesnt' need to be instantiated
 * with the 'new' operator
 */

public class String_01 {
  public static void main(String[] args) {
    String s1 = new String("Hello ");
    String s2 = "world";
    String s3 = new String(s1 + s2);

    String name = "Mary";
    name = "John";

    System.out.println(name.length());

    System.out.println(name);
  }
}

// The String class

/*
 * The String class is 'final' and immutable
 * We can't change strings
 * StringBuilder
 */

public class Strings {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = new String("world");
    String s3 = s1 + " " + s2;
    char[] chars = {'s', 't', 'r', 'i', 'n', 'g'};

    String s4 = new String(chars);

    System.out.println(s3);
    System.out.println(s4);

    String name = "John";
    System.out.println(name);
    name = "Steve";
    System.out.println(name);
  }
}

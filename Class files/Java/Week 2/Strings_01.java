// String class and its methods


public class Strings_01 {
  public static void main(String[] args) {
    String name1 = "John";
    String name2 = new String("Jack");

    String str = "java is an amazing programming language";

    // Java is case sensitive
    System.out.println(str.startsWith("J"));
    System.out.println(str.startsWith("j"));
    System.out.println(str.endsWith("x"));
    System.out.println(str.contains("g"));
    System.out.println(str.replace('j', 'J'));
    System.out.println(str); // Strings are immutable
  }
}

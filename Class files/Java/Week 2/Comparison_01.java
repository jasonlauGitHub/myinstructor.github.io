// Comparing strings

public class Comparison {
  public static void main(String[] args) {
    String name1 = "John"; // pool of strings
    String name2 = "John";

    System.out.println(name1 == name2); // Checks the reference

    String cat1 = new String("Percy");
    String cat2 = new String("Percy");

    System.out.println(cat1 == cat2);  // false

    System.out.println(cat1.equals(cat2));  // true
  }
}
